package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    By emailGirisi = By.id("L-UserNameField");
    By passwordGirisi = By.id("L-PasswordField");
    By loginButtonClick = By.id("gg-login-enter");

    public LoginPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void girisYap(String email, String password){
        sendKey(emailGirisi,email);
        sendKey(passwordGirisi,password);
        click(loginButtonClick);
    }

}
