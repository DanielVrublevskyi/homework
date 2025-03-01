package lection26;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class GaragePage {
    private final SelenideElement addCarButton = $("button.btn-primary");
    private final SelenideElement addCarBrandDropdown = $("#addCarBrand");
    private final SelenideElement addCarModelDropdown = $("#addCarModel");
    private final SelenideElement addCarMileage = $("#addCarMileage");
    private final SelenideElement addButton = $("div.modal-content button.btn-primary");
    private final SelenideElement carName = $("p.car_name");
    private final SelenideElement carUpdateMileage = $("p.car_update-mileage");
    private final SelenideElement carMileage = $("input[name='miles']");
    private final SelenideElement carLogo = $("div.car-logo img");

    @Step("Click 'Add car' button")
    public GaragePage clickAddCarButton() {
        addCarButton.click();
        return this;
    }

    @Step("Select car's brand")
    public GaragePage selectCarBrand(String brand) {
        addCarBrandDropdown.selectOptionContainingText(brand);
        return this;
    }

    @Step("Select car's model")
    public GaragePage selectCarModel(String model) {
        addCarModelDropdown.selectOptionContainingText(model);
        return this;
    }

    @Step("Enter mileage")
    public GaragePage enterMileage(String mileage) {
        addCarMileage.setValue(mileage);
        return this;
    }

    @Step("Click 'Add' button")
    public GaragePage clickAddButton() {
        addButton.click();
        addButton.shouldNotBe(Condition.visible);
        return this;
    }

    public SelenideElement getCarName() {
        return carName;
    }

    public WebElement getCarUpdateMileage() {
        return carUpdateMileage;
    }

    public String getCarMileage() {
        return carMileage.getAttribute("value");
    }

    public WebElement getCarLogo() {
        return carLogo;
    }
}
