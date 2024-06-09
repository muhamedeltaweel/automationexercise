package contactUsFormTest;


import contactUsFormPages.ConfirmationPage;
import contactUsFormPages.ContactUsForm;
import contactUsFormPages.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ContactUsFormTC6 {
     WebDriver driver;
     Home home ;
     ContactUsForm contactUsForm ;
     ConfirmationPage confirmationPage ;

     @Test
    public void navigateToHome (){
        home.navigateToHome();
        Assert.assertEquals( home.checkHomePage(),"Automation Exercise");
        home.clickContactUsButton();
    }

@Test
    public void form (){
        home.navigateToHome();
        home.clickContactUsButton();
        Assert.assertEquals(contactUsForm.checkFormHeader(),"GET IN TOUCH");
        contactUsForm.fillForm();
        contactUsForm.clickSubmit();
        contactUsForm.handleAlert();
    }
    @Test
    public void confirmation (){
        home.navigateToHome();
        home.clickContactUsButton();
        contactUsForm.fillForm();
        contactUsForm.clickSubmit();
        contactUsForm.handleAlert();
        Assert.assertTrue(confirmationPage.confirmationText());
        confirmationPage.backHome();
    }
    @Test
    public void backToHome (){
        home.navigateToHome();
        home.clickContactUsButton();
        contactUsForm.fillForm();
        contactUsForm.clickSubmit();
        contactUsForm.handleAlert();
        confirmationPage.backHome();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue( wait.until(ExpectedConditions.titleIs("Automation Exercise")));
    }



    @BeforeMethod public void setUp (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        home = new Home(driver);
        contactUsForm = new ContactUsForm(driver);
        confirmationPage = new ConfirmationPage(driver);
    }

    @AfterMethod public void tearDown (){
         driver.quit();
    }

}
