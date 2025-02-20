package lection23;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static lection23.BrowserFactory.getDriver;
import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class Lection23Tests {
    @BeforeMethod
    public void setup() {
        BrowserFactory.createDriver("chrome");
        getDriver().get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        BrowserFactory.tearDown();
    }

    @Test
    public void addCarToGarageTest() {
        String miles = "20";
        new HomePage().clickGuestLoginButton();
        assertEquals(getDriver().getCurrentUrl(), "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage");
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
        assertTrue(garagePage.getCarLogo().isDisplayed());
        assertTrue(garagePage.getCarLogo().getAttribute("src").endsWith("png"));
//        assertEquals(garagePage.getCarMileage().getText(), miles);
    }
}
