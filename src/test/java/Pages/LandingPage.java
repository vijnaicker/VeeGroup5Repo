package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Learn')]")
    WebElement learnButton;
    @FindBy(xpath = "//span[contains(text(),'Learning Materials')]")
    WebElement learningMaterialsButton;
    @FindBy(xpath = "//span[contains(text(),'My Learning')]")
    WebElement myLearningTab;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }



    public void clickLearnButton() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(myLearningTab));
        myLearningTab.isDisplayed();
        learnButton.click();
    }
    public void clickLearningMaterials() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(learningMaterialsButton));
        learningMaterialsButton.click();
    }

}









/*
   @Test (priority = 4)
    public void clickLearn() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
        //Thread.sleep(5000);
    }
    ///html/body/div/div/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]
    @Test (priority = 5)
    public void verifyLearningMaterials() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).isDisplayed();
        Thread.sleep(5000);
    }

    @Test (priority = 6)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        Thread.sleep(5000);
 */