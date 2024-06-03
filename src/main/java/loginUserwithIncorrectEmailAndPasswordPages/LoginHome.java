package loginUserwithIncorrectEmailAndPasswordPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginHome {

    WebDriver driver;

    public LoginHome(WebDriver driver){
        this.driver = driver;
    }

    public void navigate (){
        driver.get("http://automationexercise.com");
    }

    public String homePageTitle (){
        return driver.getTitle();
    }

    public void clickLoginButton(){
        By loginButton = By.xpath("//a[@href='/login']");
        driver.findElement(loginButton).click();
    }
}
