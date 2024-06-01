package registerUserTest;


import accountInfo.AccountInfo;
import home.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signup.Signup;

import java.time.Duration;

public class AccountInfoPage {
    WebDriver driver ;
    Home homePage ;
    Signup signUpPage ;
    AccountInfo accountInfo;

    @Test
    public void fillAccountInfo (){
        homePage.navigate();
        homePage.clickSignUpButton();
        signUpPage.signUpForm("Automate","autoomaate90009@yahoo.com");
        signUpPage.clickSignUpbutton();
        Assert.assertTrue(accountInfo.checkAccountInfoHeader());
        accountInfo.fillAccountDetails();
        accountInfo.clickCreateAccountButton();

    }
    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homePage = new Home(driver);
        signUpPage =  new  Signup(driver);
        accountInfo =  new  AccountInfo(driver);

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }


}
