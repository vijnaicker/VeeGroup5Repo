package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPreviewPage {
    WebDriver driver;
    public OrderPreviewPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(id="shipping-option-express")
    WebElement expressShippingOption;
    @FindBy(id="warranty-1yr")
    WebElement oneYearWarranty;
    @FindBy(id="discount-code")
    WebElement discountCode;
    @FindBy(id="apply-discount-btn")
    WebElement applyDiscountBtn;
    @FindBy(id="purchase-device-btn")
    WebElement confirmPurchaseBtn;


    public void selectExpressShippingOption() {
        expressShippingOption.click();
    }
    public void selectOneYearWarranty() {
        oneYearWarranty.click();
    }
    public void enterDiscountCode(String code) {
        discountCode.sendKeys(code);
    }
    public void clickApplyDiscountBtn() {
        applyDiscountBtn.click();
    }
    public void clickConfirmPurchaseBtn() {
        confirmPurchaseBtn.click();
    }
}
