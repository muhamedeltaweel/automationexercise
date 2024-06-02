package registerUserPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {


    WebDriver driver;

    public Home (WebDriver driver){

        this.driver = driver;
    }

    public void navigate (){

        driver.get("http://automationexercise.com");
    }

    public String homePageTitle (){

        return driver.getTitle();

    }

    public void clickSignUpButton(){
        By signupButton = By.xpath("//a[@href='/login']");
        driver.findElement(signupButton).click();
    }
}
