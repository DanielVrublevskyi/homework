package lections23_24_27_28;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static lections23_24_27_28.BrowserFactory.getDriver;

public class Lection28Tests {
    @BeforeMethod
    public void setup() {
        BrowserFactory.createDriver("remote chrome");
        getDriver().get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        BrowserFactory.tearDown();
    }


    @Test
    public void loginFailureTest(){
        HomePage homePage = new HomePage().clickSignInButton()
                .enterEmail("test@hillel.ua")
                .enterPassword("1111")
                .clickLoginButton();
        Assert.assertTrue(homePage.isLoginErrorDisplayed());
    }
}
