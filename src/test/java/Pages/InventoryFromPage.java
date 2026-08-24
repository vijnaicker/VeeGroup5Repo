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

    public void selectDeviceType(String deviceType) {
        deviceTypeDropdown.sendKeys(deviceType);
    }
}
