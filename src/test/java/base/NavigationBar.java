package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBar extends BasePage{

    By hoverLoginPage = By.cssSelector("[title='Giriş Yap'] .gekhq4-4");
    By hoverAddToCard = new By.ByXPath("(//*[@class='qjixn8-0 sc-1bydi5r-0 dGNqQc pXiHf sc-1n49x8z-3 bhXnM']) ["+7+"]");
    By hoverToAccount = By.cssSelector("[title='Hesabım'] .gekhq4-4");

    By loginPageButton = By.cssSelector("[data-cy='header-login-button']");
    By addToCardButton = new By.ByXPath("(//*[@class='qjixn8-0 sc-1bydi5r-0 dGNqQc pXiHf sc-1n49x8z-3 bhXnM']) ["+7+"]");
    By toCardButton = By.cssSelector("[title='Sepetim'] .gekhq4-6");
    By completeShoppingButton = new By.ByXPath("//input[@type='submit']");
    By editCardButton = new By.ByXPath("//*[@title='Sepeti Düzenle']");
    By mainPageAfterFavsButton = new By.ByXPath("//*[@alt='GittiGidiyor'] [1]");
    By FavouritesButton = new By.ByXPath("//*[@title='Favorilerim']");
    By mainPageAfterCardButton = new By.ByXPath("//*[@class='logo_gg imglink logo-small']");

    By openDropDown = new By.ByXPath("//select[@class='amount']");


    public NavigationBar(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void navigateToLoginPage() throws InterruptedException {
        hover(hoverLoginPage);
        Thread.sleep(500);
        click(loginPageButton);
    }

    public void navigateToMainPageAfterFavs(){ click(mainPageAfterFavsButton);    }

    public void navigateAddToCard() throws InterruptedException {
        hover((hoverAddToCard));
        Thread.sleep(500);
        click(addToCardButton);
        Thread.sleep(1500);
    }

    public void navigateToCard() {
        click(toCardButton);
    }

    public void increaseItemCount() throws InterruptedException {
        Select increaseItem = new Select(driver.findElement(openDropDown));
        increaseItem.selectByVisibleText("2");
    }

    public void completeShopping(){
        click(completeShoppingButton);
    }

    public void editCard(){ click(editCardButton);}


    public void navigateToMainPageAfterCard(){ click(mainPageAfterCardButton);}

    public void navigateToFavourites() throws InterruptedException {
        hover(hoverToAccount);
        Thread.sleep(500);
        click(FavouritesButton);
    }





}
