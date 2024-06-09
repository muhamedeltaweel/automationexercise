package logoutPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver ;

    public Login (WebDriver driver){

        this.driver = driver ;
    }

    public void loginForm (String emailText ,String passwordText){

        By emailAddressField = By.xpath("//input[@data-qa='login-email']");
        driver.findElement(emailAddressField).sendKeys(emailText);

        By passwordField = By.xpath("//input[@data-qa='login-password']");
        driver.findElement(passwordField).sendKeys(passwordText);

    }
    public Boolean checkLoginHeader (){
        By header = By.cssSelector("div[class='login-form'] h2");
        return driver.findElement(header).isDisplayed();
    }

    public void clickLoginButton (){
        By loginButton = By.xpath("//button[@data-qa='login-button']");
        driver.findElement(loginButton).click();

    }


}
