package loginTest;

import loginUserwithIncorrectEmailAndPasswordPages.Login;
import loginUserwithIncorrectEmailAndPasswordPages.LoginHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginUserwithIncorrectEmailAndPasswordTC3 {
    WebDriver driver ;
    LoginHome loginhome;
    Login login ;
    @Test
    public void navigateTlogin (){
        loginhome.navigate();
        Assert.assertEquals(loginhome.homePageTitle(),"Automation Exercise");
        loginhome.clickLoginButton();
    }

    @Test

    public void login (){
        loginhome.navigate();
        loginhome.clickLoginButton();
        Assert.assertEquals(login.checkLogintext(),"Login to your account");
        login.loginForm("mmm@yahoo.com","0123456");
        login.clickLoginButton();
        Assert.assertTrue(login.validationmessage());
    }


 @BeforeMethod public void before (){
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     loginhome = new LoginHome(driver);
     login = new Login(driver);
 }
    @AfterMethod
    public void after() {
        driver.quit();
    }
}
