package confirmation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation {
    WebDriver driver;
    public Confirmation(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean checkAccountCreated (){
        By accountCreate = By.xpath("//h2[@data-qa='account-created']");
        return  driver.findElement(accountCreate).isDisplayed();

    }
    public void clickContinueButton (){

        By continueButton = By.xpath("//a[@data-qa='continue-button']");
        driver.findElement(continueButton).click();
    }


}
