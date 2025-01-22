import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        try {
            driver.findElement(By.cssSelector("button.-guest")).click();
            driver.findElement(sideMenuItemSelector());
            List<WebElement> sideMenuItemsList = new ArrayList<>(driver.findElements(sideMenuItemSelector()));
            for (WebElement element : sideMenuItemsList) {
                System.out.println(element.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    private static By sideMenuItemSelector() {
        return By.cssSelector("nav.sidebar a");
    }
}
