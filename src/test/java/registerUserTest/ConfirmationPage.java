package registerUserTest;

import accountInfo.AccountInfo;
import confirmation.Confirmation;
import home.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signup.Signup;



public class ConfirmationPage {
    WebDriver driver ;
    Home homePage ;
    Signup signUpPage ;
    AccountInfo accountInfo ;
    Confirmation confirmation ;

    @Test
    public void confirmAccount (){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","autommatte00@yahoo.com");
        signUpPage.clickSignUpbutton();
        accountInfo.fillAccountDetails();
        accountInfo.clickCreateAccountButton();
        Assert.assertTrue(confirmation.checkAccountCreated());
        confirmation.clickContinueButton();

    }
    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new Home(driver);
        signUpPage =  new  Signup(driver);
        accountInfo =  new  AccountInfo(driver);
        confirmation =  new  Confirmation(driver);

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
