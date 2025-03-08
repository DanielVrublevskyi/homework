package lection26;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    private static WebDriver driver;

    public static void createDriver(String browserName) {
        WebDriverManager.chromedriver().setup();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("download.default_directory", "C:\\Users\\Daniel\\Documents\\GitHub\\homework\\target");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        Configuration.reportsFolder = "target/selenideReports";
    }

    public static WebDriver getWebDriver() {
        return WebDriverRunner.getWebDriver();
    }

    public static void tearDown() {
        driver.quit();
    }
}
