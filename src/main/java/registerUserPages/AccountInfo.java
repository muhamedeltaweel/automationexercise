package registerUserPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountInfo {
    WebDriver driver;
    public AccountInfo(WebDriver driver) {
        this.driver = driver;
    }


    public Boolean checkAccountInfoHeader(){
        By accountInfoHeader = By.xpath("//h2[@style='color: #FE980F;']");
        return   driver.findElement(accountInfoHeader).isDisplayed();

    }

    public void fillAccountDetails(){

        By titleGender = By.xpath("//div[@id='uniform-id_gender1']");
        driver.findElement(titleGender).click();

        By nameField = By.xpath("//input[@name='name']");
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys("Automate");

        By passwordField = By.id("password");
        driver.findElement(passwordField).sendKeys("Automate");

        By dayField = By.id("days");
        Select daysDrop  =new Select(driver.findElement(dayField));
        daysDrop.selectByVisibleText("12");

        By monthField = By.id("months");
        Select monthDrop  =new Select(driver.findElement(monthField));
        monthDrop.selectByVisibleText("December");

        By yearField = By.id("years");
        Select yearDrop  =new Select(driver.findElement(yearField));
        yearDrop.selectByVisibleText("2005");

        By newsLetterField = By.xpath("//input[@name='newsletter']");
        driver.findElement(newsLetterField).click();

        By specialOfferField = By.xpath("//input[@name='optin']");
        driver.findElement(specialOfferField).click();

        By firstNameField =  By.id("first_name");
        driver.findElement(firstNameField).sendKeys(" Test Automate");

        By lastNameField =  By.id("last_name");
        driver.findElement(lastNameField).sendKeys("Automate");

        By companyField =  By.id("company");
        driver.findElement(companyField).sendKeys("Muhamed Eltaweel LTD. ");

        By addressOneField =  By.id("address1");
        driver.findElement(addressOneField).sendKeys("Cairo - Helwan ");

        By addressTwoField =  By.id("address2");
        driver.findElement(addressTwoField).sendKeys("Cairo - Helwan ");

        By countryField = By.id("country");
        Select countryDrop  =new Select(driver.findElement(countryField));
        countryDrop.selectByVisibleText("Canada");

        By stateField =  By.id("state");
        driver.findElement(stateField).sendKeys("Cairo");

        By cityField =  By.id("city");
        driver.findElement(cityField).sendKeys("Helwan");

        By zipcodeField =  By.id("zipcode");
        driver.findElement(zipcodeField).sendKeys("505050");

        By mobileNumberField =  By.id("mobile_number");
        driver.findElement(mobileNumberField).sendKeys("01113654102");

    }
    public void clickCreateAccountButton (){
        By createAccountField =  By.xpath("//button[@data-qa='create-account']");
        driver.findElement(createAccountField).click();
    }
}

