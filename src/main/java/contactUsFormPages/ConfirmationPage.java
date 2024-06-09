package contactUsFormPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    WebDriver driver;

    public ConfirmationPage(WebDriver driver){
        this.driver = driver ;
    }

    public Boolean confirmationText (){
        By confirmMessage = By.xpath("//div[@class='status alert alert-success']");
        return driver.findElement(confirmMessage).isDisplayed();
    }

    public void backHome (){
        By homeButton = By.xpath("(//a[@href='/'])[2]");
        driver.findElement(homeButton).click();
    }


}
