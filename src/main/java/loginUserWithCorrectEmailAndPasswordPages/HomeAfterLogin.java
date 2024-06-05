package loginUserWithCorrectEmailAndPasswordPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomeAfterLogin {

    WebDriver driver ;
    public HomeAfterLogin(WebDriver driver){

        this.driver = driver;
    }

    public boolean verifyUser (){
        By loggedAs = By.xpath("//a[text()=' Logged in as ']");
        return driver.findElement(loggedAs).isDisplayed();
    }
    public void clickDeleteButton (){
        By deleteButton = By.xpath("//a[@href='/delete_account']");
        driver.findElement(deleteButton).click();

    }

}
