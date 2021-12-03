package baseTest;

import org.junit.Test;

public class SeventhBagToCard extends BaseTest {

    @Test
    public void seventhBagToCardTest() throws InterruptedException {
        //pre-conditions
        navigationBar.navigateToLoginPage();
        loginPage.logIn("alitilki111@hotmail.com", "0032549800a");
        //pre-conditions

        navigationBar.navigateToMainPage();
        searchProduct.searchProduct("Çanta");
        navigationBar.navigateAddToCard();

    }

}
