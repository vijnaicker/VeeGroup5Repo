package Tests;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends base {

    @Test
    public void clickLoginButton()throws InterruptedException {
        homePage.clickLoginButton();
    }
    @Test
    public void enterUsernameTests(){
       loginPage.enterUsername("vijnaicker@gmail.com");
       Thread.sleep(2000);
    }
    @Test
    public void enterPasswordTests(){
        loginPage.enterPassword("vtest@ntest2");
        Thread.sleep(2000);
    }
    /*@Test
    public void clickSubmitButton()throws InterruptedException {
        loginPage.submitLoginCredentials();
        Thread.sleep(2000);
    }*/
}
