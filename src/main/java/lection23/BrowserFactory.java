package lection23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    private static WebDriver driver;

    public static void createDriver(String browserName){
        switch (browserName.toLowerCase()) {
            case "chrome" : WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox" : WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default : throw new IllegalArgumentException("This browser name");
        };
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void tearDown(){
        driver.quit();
    }
}
