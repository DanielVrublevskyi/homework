package lections23_24_27;

import listener.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static lections23_24_27.BrowserFactory.getDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners(TestListener.class)
public class Lection24Test {

    @BeforeMethod
    public void setup() {
        BrowserFactory.createDriver("chrome");
        getDriver().get("https://guest:welcome2qauto@qauto.forstudy.space/");
        new HomePage().clickGuestLoginButton();
        assertEquals(getDriver().getCurrentUrl(), "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage");
        new GaragePage().clickInstructions();
    }

    @AfterMethod
    public void tearDown() {
       BrowserFactory.tearDown();
    }

    @Test
    public void downloadWipersFileTest() {
        InstructionsPage instructionsPage = new InstructionsPage();
        WaitElement.fluentVisibilityOfElementLocated(instructionsPage.getInstructions());
        String fileName = instructionsPage.getFileNameFromHref(instructionsPage.getWipersFileDownloadButton());
        instructionsPage.downloadFile(instructionsPage.getWipersFileDownloadButton());
        assertTrue(Files.exists(Paths.get("target/" + fileName)));
    }

    @Test(description = "Additional test to check downloadFile() with different files")
    public void downloadPlugsFileTest() {
        InstructionsPage instructionsPage = new InstructionsPage();
        WaitElement.fluentVisibilityOfElementLocated(instructionsPage.getInstructions());
        String fileName = instructionsPage.getFileNameFromHref(instructionsPage.getPlugsFileDownloadButton());
        instructionsPage.downloadFile(instructionsPage.getPlugsFileDownloadButton());
        assertTrue(Files.exists(Paths.get("target/" + fileName)));
    }

    @Test
    public void writeCarsListTest() {
        InstructionsPage instructionsPage = new InstructionsPage();
        WaitElement.fluentVisibilityOfElementLocated(instructionsPage.getInstructions());
        Path carsList = Paths.get("target/carsList.txt");
        instructionsPage.clickBrandSelectDropdown()
                .createFile(carsList)
                .writeCarsList(carsList);
        List<String> carsListRead = instructionsPage.readCarsFromFile(carsList);
        List<String> expectedCarsList = List.of("Audi", "BMW", "Ford", "Porsche", "Fiat");
        assertEquals(carsListRead, expectedCarsList);
    }

}
