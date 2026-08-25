package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

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
    @FindBy(id="color")
    WebElement colorDropdown;
    @FindBy(id="quantity")
    WebElement quantityInput;
    @FindBy(id="address")
    WebElement addressInput;
    @FindBy(id="inventory-next-btn")
    WebElement nextButton;

    public void selectDeviceType(String deviceType) {
        deviceTypeDropdown.sendKeys(deviceType);
    }
    public void selectBrand(String brand) {
        brandDropdown.sendKeys(brand);
    }
    public void clickStorageRadioButton() {
        storageRadioButton.click();
    }
    public void selectColor(String color) {
        colorDropdown.sendKeys(color);
    }
    public void enterQuantity(String quantity) {
        quantityInput.sendKeys(quantity);
    }
    public void enterAddress(String address) {
        addressInput.sendKeys(address);
    }
    public void clickNextButton() {
        nextButton.click();
    }

}
