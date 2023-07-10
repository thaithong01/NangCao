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
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\browserdrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void RegisterWithEmptyData(){
        RegisterPageObject Page = new RegisterPageObject();
        Page.openUrl(driver, url);
        Page.clickButton(driver, registerButton);
        Assert.assertEquals(Page.getErrorMessage(driver, firstNameErrorMessage),"This is a required field.");
        Assert.assertEquals(Page.getErrorMessage(driver, emailErrorMessage),"This is a required field.");
        Assert.assertEquals(Page.getErrorMessage(driver, passwordErrorMessage),"This is a required field.");
    }

    @Test
    public void RegisterWithInvalidEmail(){

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
