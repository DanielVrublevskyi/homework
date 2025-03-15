package lections23_24_27_28;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GaragePage extends PageActions {

    private By addCarButton = By.cssSelector("button.btn-primary");
    private By addCarBrandDropdown = By.id("addCarBrand");
    private By addCarModelDropdown = By.id("addCarModel");
    private By addCarMileage = By.id("addCarMileage");
    private By addButton = By.cssSelector("div.modal-content button.btn-primary");
    private By carName = By.cssSelector("p.car_name");
    private By carUpdateMileage = By.cssSelector("p.car_update-mileage");
    private By carMileage = By.cssSelector("input[name='miles']");
    private By carLogo = By.cssSelector("div.car-logo img");
    private By instructions = By.cssSelector("a[routerlink='instructions']");

    @Step("Click 'Add car' button")
    public GaragePage clickAddCarButton() {
        waitAndClick(addCarButton);
        return this;
    }

    @Step("Select car's brand")
    public GaragePage selectCarBrand(String brand) {
        waitAndSelectBy(addCarBrandDropdown).selectByVisibleText(brand);
        return this;
    }

    @Step("Select car's model")
    public GaragePage selectCarModel(String model) {
        waitAndSelectBy(addCarModelDropdown).selectByVisibleText(model);
        return this;
    }

    @Step("Enter mileage")
    public GaragePage enterMileage(String mileage) {
        waitAndEnterData(addCarMileage, mileage);
        return this;
    }

    @Step("Click 'Add' button")
    public GaragePage clickAddButton() {
        waitAndClick(addButton);
        WaitElement.waitInsisibilityOfElementLocatedBy(addButton);
        return this;
    }

    public GaragePage clickInstructions() {
        waitAndClick(instructions);
        return this;
    }

    public WebElement getCarName() {
        return driver.findElement(carName);
    }

    public WebElement getCarUpdateMileage() {
        return driver.findElement(carUpdateMileage);
    }

    public String getCarMileage() {
        return driver.findElement(carMileage).getAttribute("value");
    }

    public WebElement getCarLogo() {
        return driver.findElement(carLogo);
    }
}
