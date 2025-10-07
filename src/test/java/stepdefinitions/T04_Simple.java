package stepdefinitions;

import io.cucumber.java.en.Given;

public class T04_Simple {

    @Given("I run scenario one")
    public void i_run_scenario_one() {
        System.out.println("Running scenario one");
    }

    @Given("I run scenario two")
    public void i_run_scenario_two() {
        System.out.println("Running scenario two");
    }

    @Given("I run scenario three")
    public void i_run_scenario_three() {
        System.out.println("Running scenario three");
    }

}
