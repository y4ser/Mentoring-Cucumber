package Hooks;

import io.cucumber.java.After;
import utilities.Driver;

public class hooks {

    @After("@DeleteChars")//import io.cucumber.java.After;
    public void tearDown() {
        Driver.closeDriver();
    }

}
