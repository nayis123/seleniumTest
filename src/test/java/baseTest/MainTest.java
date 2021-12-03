package baseTest;

import org.junit.Test;

public class MainTest extends BaseTest{

    @Test
    public void mainTest() throws InterruptedException {
        navigationBar.navigateToLoginPage();
        loginPage.logIn("alitilki111@hotmail.com", "0032549800a");

        searchProduct.searchProduct("Elma");
        basePage.scroll();
        basePage.randomFourFavourite();

        navigationBar.navigateToMainPage();
        searchProduct.searchProduct("Çanta");
        navigationBar.navigateAddToCard();

        navigationBar.navigateToCard();
        navigationBar.increaseItemCount();
        navigationBar.completeShopping();
        navigationBar.editCard();
    }

}


