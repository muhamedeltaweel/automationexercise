package registerUserTest;


import home.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver ;
    Home homePage ;

    @Test
    public void navigateToHome (){

        homePage.navigate();
        Assert.assertEquals(homePage.homePageTitle(),"Automation Exercise");
        homePage.clickSignUpButton();

    }
    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new Home(driver);

    }
    @AfterMethod
    public void after() {
        driver.quit();
    }

}
