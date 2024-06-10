package testCasesPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase {

    WebDriver driver;
    public TestCase (WebDriver driver){
        this.driver=driver;
    }

    public String checkHeader (){
        By header =By.xpath("//h2[@class='title text-center']");
      return driver.findElement(header).getText();

    }

}
