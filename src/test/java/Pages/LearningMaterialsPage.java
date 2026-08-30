package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearningMaterialsPage {

    WebDriver driver;

    public LearningMaterialsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//span[contains(text(),'Web Automation Advance')]")
    WebElement webAutomationAdvanceButton;

    public void clickWebAutomationAdvance() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(webAutomationAdvanceButton));
        webAutomationAdvanceButton.click();
    }
}
