package baseTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeventhBagToCard extends BaseTest {

    @Test
    public void seventhBagToCardTest() throws InterruptedException {
        navigationBar.navigateToLoginPage();
        loginPage.girisYap("alitilki111@hotmail.com", "0032549800a");

        Thread.sleep(2000);
        searchProduct.searchProduct("Elma");
        basePage.scroll();
        basePage.randomFourFavourite();

        navigationBar.navigateToMainPageAfterFavs();
        searchProduct.searchProduct("Çanta");
        Thread.sleep(2000);

        //By closeCookies = By.className("tyj39b-5");
        //basePage.click(closeCookies);

        navigationBar.navigateAddToCard();
        navigationBar.navigateToCard();

        navigationBar.increaseItemCount();
        Thread.sleep(1000);
        navigationBar.completeShopping();
        Thread.sleep(1000);
        navigationBar.editCard();





    }
}
