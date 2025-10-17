package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T06_EditPage {

    private WebDriver driver;
    public T06_EditPage(WebDriver driver) {
        this.driver = driver;
    }

    private By editContactBtn = By.id("edit-contact");

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By submitBtn = By.id("submit");


    public T06_EditPage clickEditContactBtn(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-contact")));
        driver.findElement(editContactBtn).click();
        return this;
    }

    public T06_EditPage enterEditFirstName(String firstName) {
        driver.findElement(this.firstName).clear();
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }

    public T06_EditPage enterEditLastName(String lastName) {
        driver.findElement(this.lastName).clear();
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }

    public T06_EditPage enterEditEmail(String email){
        driver.findElement(this.email).clear();
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public T06_EditPage enterEditPhone(String phone){
        driver.findElement(this.phone).clear();
        driver.findElement(this.phone).sendKeys(phone);
        return this;
    }

    public T06_ContactListPage clickSubmit() {
        driver.findElement(submitBtn).click();
        return new T06_ContactListPage(driver);
    }


}
