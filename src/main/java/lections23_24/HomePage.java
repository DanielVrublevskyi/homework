package lections23_24;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends PageActions {

    private By guestLoginButton = By.cssSelector("button.-guest");

    @Step("Click on 'Guest login button'")
    public HomePage clickGuestLoginButton() {
        waitAndClick(guestLoginButton);
        return this;
    }
}
