package testCasesPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver driver;
    public Home (WebDriver driver){
        this.driver=driver;
    }

    public void navigate (){
        driver.get("https://automationexercise.com/");
    }

    public String checkHomePage(){
        return driver.getTitle();
    }
    public void clickTestCaseButton (){
        By buuton = By.xpath("//a[@href='/test_cases']");
        driver.findElement(buuton).click();
    }
}
