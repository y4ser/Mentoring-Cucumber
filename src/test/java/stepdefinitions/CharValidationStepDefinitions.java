package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pages.CharValidationPage;

import java.util.List;

public class CharValidationStepDefinitions {

    CharValidationPage validationPage;

    @Given("user enters valid inputs")
    public void user_enters_valid_inputs(DataTable dataTable) {
        validationPage = new CharValidationPage();
        for (String each : dataTable.asList()){
            validationPage.enterInput(each);
            validationPage.clickValidate();
            validationPage.assertValidOutput();
        }
    }

    @Given("user enters invalid inputs")
    public void userEntersInvalidInputs(DataTable dataTable) {
        validationPage = new CharValidationPage();
        for (String each : dataTable.asList()){
            validationPage.enterInput(each);
            validationPage.clickValidate();
            validationPage.assertInvalidOutput();
        }

    }
}
