package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPageObject {
    Duration timeout = Duration.ofSeconds(30);
    WebDriverWait wait;
    public void openUrl(WebDriver driver, String url){
        wait = new WebDriverWait(driver, timeout);
        driver.get(url);
    }

    public void clickButton(WebDriver driver, By locator){
        wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public String getErrorMessage(WebDriver driver, By locator){
        wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }

    public void inputToElement(WebDriver driver, By locator, String value){
        wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).sendKeys(value);
    }

}
