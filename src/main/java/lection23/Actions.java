package lection23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static lection23.WaitElement.waitClickabilityOfElementLocatedBy;
import static lection23.WaitElement.waitVisibilityOfElementLocatedBy;

public class Actions {
    private static WebDriver driver = BrowserFactory.getDriver();


    public static void waitAndClick(By by) {
        waitVisibilityOfElementLocatedBy(by);
        waitClickabilityOfElementLocatedBy(by);
        driver.findElement(by).click();
    }

    public static Select selectBy(By by) {
        waitVisibilityOfElementLocatedBy(by);
        waitClickabilityOfElementLocatedBy(by);
        return new Select(driver.findElement(by));
    }

    public static void enterData(By by, String data) {
        waitVisibilityOfElementLocatedBy(by);
        waitClickabilityOfElementLocatedBy(by);
        driver.findElement(by).click();
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(data);
    }
}
