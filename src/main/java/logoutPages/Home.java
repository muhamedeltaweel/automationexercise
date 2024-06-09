package logoutPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver;

    public Home (WebDriver driver){
        this.driver = driver;
    }
    public void navigate (){
        driver.get("https://automationexercise.com/");
    }
    public String checkHome (){
        return driver.getTitle();
    }
    public void clickLoginButton (){
        By loginButton = By.xpath("//a[@href='/login']");
        driver.findElement(loginButton).click();
    }
}
