package contactUsFormPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver;

    public Home (WebDriver driver){
        this.driver=driver;
    }

    public void navigateToHome (){
        driver.get("https://automationexercise.com/");
    }

    public String checkHomePage (){
      return  driver.getTitle();

    }
    public void clickContactUsButton (){
        By contactUsButton = By.xpath("//a[@href='/contact_us']");
        driver.findElement(contactUsButton).click();
    }

}
