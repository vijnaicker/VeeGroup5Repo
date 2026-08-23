package Tests;
//import Pages.LandingPage;
//import Pages.LoginPage;
import org.testng.annotations.Test;

public class LandingPageTests extends LoginTests {

    @Test/*(dependsOnMethods = {"clickSubmitButton"})*/
    public void clickLearnButton() throws InterruptedException {
        landingPage.clickLearnButton();
        Thread.sleep(2000);

    }
}
