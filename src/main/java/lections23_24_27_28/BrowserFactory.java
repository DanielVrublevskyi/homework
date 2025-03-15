package lections23_24_27_28;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    private static WebDriver driver;

    private static ChromeOptions setChromeOptions(){
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("download.default_directory", "C:\\Users\\Daniel\\Documents\\GitHub\\homework\\target");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        return options;
    }

    public static void createDriver(String browserName){
        switch (browserName.toLowerCase()) {
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(setChromeOptions());
                driver.manage().window().maximize();
                break;
            case "remote chrome" :
                WebDriverManager.chromedriver().setup();
                try {
                    driver = new RemoteWebDriver(new URL("http://192.168.1.12:4444"), setChromeOptions());
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Remote driver started");
                driver.manage().window().maximize();
                break;
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
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
