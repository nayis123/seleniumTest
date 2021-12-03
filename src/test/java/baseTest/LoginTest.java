package baseTest;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        navigationBar.navigateToLoginPage();
        loginPage.logIn("alitilki111@hotmail.com", "0032549800a");
    }
}

