package logoutTest;

import LogoutPages.Home;
import LogoutPages.HomeAfterLogin;
import LogoutPages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogoutUser {
  WebDriver driver ;
  Home home ;
  Login login ;
  HomeAfterLogin homeAfterLogin ;

  @Test
  public void navigateToHome (){
      home.navigate();
      Assert.assertEquals(home.checkHome(),"Automation Exercise");
      home.clickLoginButton();

  }
  @Test
  public void login (){
      home.navigate();
      home.clickLoginButton();
      Assert.assertTrue(login.checkLoginHeader());
      login.loginForm("Testlogout@Testlogout.com","123456");
      login.clickLoginButton();
  }
  @Test
  public void checkUserLogged(){
      home.navigate();
      home.clickLoginButton();
      login.loginForm("Testlogout@Testlogout.com","123456");
      login.clickLoginButton();
      Assert.assertTrue(homeAfterLogin.checkLogin());
      homeAfterLogin.clickLogout();
      Assert.assertTrue(login.checkLoginHeader());
  }

  @BeforeMethod public void before (){
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

      home = new Home(driver);
      login = new Login(driver);
      homeAfterLogin = new HomeAfterLogin(driver);
  }

  @AfterMethod public void after (){

      driver.quit();
  }

}
