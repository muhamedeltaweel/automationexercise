package testcasesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testCasesPages.Home;
import testCasesPages.TestCase;


public class VerifyTestCasesPageTC7 {
    WebDriver driver;
    Home home;
    TestCase testCase ;
@Test
    public void navigateToHome (){
        home.navigate();
        Assert.assertEquals( home.checkHomePage(),"Automation Exercise");
        home.clickTestCaseButton();
    }
@Test
    public void checkPage()
    {
        home.navigate();
        home.clickTestCaseButton();
        Assert.assertEquals( testCase.checkHeader(),"TEST CASES");
    }

    @BeforeMethod
     public void setUp (){
     driver = new FirefoxDriver();
     //driver = new ChromeDriver();
     driver.manage().window().maximize();
     home = new Home(driver);
     testCase = new TestCase(driver);
    }

    @AfterMethod
    public void tearDown (){driver.quit();}

}
