package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.T05_UserRegistrations;

public class T05_UserRegistration {

    T05_UserRegistrations userRegistrations;

    @When("user enters ssn {string}")
    public void user_enters_ssn(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.enterSsn(string);
    }
    @When("user enters firstname {string}")
    public void user_enters_firstname(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.enterFirstName(string);
    }
    @When("user enters lastname {string}")
    public void user_enters_lastname(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.enterLastName(string);
    }
    @When("user enters address {string}")
    public void user_enters_address(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.enterAddress(string);
    }
    @When("user enters phone number {string}")
    public void user_enters_phone_number(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.enterPhone(string);
    }
    @When("user enters email {string}")
    public void user_enters_email(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.enterEmail(string);
    }
    @When("user enters confirm password {string}")
    public void user_enters_confirm_password(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.enterConfirmPassword(string);
    }
    @When("user clicks register button")
    public void user_clicks_register_button() {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.clickRegisterButton();
    }
    @Then("user should see the success message {string}")
    public void user_should_see_the_success_message(String string) {
        userRegistrations = new T05_UserRegistrations();
        userRegistrations.verifySuccessMessage(string);
    }

}
