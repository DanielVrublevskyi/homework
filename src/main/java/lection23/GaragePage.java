package lection23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GaragePage extends Actions {

    private By addCarButton = By.cssSelector("button.btn-primary");
    private By addCarBrandDropdown = By.id("addCarBrand");
    private By addCarModelDropdown = By.id("addCarModel");
    private By addCarMileage = By.id("addCarMileage");
    private By addButton = By.cssSelector("div.modal-content button.btn-primary");
    private By carName = By.cssSelector("p.car_name");
    private By carUpdateMileage = By.cssSelector("p.car_update-mileage");
    private By carMileage = By.cssSelector("input[name='miles']");
    private By carLogo = By.cssSelector("div.car-logo img");

    public GaragePage clickAddCarButton() {
        waitAndClick(addCarButton);
        return this;
    }

    public GaragePage selectCarBrand(String brand) {
        waitAndSelectBy(addCarBrandDropdown).selectByVisibleText(brand);
        return this;
    }

    public GaragePage selectCarModel(String model) {
        waitAndSelectBy(addCarModelDropdown).selectByVisibleText(model);
        return this;
    }

    public GaragePage enterMileage(String mileage) {
        waitAndEnterData(addCarMileage, mileage);
        return this;
    }

    public GaragePage clickAddButton() {
        waitAndClick(addButton);
        WaitElement.waitInsisibilityOfElementLocatedBy(addButton);
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
