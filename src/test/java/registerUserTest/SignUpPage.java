package registerUserTest;

import home.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signup.Signup;


public class SignUpPage {

    WebDriver driver ;
    Home homePage ;
    Signup signUpPage ;

    @Test
    public void signUpNewUSer (){
        homePage.navigate();
        homePage.clickSignUpButton();
        Assert.assertEquals(signUpPage.checkSignUptext(),"New User Signup!");
        signUpPage.signUpForm("Automate","automate9009@yahoo.com");
        signUpPage.clickSignUpbutton();
    }
    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new Home(driver);
        signUpPage =  new  Signup(driver);
    }
    @AfterMethod
    public void after() {
        driver.quit();
    }



}
