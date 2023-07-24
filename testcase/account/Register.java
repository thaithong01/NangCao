package account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.RegisterPageObject;
import pageUI.RegisterPageUI;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Register extends RegisterPageUI {
    WebDriver driver;

    @BeforeTest

    public void setup_open() {
        System.setProperty("webdriver.chromedriver", System.getProperty("user.dir") + "\\browserdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void RegisterWithEmptyData(){
        RegisterPageObject Page = new RegisterPageObject();
        Page.openUrl(driver, url);
        Page.clickButton(driver, createAccountHeader);
        Page.clickButton(driver, registerButton);

        Assert.assertEquals(Page.getErrorMessage(driver, firstNameErrorMessage),"First name is required.");
        Assert.assertEquals(Page.getErrorMessage(driver, lastNameErrorMessage),"Last name is required.");
        Assert.assertEquals(Page.getErrorMessage(driver, emailErrorMessage),"Email is required.");
        Assert.assertEquals(Page.getErrorMessage(driver, passwordErrorMessage),"Password is required.");
        Assert.assertEquals(Page.getErrorMessage(driver, confirmPasswordErrorMessage),"Password is required.");
    }

    @Test
    public void RegisterWithInvalidEmail(){
        RegisterPageObject Page = new RegisterPageObject();
        Page.openUrl(driver, url);
        Page.clickButton(driver, createAccountHeader);
        Page.inputToElement(driver, txtFirstName, "Thong");
        Page.inputToElement(driver, txtLastName, "Tran");
        Page.inputToElement(driver, txtEmail, "thong");
        Page.inputToElement(driver, txtPassword, "123456");
        Page.inputToElement(driver, txtConfirmPassword, "123456");

        Assert.assertEquals(Page.getErrorMessage(driver, emailErrorMessage), "Wrong email");
    }

    @AfterTest
    public void tearDown() {
        //driver.quit();
    }

    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(99999);
    }

    public void sleepSecond(long second){
        try{
            Thread.sleep(second * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
