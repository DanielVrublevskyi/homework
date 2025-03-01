package lection26;

import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static lection26.BrowserFactory.getWebDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Lection26Test {
    @Step("Open 'Hillel auto' site")
    @BeforeMethod
    public void setup() {
        BrowserFactory.createDriver("chrome");
        getWebDriver().get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @Step("Close the browser")
    @AfterMethod
    public void tearDown() {
        BrowserFactory.tearDown();
    }

    @Test
    @Description("Add car to garage test")
    @Owner("Daniel")
    @Link(name = "Homework task",url = "https://lms.ithillel.ua/groups/66cd85d4f513b6da3c302f93/homeworks/67a9b2055e560842bc56133d")
    @Severity(SeverityLevel.CRITICAL)
    public void addCarToGarageTest() {
        String miles = "20";
        new HomePage().clickGuestLoginButton();
        assertEquals(getWebDriver().getCurrentUrl(), "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage");
        GaragePage garagePage = new GaragePage()
                .clickAddCarButton()
                .selectCarBrand("Audi")
                .selectCarModel("TT")
                .enterMileage(miles)
                .clickAddButton();
        assertEquals(garagePage.getCarName().getText(), "Audi TT");
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        assertTrue(garagePage.getCarUpdateMileage().getText().contains(dateFormat.format(date)));
        assertEquals(garagePage.getCarMileage(), miles);
        assertTrue(garagePage.getCarLogo().isDisplayed());
        assertTrue(garagePage.getCarLogo().getAttribute("src").endsWith("png"));
    }
}
