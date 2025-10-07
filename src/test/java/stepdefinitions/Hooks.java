package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Hooks {

    private long startTime;

    @Before
    public void beforeScenario(Scenario scenario) {

        System.out.println("Test Started");
        System.out.println("Start Time: " + getFormattedTime());
        System.out.println("Scenario: " + scenario.getName());
        startTime = System.currentTimeMillis();
    }

    @After
    public void afterScenario(Scenario scenario) {
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Test Ended");
        System.out.println("End Time: " + getFormattedTime());
        System.out.println("Scenario: " + scenario.getName());
        System.out.println("Duration: " + duration + " milliseconds");
    }

    private String getFormattedTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

}
