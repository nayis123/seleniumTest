package baseTest;

import base.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    LoginPage loginPage;
    BasePage basePage;
    NavigationBar navigationBar;
    SearchProduct searchProduct;


    @Before
    public void setUpEach(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.gittigidiyor.com/");

        basePage = new BasePage(driver,wait);
        loginPage = new LoginPage(driver,wait);
        navigationBar = new NavigationBar(driver,wait);
        searchProduct = new SearchProduct(driver,wait);
    }


    //_____________AFTER EKLENECEK

}
