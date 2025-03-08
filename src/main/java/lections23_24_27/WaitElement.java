package lections23_24_27;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import static lections23_24_27.BrowserFactory.getDriver;

public class WaitElement {
    private static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public static void waitVisibilityOfElementLocatedBy(By by) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitClickabilityOfElementLocatedBy(By by) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitInsisibilityOfElementLocatedBy(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static WebElement fluentVisibilityOfElementLocated(By by) {
        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        return wait.until(webDriver -> getDriver().findElement(by));
    }

    public Boolean waitForDownload(String filePath){
        return wait.until(webDriver -> Files.exists(Paths.get(filePath)));
    }

}