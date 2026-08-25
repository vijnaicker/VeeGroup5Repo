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
    @FindBy(id="view-history-btn")
    WebElement viewInvoiceBtn;
    @FindBy(id="view-invoice-INV-1787675701119")
    WebElement clickViewPurchaseInvoiceBtn;

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
    public void clickViewInvoiceBtn() {
        viewInvoiceBtn.click();
    }
    public void clickViewPurchaseInvoiceBtn() {
        clickViewPurchaseInvoiceBtn.click();
    }
}
