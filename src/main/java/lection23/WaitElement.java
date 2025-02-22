package lection23;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static lection23.BrowserFactory.getDriver;

public class WaitElement {
    private static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public static void waitVisibilityOfElementLocatedBy(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitClickabilityOfElementLocatedBy(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitInsisibilityOfElementLocatedBy(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
}
