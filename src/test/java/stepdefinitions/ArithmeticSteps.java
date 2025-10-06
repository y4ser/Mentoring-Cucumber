package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ArithmeticSteps {

    int num1;
    int num2;
    int result;
    String errorMessage;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(Integer int1, Integer int2) {
        num1 = int1;
        num2 = int2;
    }

    @When("I add the numbers")
    public void i_add_the_numbers() {
        result = num1 + num2;
    }

    @When("I subtract the second number from the first")
    public void i_subtract_the_second_number_from_the_first() {
        result = num1 - num2;
    }

    @When("I divide the first number by the second")
    public void i_divide_the_first_number_by_the_second() {
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            errorMessage = "Division by zero error";
        }
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expected) {
        Assert.assertEquals(expected.intValue(), result);
    }

    @Then("an error should be displayed")
    public void an_error_should_be_displayed() {
        Assert.assertEquals("Division by zero error", errorMessage);
    }

    @Then("the operation should not continue")
    public void the_operation_should_not_continue() {
        Assert.assertNotNull(errorMessage);
    }
}
