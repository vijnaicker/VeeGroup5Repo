package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
