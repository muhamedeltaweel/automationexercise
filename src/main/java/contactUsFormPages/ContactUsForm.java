package contactUsFormPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;

public class ContactUsForm {
    WebDriver driver ;

    public ContactUsForm (WebDriver driver){

        this.driver=driver;
    }
    public String checkFormHeader(){
        By header = By.xpath("(//h2[@class='title text-center'])[2]");
        return driver.findElement(header).getText();
    }
    public void fillForm (){
        By nameField =By.name("name");
        By emailField = By.name("email");
        By subjectField = By.name("subject");
        By messageField = By.name("message");

        driver.findElement(nameField).sendKeys("Test");
        driver.findElement(emailField).sendKeys("Test@test.com");
        driver.findElement(subjectField).sendKeys("Help");
        driver.findElement(messageField).sendKeys("This Message To Test Message");

        File uploadFile =
          new File("/home/tester/IdeaProjects/automationexercise/src/test/resources/FeedMill.drawio (1).pdf");
        WebElement fileInput = driver.findElement(By.name("upload_file"));
        fileInput.sendKeys(uploadFile.getAbsolutePath());

    }
    public void clickSubmit (){
        By submitButton = By.name("submit");
        driver.findElement(submitButton).click();

    }
    public void handleAlert (){
        driver.switchTo().alert().accept();
    }
}
