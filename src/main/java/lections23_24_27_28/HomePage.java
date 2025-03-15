package lections23_24_27_28;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends PageActions {

    private By guestLoginButton = By.cssSelector("button.-guest");
    private By signInButton = By.cssSelector("button.header_signin");
    private By emailField = By.id("signinEmail");
    private By passwordField = By.id("signinPassword");
    private By loginButton = By.xpath("//button[@class='btn btn-primary']");
    private By loginError = By.cssSelector("p.alert-danger");

    @Step("Click on 'Guest login' button")
    public HomePage clickGuestLoginButton() {
        waitAndClick(guestLoginButton);
        return this;
    }

    @Step("Click on 'Sign in' button")
    public HomePage clickSignInButton() {
        waitAndClick(signInButton);
        return this;
    }

    @Step("Enter Email")
    public HomePage enterEmail(String email){
        waitAndEnterData(emailField, email);
        return this;
    }

    @Step("Enter Password")
    public HomePage enterPassword(String password){
        waitAndEnterData(passwordField, password);
        return this;
    }

    @Step("Click on 'Login' button")
    public HomePage clickLoginButton() {
        waitAndClick(loginButton);
        return this;
    }

    public boolean isLoginErrorDisplayed(){
        WaitElement.waitVisibilityOfElementLocatedBy(loginError);
        return BrowserFactory.getDriver().findElement(loginError).isDisplayed();
    }
}
