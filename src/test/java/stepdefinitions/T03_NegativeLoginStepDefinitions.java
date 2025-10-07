package stepdefinitions;

import io.cucumber.java.en.When;
import pages.T03_LoginPage;

public class T03_NegativeLoginStepDefinitions {

    T03_LoginPage loginPage;
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage = new T03_LoginPage();
        loginPage.enterUsername(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage = new T03_LoginPage();
        loginPage.enterPassword(password);
    }
    @When("user click signin button")
    public void user_click_signin_button() {
        loginPage = new T03_LoginPage();
        loginPage.clickLogin();
    }

}
