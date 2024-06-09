package registerUserTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registerUserWithExistingEmailPages.Home;
import registerUserWithExistingEmailPages.Signup;

import java.time.Duration;

public class RegisterUserWithExistingEmailTC5 {
     WebDriver driver ;
     Home home ;
     Signup signup ;

     @Test
    public void navigateToHome (){
        home.navigate();
        Assert.assertEquals(home.homePageTitle(),"Automation Exercise");
        home.clickSignUpButton();
    }
@Test
    public void signUpForm (){
        home.navigate();
        home.clickSignUpButton();
        Assert.assertEquals(signup.checkSignUptext(),"New User Signup!");
        signup.signUpForm("test","Test@Test.com");
    }

    @Test
    public void checkValidation (){
        home.navigate();
        home.clickSignUpButton();
        signup.signUpForm("test","Test@Test.com");
        signup.clickSignUpbutton();
        Assert.assertEquals(signup.checkvalidation(),"Email Address already exist!");

    }


    @BeforeMethod
    public void before (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        home = new Home(driver);
        signup = new Signup(driver);
    }
    @AfterMethod public void after (){
         driver.quit();
    }
}
