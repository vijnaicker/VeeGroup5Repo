package Tests;
import org.testng.annotations.Test;

public class AdvancedFormTest extends base {

    @Test
    public void clickLoginButton()throws InterruptedException {
        takesScreenshots.takesSnapShot(driver,"Land Page");
        homePage.clickLoginButton();
    }
    @Test(dependsOnMethods = {"clickLoginButton"})
    public void enterUsernameTests()throws InterruptedException {
       loginPage.enterUsername("vijnaicker@gmail.com");

    }
    @Test(dependsOnMethods = {"enterUsernameTests"})
    public void enterPasswordTests()throws InterruptedException {
        loginPage.enterPassword("vtest@ntest2");

    }
    @Test(dependsOnMethods = {"enterPasswordTests"})
    public void clickSubmitButton()throws InterruptedException {
        loginPage.submitLoginCredentials();

    }
    @Test(dependsOnMethods = {"clickSubmitButton"})
    public void clickLearnButton() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver,"Home Page");
        landingPage.clickLearnButton();

    }
    @Test(dependsOnMethods = {"clickLearnButton"})
    public void clickLearningMaterialsButton() throws InterruptedException {
        landingPage.clickLearningMaterials();

    }
    @Test(dependsOnMethods = {"clickLearningMaterialsButton"})
    public void clickAdvancedFormButton() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver,"Learning Materials Page");
        learningMaterialsPage.clickWebAutomationAdvance();

    }
    @Test(dependsOnMethods = {"clickAdvancedFormButton"})
    public void selectDeviceType() throws InterruptedException {
                inventoryFromPage.selectDeviceType("Phone");

    }
    @Test(dependsOnMethods = {"selectDeviceType"})
    public void selectDeviceBrand() throws InterruptedException {
        inventoryFromPage.selectBrand("Apple");
    }
    @Test(dependsOnMethods = {"selectDeviceBrand"})
    public void clickStorageRadioButton() throws InterruptedException {
        inventoryFromPage.clickStorageRadioButton();

    }
    @Test(dependsOnMethods = {"clickStorageRadioButton"})
    public void selectColor() throws InterruptedException {
        inventoryFromPage.selectColor("Blue");

    }
    @Test(dependsOnMethods = {"selectColor"})
    public void enterQuantity() throws InterruptedException {
        inventoryFromPage.enterQuantity("2");

    }
    @Test(dependsOnMethods = {"enterQuantity"})
    public void enterAddress() throws InterruptedException {
        inventoryFromPage.enterAddress("123 Main St, Anytown, USA");

    }
    @Test(dependsOnMethods = {"enterAddress"})
    public void clickNextButton() throws InterruptedException {
        inventoryFromPage.clickNextButton();

    }
    @Test(dependsOnMethods = {"clickNextButton"})
    public void clickExpressShipping() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver,"Order Preview Page");
        orderPreviewPage.selectExpressShippingOption();

    }
    @Test(dependsOnMethods = {"clickExpressShipping"})
    public void clickOneYearWarranty() throws InterruptedException {
        orderPreviewPage.selectOneYearWarranty();

    }
    @Test(dependsOnMethods = {"clickOneYearWarranty"})
    public void enterDiscountCode() throws InterruptedException {
        orderPreviewPage.enterDiscountCode("SAVE10");

    }
    @Test(dependsOnMethods = {"enterDiscountCode"})
    public void clickApplyDiscountBtn() throws InterruptedException {
        orderPreviewPage.clickApplyDiscountBtn();

    }
    @Test(dependsOnMethods = {"clickApplyDiscountBtn"})
    public void clickConfirmPurchaseBtn() throws InterruptedException {
        orderPreviewPage.clickConfirmPurchaseBtn();

    }
    @Test(dependsOnMethods = {"clickConfirmPurchaseBtn"})
    public void clickViewInvoiceBtn() throws InterruptedException {
       // takesScreenshots.takesSnapShot(driver,"View Invoice Pop-Up");
        orderPreviewPage.clickViewInvoiceBtn();

    }
    @Test(dependsOnMethods = {"clickViewInvoiceBtn"})
    public void clickViewPurchaseInvoiceBtn() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver,"View Invoice History Pop-Up");
        orderPreviewPage.clickViewPurchaseInvoiceBtn();

    }
}
