package pageUI;

import org.openqa.selenium.By;

public class RegisterPageUI {
    public String url = "http://live.techpanda.org/index.php/customer/account/login/";
    public By createAccountButton = By.xpath("//a[@title='Create an Account']");
    public By registerButton = By.xpath("//button[@title='Register']");
    public By firstNameErrorMessage = By.xpath("//div[@id='advice-required-entry-firstname']");
    public By emailErrorMessage = By.xpath("//div[@id='advice-required-entry-email_address']");
    public By passwordErrorMessage = By.xpath("//div[@id='advice-required-entry-password']");
    public By txtFirstName = By.xpath("//input[@id='firstname']");
    public By txtEmail = By.xpath("//input[@id='email_address']");
    public By txtPassword = By.xpath("//input[@id='password']");
}
