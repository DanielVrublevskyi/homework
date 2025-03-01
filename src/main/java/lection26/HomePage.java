package lection26;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement guestLoginButton = $("button.-guest");

    @Step("Click on 'Guest login button'")
    public HomePage clickGuestLoginButton() {
        guestLoginButton.click();
        return this;
    }
}
