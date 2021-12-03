package baseTest;

import org.junit.Test;

public class SearchProductTest extends BaseTest{

    @Test
    public void searchTest() throws InterruptedException {
        //pre-conditions
        navigationBar.navigateToLoginPage();
        loginPage.girisYap("alitilki111@hotmail.com", "0032549800a");

        Thread.sleep(2000);
        searchProduct.searchProduct("Elma");
        basePage.scroll();
        basePage.randomFourFavourite();
        Thread.sleep(1000);

    }

}
