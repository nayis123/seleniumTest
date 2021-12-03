package baseTest;

import org.junit.Test;

public class RandomFourProductTest extends BaseTest{

    @Test
    public void searchTest() throws InterruptedException {
        //pre-conditions
        navigationBar.navigateToLoginPage();
        loginPage.logIn("alitilki111@hotmail.com", "0032549800a");
        //pre-conditions

        searchProduct.searchProduct("Elma");
        basePage.scroll();
        basePage.randomFourFavourite();
    }
}

