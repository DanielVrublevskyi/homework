package lections23_24;

import org.openqa.selenium.By;

public class HomePage extends Actions {

    private By guestLoginButton = By.cssSelector("button.-guest");

    public HomePage clickGuestLoginButton() {
        waitAndClick(guestLoginButton);
        return this;
    }
}
