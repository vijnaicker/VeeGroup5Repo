package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.launchBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public LearningMaterialsPage learningMaterialsPage = PageFactory.initElements(driver, LearningMaterialsPage.class);
    public InventoryFromPage inventoryFromPage = PageFactory.initElements(driver, InventoryFromPage.class);
    public OrderPreviewPage orderPreviewPage = PageFactory.initElements(driver, OrderPreviewPage.class);
    public TakesScreenshots takesScreenshots = new TakesScreenshots();
}
