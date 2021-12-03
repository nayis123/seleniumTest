package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProduct extends BasePage{

    By searchProductId = By.className("sc-14oyvky-0");
    By findProductClick = By.className("sc-1bydi5r-0");

    public SearchProduct(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void searchProduct(String nameOfProduct) throws InterruptedException {
        sendKey(searchProductId,nameOfProduct);
        click(findProductClick);
        //Thread.sleep(1000);
        //scroll();
        //Thread.sleep(1000);
        //randomFourFavourite();
        //Thread.sleep(1000);
        //driver.get("https://www.gittigidiyor.com/");
    }


}
