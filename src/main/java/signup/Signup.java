package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {

    WebDriver driver;

    public Signup (WebDriver driver){

        this.driver = driver;
    }
    public String checkSignUptext(){
        By header = By.cssSelector("div[class='signup-form'] h2");
        return driver.findElement(header).getText();

    }
    public void signUpForm (String nametext ,String emailtext){

        By nameField = By.name("name");
        driver.findElement(nameField).sendKeys(nametext);

        By emailField = By.xpath("//input[@data-qa='signup-email']");
        driver.findElement(emailField).sendKeys(emailtext);

    }
    public void clickSignUpbutton (){
        By signupButton = By.xpath("//button[@data-qa='signup-button']");
        driver.findElement(signupButton).click();
    }
}
