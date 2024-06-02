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

import java.time.Duration;

public class RegisterUser {

    WebDriver driver ;

    Home homePage ;
    Signup signUpPage ;
    AccountInfo accountInfo;
    Confirmation confirmation ;
    HomeAfterSign homeAfterSign;
    Delete delete ;

    @Test
    public void navigateToHome (){
        homePage.navigate();
        Assert.assertEquals(homePage.homePageTitle(),"Automation Exercise");
        homePage.clickSignUpButton();
    }

    @Test
    public void signUpNewUSer (){
        homePage.navigate();
        homePage.clickSignUpButton();
        Assert.assertEquals(signUpPage.checkSignUptext(),"New User Signup!");
        signUpPage.signUpForm("Automate","te9009@yahoo.com");
        signUpPage.clickSignUpbutton();
    }

    @Test
    public void fillAccountInfo (){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","autoe90009@yahoo.com");
        signUpPage.clickSignUpbutton();
        Assert.assertTrue(accountInfo.checkAccountInfoHeader());
        accountInfo.fillAccountDetails();
        accountInfo.clickCreateAccountButton();
    }

    @Test
    public void confirmAccount (){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","autommat0@yahoo.com");
        signUpPage.clickSignUpbutton();
        accountInfo.fillAccountDetails();
        accountInfo.clickCreateAccountButton();
        Assert.assertTrue(confirmation.checkAccountCreated());
        confirmation.clickContinueButton();
    }

    @Test
    public void verifyUser (){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","autoomte900@yahoo.com");
        signUpPage.clickSignUpbutton();
        accountInfo.fillAccountDetails();
        accountInfo.clickCreateAccountButton();
        confirmation.clickContinueButton();
        Assert.assertTrue(homeAfterSign.verifyUser());
        homeAfterSign.clickDeleteButton();
    }

    @Test
    public void deleteUser(){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","atommate00@yahoo.com");
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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
