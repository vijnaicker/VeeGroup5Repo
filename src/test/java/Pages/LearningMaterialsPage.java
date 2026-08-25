package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningMaterialsPage {

    WebDriver driver;

    public LearningMaterialsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//span[contains(text(),'Web Automation Advance')]")
    WebElement webAutomationAdvanceButton;

    public void clickWebAutomationAdvance() {
        webAutomationAdvanceButton.click();
    }
}
