package lection19;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lection19Tests {

    ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    void logoDisplayingTest() {
        WebElement logo = driver.findElement(By.cssSelector("a.header_logo"));
        try {
            if (logo.isDisplayed()) {
                System.out.println("Logo displayed");
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Logo does not displayed");
        }
    }

    @Test
    void signUpColorTest() {
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
        if (signUpButton.getCssValue("background-color").equalsIgnoreCase("rgba(2, 117, 216, 1)")) {
            System.out.println("Background color of Sign up button is correct");
        } else {
            System.out.println("Background color of Sign up button is incorrect");
        }
    }
}
