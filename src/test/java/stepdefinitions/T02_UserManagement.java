package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.T02_UserManagementPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class T02_UserManagement {

    T02_UserManagementPage userManagementPage = new T02_UserManagementPage();

    @Given("I open the browser")
    public void i_open_the_browser() {
        Driver.getDriver();
    }
    @Given("I navigate to the Contact List login page")
    public void i_navigate_to_the_contact_list_login_page() {
        Driver.getDriver().get("https://thinking-tester-contact-list.herokuapp.com/");
    }
    @Given("I login with valid credentials")
    public void i_login_with_valid_credentials() {
        userManagementPage.enterEmail("sda3029-yaser@gmail.com");
        userManagementPage.enterPassword("12345678");
        userManagementPage.clickSubmit();
    }
    @When("I navigate to the Add Contact page")
    public void i_navigate_to_the_add_contact_page() {
        userManagementPage.clickAddContact();

    }
    @When("I enter valid user details")
    public void i_enter_valid_user_details() {
        userManagementPage.enterFirstname("Yaser");
        userManagementPage.enterLastname("SDA3029");
    }
    @When("I click the save button")
    public void i_click_the_save_button() {
        userManagementPage.clickSubmitToSave();
    }
    @Then("I should see the new user in the contact list")
    public void i_should_see_the_new_user_in_the_contact_list() {
        userManagementPage.assertUserContactList();
    }

    @When("I select an existing user")
    public void i_select_an_existing_user() {
        userManagementPage.selectExistingUser();
    }
    @When("I update the user details")
    public void i_update_the_user_details() {
        userManagementPage.clickEditContact();
        userManagementPage.updateLastname("Update");
//        userManagementPage.clearLastname();
//        userManagementPage.enterLastname("Update");
    }
    @When("I save the changes")
    public void i_save_the_changes() {
        userManagementPage.clickSubmitToSaveChange();
    }
    @Then("I should see the updated information in the list")
    public void i_should_see_the_updated_information_in_the_list() {
        userManagementPage.clickReturn();
        userManagementPage.assertUpdatedInformation();
    }

    @When("I click the delete button")
    public void i_click_the_delete_button() {
        userManagementPage.clickDeleteBtn();
    }
    @When("I confirm the deletion")
    public void i_confirm_the_deletion() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("the user should be removed from the contact list")
    public void the_user_should_be_removed_from_the_contact_list() {
        userManagementPage.assertDeleteUser();
    }

//    @When("I search for a user by name")
//    public void i_search_for_a_user_by_name() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should see matching results")
//    public void i_should_see_matching_results() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

}
