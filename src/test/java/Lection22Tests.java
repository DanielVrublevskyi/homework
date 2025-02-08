import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class Lection22Tests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void titleTest() {
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.hero-video_frame")));
        String title = driver.findElement(By.cssSelector("div.ytp-title-text")).getText();
        try {
        assertEquals(title, "Як потрапити у майбутнє? Трансформація навчання.");
        } catch (AssertionError e) {
            fail("Title doesn’t equal to the expected result");
        }
    }

    @Test
    public void footerTest() {
        driver.manage().window().maximize();
        List<WebElement> socialLinks = driver.findElements(By.cssSelector("div.contacts_socials a"));
        try {
            assertEquals(socialLinks.size(), 5);
        } catch (AssertionError e) {
            fail("Social network block doesn’t contain 5 items ");
        }
        String mainWindow = driver.getWindowHandle();
        String[] socialLinksUrls = {"https://www.facebook.com/Hillel.IT.School", "https://t.me/ithillel_kyiv",
                "https://www.youtube.com/user/HillelITSchool", "https://www.instagram.com/hillel_itschool/",
                "https://www.linkedin.com/"};
        int i = 0;
        for (WebElement socialLink : socialLinks) {
            socialLink.click();
            List<String> windowsList = new ArrayList<>(driver.getWindowHandles());
            try {
                assertEquals(windowsList.size(), 2);
            } catch (AssertionError e) {
                fail("New tab did not open after clicking");
            }
            driver.switchTo().window(windowsList.get(1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                assertTrue(driver.getCurrentUrl().contains(socialLinksUrls[i]));
            } catch (AssertionError e) {
                fail("Incorrect url of Social network");
            }
            i++;
            driver.close();
            driver.switchTo().window(mainWindow);
        }
    }
}
