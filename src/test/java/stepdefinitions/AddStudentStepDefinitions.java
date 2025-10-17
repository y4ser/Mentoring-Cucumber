package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddStudentPage;

public class AddStudentStepDefinitions {
    AddStudentPage studentPage;

    @When("user enters full name {string}")
    public void user_enters_full_name(String name) {
        studentPage = new AddStudentPage();
        studentPage.enterFullName(name);


    }

    @When("user enters student id {string}")
    public void user_enters_student_id(String id) {
        studentPage = new AddStudentPage();
        studentPage.enterStudentId(id);

    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        studentPage = new AddStudentPage();
        studentPage.enterEmail(email);
    }

    @When("user enters course {string}")
    public void user_enters_course(String course) {
        studentPage = new AddStudentPage();
        studentPage.enterCourse(course);
    }

    @When("user selects grade {string}")
    public void user_selects_grade(String grade) {
        studentPage = new AddStudentPage();
        studentPage.selectGrade(grade);
    }

    @When("user click on add student button")
    public void user_click_on_add_student_button() {
        studentPage = new AddStudentPage();
        studentPage.clickAddStudentButton();
    }

    @Then("assert that student is added")
    public void assert_that_student_is_added() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentAdded();
    }

    @Then("assert that error message is displayed as {string}")
    public void assertThatErrorMessageIsDisplayedAs(String message) {

    }

    @When("user clicks on edit button for student {string}")
    public void userClicksOnEditButtonForStudent(String name) {
        studentPage = new AddStudentPage();
        studentPage.clickEditButton(name);
    }

    @And("user updates fullName {string}")
    public void userUpdatesFullName(String name) {
        studentPage = new AddStudentPage();
        studentPage.editFullName(name);
    }

    @And("user updates id {string}")
    public void userUpdatesId(String id) {
        studentPage = new AddStudentPage();
        studentPage.editId(id);
    }

    @And("user updates email {string}")
    public void userUpdatesEmail(String email) {
        studentPage = new AddStudentPage();
        studentPage.editEmail(email);
    }

    @And("user clicks on save changes button")
    public void userClicksOnSaveChangesButton() {
        studentPage = new AddStudentPage();
        studentPage.clickSaveChangesButton();
    }


    @Then("assert that student info is updated")
    public void assertThatStudentInfoIsUpdated() {
        studentPage = new AddStudentPage();
        studentPage.assertStudentUpdated("Tom Black", "Yaser", "Y12345", "yaser@gmail.com");
    }


    @When("user deletes the student contains {string}")
    public void userDeletesTheStudentContains(String text) {

        studentPage = new AddStudentPage();
        studentPage.clickDeleteButtonContains(text);
    }


    @When("user clicks on clear all button")
    public void userClicksOnClearAllButton() {
        studentPage = new AddStudentPage();
        studentPage.clickClearAllButton();
    }

    @And("user confirms the alert")
    public void userConfirmsTheAlert() {
        studentPage = new AddStudentPage();

    }

    @Then("assert that all records are deleted from local storage")
    public void assert_that_all_records_are_deleted_from_local_storage() {

    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String keyword) {
        studentPage = new AddStudentPage();
        studentPage.search(keyword);
    }

}
