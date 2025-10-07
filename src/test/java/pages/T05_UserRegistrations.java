package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T05_UserRegistrations {

    public T05_UserRegistrations(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ssn")
    private WebElement ssn;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(id = "phone")
    private WebElement phone;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "confirm-password")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[@class='button']")
    private WebElement registerButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    public T05_UserRegistrations enterSsn(String ssn){
        this.ssn.sendKeys(ssn);
        return this;
    }

    public T05_UserRegistrations enterFirstName(String firstName){
        this.firstName.sendKeys(firstName);
        return this;
    }

    public T05_UserRegistrations enterLastName(String lastName){
        this.lastName.sendKeys(lastName);
        return this;
    }

    public T05_UserRegistrations enterAddress(String address){
        this.address.sendKeys(address);
        return this;
    }

    public T05_UserRegistrations enterPhone(String phone){
        this.phone.sendKeys(phone);
        return this;
    }

    public T05_UserRegistrations enterUsername(String username){
        this.username.sendKeys(username);
        return this;
    }

    public T05_UserRegistrations enterEmail(String email){
        this.email.sendKeys(email);
        return this;
    }

    public T05_UserRegistrations enterPassword(String password){
        this.password.sendKeys(password);
        return this;
    }

    public T05_UserRegistrations enterConfirmPassword(String confirmPassword){
        this.confirmPassword.sendKeys(confirmPassword);
        return this;
    }

    public void clickRegisterButton(){
        this.registerButton.click();
    }

    public void verifySuccessMessage(String expectedMessage){
        assertTrue(successMessage.getText().contains("User registered successfully!"));
    }



}
