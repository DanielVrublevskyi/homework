package lections23_24_27_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static lections23_24_27_28.WaitElement.waitClickabilityOfElementLocatedBy;
import static lections23_24_27_28.WaitElement.waitVisibilityOfElementLocatedBy;

public class PageActions {
    protected WebDriver driver = BrowserFactory.getDriver();

    public void waitAndClick(By by) {
        waitVisibilityOfElementLocatedBy(by);
        waitClickabilityOfElementLocatedBy(by);
        this.driver.findElement(by).click();
    }

    public Select waitAndSelectBy(By by) {
        waitVisibilityOfElementLocatedBy(by);
        waitClickabilityOfElementLocatedBy(by);
        return new Select(this.driver.findElement(by));
    }

    public void waitAndEnterData(By by, String data) {
        waitVisibilityOfElementLocatedBy(by);
        waitClickabilityOfElementLocatedBy(by);
        this.driver.findElement(by).click();
        this.driver.findElement(by).clear();
        this.driver.findElement(by).sendKeys(data);
    }
}
