package registerUserTest;

import accountInfo.AccountInfo;
import confirmation.Confirmation;
import home.Home;
import homeAfterSignUp.HomeAfterSign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signup.Signup;


public class HomeAfterSignUp {

    WebDriver driver ;
    Home homePage ;
    Signup signUpPage ;
    AccountInfo accountInfo ;
    Confirmation confirmation ;
    HomeAfterSign homeAfterSign;

    @Test
    public void verifyUser (){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","autoomate900@yahoo.com");
        signUpPage.clickSignUpbutton();
        accountInfo.fillAccountDetails();
        accountInfo.clickCreateAccountButton();
        confirmation.clickContinueButton();
        Assert.assertTrue(homeAfterSign.verifyUser());
        homeAfterSign.clickDeleteButton();

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

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }


}
