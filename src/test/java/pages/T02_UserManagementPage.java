package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class T02_UserManagementPage {

    public T02_UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit")
    private WebElement clickSubmit;

    @FindBy(id = "add-contact")
    private WebElement clickAddContact;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(xpath = "//form[@id='edit-contact']//input[@id='lastName']")
    private WebElement updateLastNameInput;

    @FindBy(xpath = "//button[@form='add-contact']")
    private WebElement clickSubmitBtnToSave;

    @FindBy(xpath = "//table/tr")
    private WebElement selectUser;


    @FindBy(xpath = "//button[@id='edit-contact']")
    private WebElement editContact;

    @FindBy(xpath = "//button[@form='edit-contact']")
    private WebElement clickSubmitBtnAfterEdit;

    @FindBy(id = "delete")
    private WebElement clickDeleteBtn;

    @FindBy(id = "return")
    private WebElement clickReturn;


    public T02_UserManagementPage enterEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public T02_UserManagementPage enterPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public T02_UserManagementPage clickSubmit() {
        clickSubmit.click();
        return this;
    }

    public T02_UserManagementPage clickAddContact() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("add-contact")));

        clickAddContact.click();
        return this;
    }

    public T02_UserManagementPage enterFirstname(String firstname) {
        firstNameInput.sendKeys(firstname);
        return this;
    }

    public T02_UserManagementPage enterLastname(String lastname) {
        lastNameInput.sendKeys(lastname);
        return this;
    }
    

    public T02_UserManagementPage clickSubmitToSave() {
        clickSubmitBtnToSave.click();
        return this;
    }

    public T02_UserManagementPage assertUserContactList() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "Yaser SDA3029"));
        assertTrue(Driver.getDriver().getPageSource().contains("Yaser SDA3029"));
        return this;
    }

    public T02_UserManagementPage selectExistingUser() {
        selectUser.click();
        return this;
    }

    public T02_UserManagementPage clickEditContact() {
        editContact.click();
        return this;
    }

    public T02_UserManagementPage updateLastname(String updateLastname) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(updateLastNameInput));

//        updateLastNameInput.sendKeys(Keys.CONTROL + "a");
//        updateLastNameInput.sendKeys(Keys.DELETE);
        updateLastNameInput.clear();

        updateLastNameInput.sendKeys(updateLastname);
        return this;
    }

    public T02_UserManagementPage clickSubmitToSaveChange() {
        clickSubmitBtnAfterEdit.click();
        return this;
    }

    public T02_UserManagementPage clickReturn() {
        clickReturn.click();
        return this;
    }


    public T02_UserManagementPage assertUpdatedInformation() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "Update"));

        assertTrue(Driver.getDriver().getPageSource().contains("Update"));
        return this;
    }

    public T02_UserManagementPage clickDeleteBtn() {
        clickDeleteBtn.click();
        return this;
    }

    public T02_UserManagementPage assertDeleteUser() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//table/tr")));
        assertTrue(!Driver.getDriver().getPageSource().contains("Yaser Update"));
        return this;
    }



}
