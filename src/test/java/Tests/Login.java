package Tests;

import org.testng.annotations.Test;

public class Login extends base {

    @Test
    public void loginToNdosiWebsite() {
        homePage.clickLoginButton();
    }


}
