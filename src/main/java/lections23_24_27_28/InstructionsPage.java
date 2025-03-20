package lections23_24_27_28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class InstructionsPage extends PageActions {

    private By wipersFileDownloadButton = By.xpath("//p[text()='Front windshield wipers on Audi TT']/following-sibling::a");
    private By plugsFileDownloadButton = By.xpath("//p[text()='Spark plugs on Audi TT']/following-sibling::a");
    private By instructions = By.cssSelector("ul.instructions_list");
    private By brandSelectDropdown = By.cssSelector("button#brandSelectDropdown");
    private By brandsInDropdown = By.cssSelector("ul.brand-select-dropdown_menu li");

    public InstructionsPage downloadFile(By by) {
        try {
            waitAndClick(by);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public String getFileNameFromHref(By by) {
        String[] href = driver.findElement(by).getAttribute("href").split("/");
        return href[href.length - 1].replaceAll("%20", " ");
    }

    public InstructionsPage clickBrandSelectDropdown(){
        waitAndClick(brandSelectDropdown);
        return this;
    }

    public InstructionsPage createFile(Path filePath){
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public InstructionsPage writeCarsList(Path filePath){
        List<String> carsList = new ArrayList<>();
        List<WebElement> webElementList = driver.findElements(brandsInDropdown);
        for (WebElement element: webElementList){
            carsList.add(element.getText());
        }
        try {
            Files.write(filePath, carsList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public List<String> readCarsFromFile(Path carsList) {
        List<String> carsListRead;
        try {
            carsListRead = Files.readAllLines(carsList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return carsListRead;
    }

    public By getWipersFileDownloadButton() {
        return wipersFileDownloadButton;
    }

    public By getPlugsFileDownloadButton() {
        return plugsFileDownloadButton;
    }

    public By getInstructions() {
        return instructions;
    }
}
