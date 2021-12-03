package baseTest;

import org.junit.Test;

public class CompleteShoppingTest extends BaseTest{

    @Test
    public void completeShoppingTest() throws Exception{
        //pre-conditions
        navigationBar.navigateToLoginPage();
        loginPage.logIn("alitilki111@hotmail.com", "0032549800a");
        navigationBar.navigateToMainPage();
        searchProduct.searchProduct("Çanta");
        navigationBar.navigateAddToCard();
        //pre-conditions

        navigationBar.navigateToCard();
        navigationBar.increaseItemCount();
        navigationBar.completeShopping();
        navigationBar.editCard();

    }
}

