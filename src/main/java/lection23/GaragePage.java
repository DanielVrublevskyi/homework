package lection23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import static lection23.BrowserFactory.getDriver;

public class GaragePage {

    private By addCarButton = By.cssSelector("button.btn-primary");
    private By addCarBrandDropdown = By.id("addCarBrand");
    private By addCarModelDropdown = By.id("addCarModel");
    private By addCarMileage = By.id("addCarMileage");
    private By addButton = By.cssSelector("div.modal-content button.btn-primary");
    private By carName = By.cssSelector("p.car_name");
    private By carUpdateMileage = By.cssSelector("p.car_update-mileage");
    private By carMileage = By.cssSelector("input[name='miles']");
    private By carLogo = By.cssSelector("div.car-logo img");


    public GaragePage clickAddCarButton(){
        Actions.waitAndClick(addCarButton);
        return this;
    }

    public GaragePage selectCarBrand(String brand){
        Actions.selectBy(addCarBrandDropdown).selectByVisibleText(brand);
        return this;
    }

    public GaragePage selectCarModel(String model){
        Actions.selectBy(addCarModelDropdown).selectByVisibleText(model);
        return this;
    }

    public GaragePage enterMileage(String mileage){
        Actions.enterData(addCarMileage, mileage);
        return this;
    }

    public GaragePage clickAddButton(){
        Actions.waitAndClick(addButton);
        WaitElement.waitInsisibilityOfElementLocatedBy(addButton);
        return this;
    }

    public WebElement getCarName(){
        return getDriver().findElement(carName);
    }

    public WebElement getCarUpdateMileage(){
        return getDriver().findElement(carUpdateMileage);
    }

    public String getCarMileage(){
        return getDriver().findElement(carMileage).getAttribute("value");
    }

    public WebElement getCarLogo(){
        return getDriver().findElement(carLogo);
    }



}
