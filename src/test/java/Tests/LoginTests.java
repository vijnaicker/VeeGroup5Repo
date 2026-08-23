package Tests;
import Pages.LandingPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends base {

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

}
