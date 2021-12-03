package base;

import baseTest.BaseTest;
import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePage  extends BaseTest {
    protected WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }


    //web element islemleri
    //------------
    public WebElement find(By path){
        WebElement element = driver.findElement(path);
        return element;
    }

    public void click(By path){
        find(path).click();
    }

    public void hover(By path){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(path)).perform();
    }

    public void sendKey(By path, String message){
        find(path).sendKeys(message);
    }

    //-----Scroll Down-----
    public void scroll() throws InterruptedException {
        By closeCookies = By.className("tyj39b-5");
        click(closeCookies);

        WebElement element = driver.findElement(By.xpath("//*[@aria-label='1. sayfa']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(1000);
    }

    //-----Add 4 Random Product to Favourites-----
    public void randomFourFavourite() throws InterruptedException {
        //ArrayList<Integer> products = new ArrayList<Integer>();
        Random rand = new Random();
        int i=0;
        while (i!= 4){
            int products=  rand.nextInt(32)+1;
            System.out.println(products);
            By favourite1 = new By.ByXPath("(//div[@class='ndodpt-1 bgCibU sc-1n49x8z-13 ceCTui'])["+ products +"]");
            Thread.sleep(1000);
            //System.out.println(products);
            //TimeUnit.SECONDS.sleep(2);
            try{
                click((By) favourite1);
                i++;
            }
            catch(Exception e){
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
                javascriptExecutor.executeScript("arguments[0].click()",find(favourite1));
                i++;
            }

        }





    }



}
