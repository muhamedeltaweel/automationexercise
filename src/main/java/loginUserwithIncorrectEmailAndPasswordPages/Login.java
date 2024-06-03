package loginUserwithIncorrectEmailAndPasswordPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver){

        this.driver = driver;
    }
    public String checkLogintext(){
        By header = By.cssSelector("div[class='login-form'] h2");
        return driver.findElement(header).getText();

    }
    public void loginForm(String emailtext , String passwordtext){

        By emailField = By.name("email");
        driver.findElement(emailField).sendKeys(emailtext);

        By passwordField = By.name("password");
        driver.findElement(passwordField).sendKeys(passwordtext);

    }
    public void clickLoginButton(){
        By loginButton = By.xpath("//button[@data-qa='login-button']");
        driver.findElement(loginButton).click();
    }

    public Boolean validationmessage (){
        By messagetext = By.xpath("//p[@style='color: red;']");
       return  driver.findElement(messagetext).isDisplayed();
    }
}
