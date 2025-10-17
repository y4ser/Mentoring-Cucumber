package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AddStudentPage {

    private By name = By.id("name");
    private By studentId = By.id("studentId");
    private By email = By.id("email");
    private By course = By.id("course");
    private By grade = By.id("grade");
    private By SubmitBtn = By.id("submitBtn");
    private By firstRow = By.xpath("//tbody/tr");
    private String editButton =  ("//tr[contains(., '%s')]//button[@data-action='edit']");
    private String deleteButton = ("//tr[contains(., '%s')]//button[@data-action='del']");
    private By clearAll = By.id("clearAll");

    private By searchBox = By.id("q");
    private By tableRows = By.xpath("//tbody/tr");


    public AddStudentPage enterFullName(String fullName) {
        Driver.getDriver().findElement(name).sendKeys(fullName);
        return this;
    }

    public AddStudentPage enterStudentId(String studentId) {
        Driver.getDriver().findElement(this.studentId).sendKeys(studentId);
        return this;
    }

    public AddStudentPage enterEmail(String email) {
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public AddStudentPage enterCourse(String course) {
        Driver.getDriver().findElement(this.course).sendKeys(course);
        return this;
    }

    public AddStudentPage selectGrade(String grade) {
        new Select(Driver.getDriver().findElement(this.grade)).selectByVisibleText(grade);
        return this;
    }

    public AddStudentPage clickAddStudentButton() {
        Driver.getDriver().findElement(SubmitBtn).click();
        return this;
    }

    public AddStudentPage assertStudentAdded(){
        assertTrue(Driver.getDriver().findElement(firstRow).isDisplayed());
        return this;
    }

    public AddStudentPage clickEditButton(String text){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        By locator = By.xpath(String.format(editButton, text));

        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Driver.getDriver().findElement(locator).click();
        return this;
    }

    public AddStudentPage editFullName(String fullname){
        Driver.getDriver().findElement(name).clear();
        Driver.getDriver().findElement(name).sendKeys(fullname);
        return this;
    }

    public AddStudentPage editId(String id){
        Driver.getDriver().findElement(studentId).clear();
        Driver.getDriver().findElement(studentId).sendKeys(id);
        return this;
    }

    public AddStudentPage editEmail(String email){
        Driver.getDriver().findElement(this.email).clear();
        Driver.getDriver().findElement(this.email).sendKeys(email);
        return this;
    }

    public AddStudentPage clickSaveChangesButton(){
        Driver.getDriver().findElement(SubmitBtn).click();
        return this;
    }

    public AddStudentPage assertStudentUpdated(String oldName, String newName, String newId, String newEmail) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//tbody/tr"));
        boolean updated = rows.stream().anyMatch(
                row -> row.getText().contains(newName) && row.getText().contains(newId) && row.getText().contains(newEmail)
        );
        assertTrue("Student update failed. Expected name: " + newName + ", id: " + newId +", email" + newEmail, updated);
        return this;
    }

    public AddStudentPage clickDeleteButtonContains(String text) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        By locator = By.xpath(String.format(deleteButton, text));

        while (true) {
            List<WebElement> elementList = Driver.getDriver().findElements(locator);
            if (elementList.isEmpty()) {
                break;
            }
            wait.until(ExpectedConditions.elementToBeClickable(elementList.getFirst()));
            elementList.getFirst().click();
            Driver.getDriver().switchTo().alert().accept();
            wait.until(ExpectedConditions.stalenessOf(elementList.getFirst()));
        }
        return this;
    }

    public AddStudentPage clickClearAllButton(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        Driver.getDriver().findElement(clearAll).click();
        Driver.getDriver().switchTo().alert().accept();
        return this;
    }

    public AddStudentPage search(String keyword){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        Driver.getDriver().findElement(searchBox).clear();
        Driver.getDriver().findElement(searchBox).sendKeys(keyword);
        return this;
    }

}
