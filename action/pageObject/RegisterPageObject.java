package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject {
    public void openUrl(WebDriver driver, String url){
        driver.get(url);
    }

    public void clickButton(WebDriver driver, By locator){
        driver.findElement(locator).click();
    }

    public String getErrorMessage(WebDriver driver, By locator){
        return driver.findElement(locator).getText();
    }

    public void inputToElement(WebDriver driver, By locator){
        driver.findElement(locator).sendKeys();
    }

}
