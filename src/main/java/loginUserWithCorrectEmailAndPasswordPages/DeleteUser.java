package loginUserWithCorrectEmailAndPasswordPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteUser {

    WebDriver driver ;
    public DeleteUser(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkDeleteMessage (){

        By deleteMessage = By.xpath("//h2[@data-qa='account-deleted']");
        return driver.findElement(deleteMessage).isDisplayed();
    }


}
