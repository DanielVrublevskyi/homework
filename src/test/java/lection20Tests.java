import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class lection20Tests {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void titleWaitTest() {
        wait.until(ExpectedConditions.titleIs("Hillel Qauto"));
        System.out.println("'Hillel Qauto' title is present");
    }

    @Test
    public void jsClickTest() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement guestLoginButton = driver.findElement(By.cssSelector("button.header-link.-guest"));
        jsExecutor.executeScript("arguments[0].click();", guestLoginButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.panel-page")));
        Assert.assertTrue(driver.findElement(By.id("userNavDropdown")).isDisplayed(), "'My profile' dropdown is displayed");
    }

    @Test
    public void addCarButtonWaitTest() {
        driver.findElement(By.cssSelector("button.header-link.-guest")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add car']")));
        System.out.println("'Add car' is clickable");
    }
}
