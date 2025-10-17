package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class T06_SignupPage {

    private WebDriver driver;

    public T06_SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    private By signup = By.id("signup");

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("email");
    private By password = By.id("password");
    private By submit = By.id("submit");


    public T06_SignupPage clickSignupButton(){
        driver.findElement(signup).click();
        return this;
    }

    public T06_SignupPage enterFirstname(String firstname){
        driver.findElement(firstName).sendKeys(firstname);
        return this;
    }

    public T06_SignupPage enterLastname(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
        return this;
    }

    public T06_SignupPage enterPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public T06_SignupPage enterEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public T06_AddContactPage clickSubmitButton(){
        driver.findElement(submit).click();
        return new T06_AddContactPage(driver);
    }



}
