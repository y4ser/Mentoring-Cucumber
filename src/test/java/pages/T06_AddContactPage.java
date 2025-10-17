package pages;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class T06_AddContactPage {

    private WebDriver driver;

    public T06_AddContactPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addContactButton = By.id("add-contact");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By birthdate = By.id("birthdate");
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By street1 = By.id("street1");
    private By street2 = By.id("street2");
    private By city = By.id("city");
    private By stateProvince = By.id("stateProvince");
    private By postalCode = By.id("postalCode");
    private By country = By.id("country");
    private By submitBtn = By.id("submit");


    public T06_AddContactPage clickAddContact() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("add-contact")));
        driver.findElement(addContactButton).click();
        return new T06_AddContactPage(driver);
    }

    public T06_AddContactPage enterFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }

    public T06_AddContactPage enterLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }

    public T06_AddContactPage enterBirthdate(String birthdate){
        driver.findElement(this.birthdate).sendKeys(birthdate);
        return this;
    }

    public T06_AddContactPage enterEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public T06_AddContactPage enterPhone(String phone){
        driver.findElement(this.phone).sendKeys(phone);
        return this;
    }

    public T06_AddContactPage enterStreet1(String street1){
        driver.findElement(this.street1).sendKeys(street1);
        return this;
    }

    public T06_AddContactPage enterStreet2(String street2) {
        driver.findElement(this.street2).sendKeys(street2);
        return this;
    }

    public T06_AddContactPage enterCity(String city){
        driver.findElement(this.city).sendKeys(city);
        return this;
    }

    public T06_AddContactPage enterStateProvince(String stateProvince){
        driver.findElement(this.stateProvince).sendKeys(stateProvince);
        return this;
    }

    public T06_AddContactPage enterPostalCode(String postalCode){
        driver.findElement(this.postalCode).sendKeys(postalCode);
        return this;
    }

    public T06_AddContactPage enterCountry(String country){
        driver.findElement(this.country).sendKeys(country);
        return this;
    }

    public T06_ContactListPage clickSubmit() {
        driver.findElement(submitBtn).click();
        return new T06_ContactListPage(driver);
    }

}
