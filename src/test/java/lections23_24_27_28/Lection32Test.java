package lections23_24_27_28;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static lections23_24_27_28.BrowserFactory.getDriver;

public class Lection32Test {

    @AfterMethod
    public void tearDown() {
        BrowserFactory.tearDown();
    }

    @DataProvider
    public Object[][] browsers(){
        return new Object[][]{
                {"chrome"},
                {"firefox"}
        };
    }
    @Test(dataProvider = "browsers")
    public void loginFailureTest(String browserName){
        BrowserFactory.createDriver(browserName);
        getDriver().get("https://guest:welcome2qauto@qauto.forstudy.space/");
        HomePage homePage = new HomePage().clickSignInButton()
                .enterEmail("test@hillel.ua")
                .enterPassword("1111")
                .clickLoginButton();
        Assert.assertTrue(homePage.isLoginErrorDisplayed());
    }

}
