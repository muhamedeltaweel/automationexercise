package logoutPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeAfterLogin {

   WebDriver driver ;

    public HomeAfterLogin (WebDriver driver){

        this.driver = driver;
    }
    public Boolean checkLogin (){

        By loggedIn = By.xpath("//a[text()=' Logged in as ']");
       return driver.findElement(loggedIn).isDisplayed();
    }
    public void clickLogout (){
        By logout = By.xpath("//a[@href='/logout']");
        driver.findElement(logout).click();
    }
}
