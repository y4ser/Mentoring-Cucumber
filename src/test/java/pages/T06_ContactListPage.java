package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T06_ContactListPage {

    private WebDriver driver;
    public T06_ContactListPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addContactButton = By.id("add-contact");
    private By contactRows = By.xpath("//table/tr");
    private By deleteBtn = By.id("delete");

//    public T06_SignupPage clickAddContact() {
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.id("add-contact")));
//        driver.findElement(addContactButton).click();
//        return new T06_SignupPage(driver);
//    }

    public T06_AddContactPage clickContactRows(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tr")));
        driver.findElement(contactRows).click();
        return new T06_AddContactPage(driver);
    }

    public T06_AddContactPage clickDeleteBtn(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("delete")));
        driver.findElement(deleteBtn).click();
        driver.switchTo().alert().accept();
        return new T06_AddContactPage(driver);
    }

}
