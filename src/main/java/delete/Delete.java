package delete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Delete {

    WebDriver driver ;
    public Delete(WebDriver driver) {
        this.driver = driver;
    }

    public boolean deleteMessage (){

        By deleteMessage = By.xpath("//h2[@data-qa='account-deleted']");
        return driver.findElement(deleteMessage).isDisplayed();
    }

    public void clickContinueButton (){

        By continue_Button = By.xpath("//a[@data-qa='continue-button']");
        driver.findElement(continue_Button).click();
    }

}
