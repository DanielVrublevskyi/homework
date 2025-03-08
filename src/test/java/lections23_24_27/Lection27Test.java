package lections23_24_27;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static lections23_24_27.BrowserFactory.getDriver;

public class Lection27Test {
    @BeforeMethod
    public void setup() {
        BrowserFactory.createDriver("chrome");
        getDriver().get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        BrowserFactory.tearDown();
    }

    @DataProvider
    public Object[][] credentials(){
        return new Object[][]{
                {"test@hillel.ua", "1111"},
                {"test@hillel.ua", "1234"}
        };
    }
    @Test(dataProvider = "credentials")
    public void loginFailureTest(String email, String password){
        HomePage homePage = new HomePage().clickSignInButton()
                .enterEmail(email)
                .enterPassword(password)
                .clickLoginButton();
        Assert.assertTrue(homePage.isLoginErrorDisplayed());
    }

}
