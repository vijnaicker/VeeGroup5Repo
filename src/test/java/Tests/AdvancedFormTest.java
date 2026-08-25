package Tests;
import org.testng.annotations.Test;

public class AdvancedFormTest extends base {

    @Test
    public void clickLoginButton()throws InterruptedException {
        homePage.clickLoginButton();
    }
    @Test(dependsOnMethods = {"clickLoginButton"})
    public void enterUsernameTests()throws InterruptedException {
       loginPage.enterUsername("vijnaicker@gmail.com");
       Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"enterUsernameTests"})
    public void enterPasswordTests()throws InterruptedException {
        loginPage.enterPassword("vtest@ntest2");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"enterPasswordTests"})
    public void clickSubmitButton()throws InterruptedException {
        loginPage.submitLoginCredentials();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickSubmitButton"})
    public void clickLearnButton() throws InterruptedException {
        landingPage.clickLearnButton();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickLearnButton"})
    public void clickLearningMaterialsButton() throws InterruptedException {
        landingPage.clickLearningMaterials();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickLearningMaterialsButton"})
    public void clickAdvancedFormButton() throws InterruptedException {
        learningMaterialsPage.clickWebAutomationAdvance();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickAdvancedFormButton"})
    public void selectDeviceType() throws InterruptedException {
        inventoryFromPage.selectDeviceType("Phone");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"selectDeviceType"})
    public void selectDeviceBrand() throws InterruptedException {
        inventoryFromPage.selectBrand("Apple");
        Thread.sleep(2000);}
}
