package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryFromPage {

    WebDriver driver;
    public InventoryFromPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id="deviceType")
    WebElement deviceTypeDropdown;
    @FindBy(id="brand")
    WebElement brandDropdown;
    @FindBy(xpath = "//span[contains(text(),'128GB')]")
    WebElement storageRadioButton;


    public void selectDeviceType(String deviceType) {
        deviceTypeDropdown.sendKeys(deviceType);
    }
    public void selectBrand(String brand) {
        brandDropdown.sendKeys(brand);
    }
    public void clickStorageRadioButton() {
        storageRadioButton.click();
    }
}
