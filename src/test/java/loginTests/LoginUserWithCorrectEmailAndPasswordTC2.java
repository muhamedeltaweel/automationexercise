package loginTests;

import loginUserWithCorrectEmailAndPasswordPages.DeleteUser;
import loginUserWithCorrectEmailAndPasswordPages.HomeAfterLogin;
import loginUserWithCorrectEmailAndPasswordPages.Login;
import loginUserWithCorrectEmailAndPasswordPages.LoginHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginUserWithCorrectEmailAndPasswordTC2 {
    WebDriver driver;
    LoginHome homePage ;
    Login LoginPage;
    HomeAfterLogin homeAfterLoginPage ;
    DeleteUser deletePage;

    @Test
    public void navigateToHome (){
        homePage.navigate();
        Assert.assertEquals(homePage.homePageTitle(),"Automation Exercise");
        homePage.clickLoginButton();
    }

    @Test
    public void login(){
        homePage.navigate();
        homePage.clickLoginButton();
        Assert.assertEquals(LoginPage.checkLogintext(),"Login to your account");
        LoginPage.loginForm("Test1@TestTest.com","TestTestTest");
        LoginPage.clickLoginButton();
    }

    @Test
    public void verifyUser (){
        homePage.navigate();
        homePage.clickLoginButton();
        LoginPage.loginForm("Testlogout@Testlogout.com","123456");
        LoginPage.clickLoginButton();
        Assert.assertTrue(homeAfterLoginPage.verifyUser());
        homeAfterLoginPage.clickDeleteButton();
    }
    @Test
    public void deleteUser(){
        homePage.navigate();
        homePage.clickLoginButton();
        LoginPage.loginForm("Test0@TestTest1.com","Automate");
        LoginPage.clickLoginButton();
        homeAfterLoginPage.clickDeleteButton();
        Assert.assertTrue(deletePage.checkDeleteMessage());
    }


    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        homePage = new LoginHome(driver);
        LoginPage =  new Login(driver);
        homeAfterLoginPage = new HomeAfterLogin(driver);
        deletePage = new DeleteUser(driver);
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }

}
