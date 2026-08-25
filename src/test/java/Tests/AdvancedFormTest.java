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
    @Test(dependsOnMethods = {"selectDeviceBrand"})
    public void clickStorageRadioButton() throws InterruptedException {
        inventoryFromPage.clickStorageRadioButton();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickStorageRadioButton"})
    public void selectColor() throws InterruptedException {
        inventoryFromPage.selectColor("Blue");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"selectColor"})
    public void enterQuantity() throws InterruptedException {
        inventoryFromPage.enterQuantity("2");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"enterQuantity"})
    public void enterAddress() throws InterruptedException {
        inventoryFromPage.enterAddress("123 Main St, Anytown, USA");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"enterAddress"})
    public void clickNextButton() throws InterruptedException {
        inventoryFromPage.clickNextButton();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickNextButton"})
    public void clickExpressShipping() throws InterruptedException {
        orderPreviewPage.selectExpressShippingOption();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickExpressShipping"})
    public void clickOneYearWarranty() throws InterruptedException {
        orderPreviewPage.selectOneYearWarranty();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickOneYearWarranty"})
    public void enterDiscountCode() throws InterruptedException {
        orderPreviewPage.enterDiscountCode("SAVE10");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"enterDiscountCode"})
    public void clickApplyDiscountBtn() throws InterruptedException {
        orderPreviewPage.clickApplyDiscountBtn();
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = {"clickApplyDiscountBtn"})
    public void clickConfirmPurchaseBtn() throws InterruptedException {
        orderPreviewPage.clickConfirmPurchaseBtn();
        Thread.sleep(2000);
    }

}
