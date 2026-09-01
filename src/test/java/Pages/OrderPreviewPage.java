package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OrderPreviewPage {
    WebDriver driver;
    public OrderPreviewPage(WebDriver driver) {
        this.driver = driver;
    }
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
    @FindBy(xpath = "//button[contains(normalize-space(.),'View')]")
    WebElement viewInvoiceHistoryBtn;
    @FindBy(id="device-summary")
    WebElement deviceSummary;
    @FindBy(id="discount-feedback")
    WebElement discountFeedback;
    @FindBy(id="purchase-success-toast")
    WebElement purchaseSuccessToast;

    public void selectExpressShippingOption() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(deviceSummary));
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
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(discountFeedback));
        confirmPurchaseBtn.click();
    }
    public void clickViewInvoiceBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(purchaseSuccessToast));
        viewInvoiceBtn.click();
    }
    public void clickViewPurchaseInvoiceBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(viewInvoiceHistoryBtn));
        viewInvoiceHistoryBtn.click();
    }
}
