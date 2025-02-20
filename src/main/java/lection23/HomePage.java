package lection23;

import org.openqa.selenium.By;

public class HomePage {

    private By guestLoginButton = By.cssSelector("button.-guest");

    public HomePage clickGuestLoginButton() {
        Actions.waitAndClick(guestLoginButton);
        return this;
    }
}
