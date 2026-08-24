package Tests;

import Pages.HomePage;
import Pages.LandingPage;
import Pages.LearningMaterialsPage;
import Pages.LoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.launchBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public LearningMaterialsPage learningMaterialsPage = PageFactory.initElements(driver, LearningMaterialsPage.class);

}
