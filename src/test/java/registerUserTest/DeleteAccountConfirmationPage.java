package registerUserTest;

import accountInfo.AccountInfo;

import confirmation.Confirmation;
import delete.Delete;
import home.Home;
import homeAfterSignUp.HomeAfterSign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signup.Signup;


public class DeleteAccountConfirmationPage {


    WebDriver driver ;

    Home homePage ;
    Signup signUpPage ;
    AccountInfo accountInfo;
    Confirmation confirmation ;
    HomeAfterSign homeAfterSign;
    Delete delete ;

    @Test
    public void deleteUser(){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","auutommate00@yahoo.com");
        signUpPage.clickSignUpbutton();
        accountInfo.fillAccountDetails();
        accountInfo.clickCreateAccountButton();
        confirmation.clickContinueButton();
        homeAfterSign.clickDeleteButton();
        Assert.assertTrue(delete.deleteMessage());
        delete.clickContinueButton();
    }
    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new Home(driver);
        signUpPage =  new  Signup(driver);
        accountInfo =  new  AccountInfo(driver);
        confirmation =  new  Confirmation(driver);
        homeAfterSign =  new HomeAfterSign(driver);
        delete = new Delete (driver);
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
