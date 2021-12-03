package baseTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        navigationBar.navigateToLoginPage();
        loginPage.girisYap("alitilki111@hotmail.com", "0032549800a");
        Thread.sleep(2000);
        //driver.get("https://www.gittigidiyor.com/hesabim/izlediklerim");
        //WebElement radio1 = driver.findElement(By.id("https://www.gittigidiyor.com/hesabim/izlediklerim"));
    }




}
