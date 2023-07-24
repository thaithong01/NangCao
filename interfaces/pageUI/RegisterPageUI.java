package pageUI;

import org.openqa.selenium.By;

public class RegisterPageUI {
    public String url = "https://demo.nopcommerce.com/";
    public By createAccountHeader = By.xpath("//a[contains(text(),'Register')]");
    public By registerButton = By.xpath("//button[@id='register-button']");
    public By firstNameErrorMessage = By.xpath("//span[@id='FirstName-error']");
    public By lastNameErrorMessage = By.xpath("//span[@id='LastName-error']");
    public By emailErrorMessage = By.xpath("//span[@id='Email-error']");
    public By passwordErrorMessage = By.xpath("//span[@id='Password-error']");
    public By confirmPasswordErrorMessage = By.xpath("//span[@id='ConfirmPassword-error']");

    public By txtFirstName = By.xpath("//input[@id='FirstName']");
    public By txtLastName = By.xpath("//input[@id='LastName']");
    public By txtEmail = By.xpath("//input[@id='Email']");
    public By txtPassword = By.xpath("//input[@id='Password']");
    public By txtConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
}
