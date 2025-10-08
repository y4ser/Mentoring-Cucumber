package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class DataTableStepDefinitaion {

    @Given("user gets list of string")
    public void user_gets_list_of_string(io.cucumber.datatable.DataTable dataTable) {
        List<String> stringList = dataTable.asList();
        stringList.forEach(t -> System.out.println(t));
    }

    @When("user gets map of string")
    public void userGetsMapOfString(DataTable dataTable) {
        Map<String, String> stringMap =dataTable.asMap();
        for (Map.Entry<String, String> eachEntry : stringMap.entrySet()){
            String key =  eachEntry.getKey();
            String value =  eachEntry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }
    }

    @And("user get list of list of string")
    public void userGetListOfListOfString(DataTable dataTable) {
        List<List<String>> table =  dataTable.asLists();
        System.out.println("\nNames:");
        for (List<String> w : table){
            System.out.println(w.getFirst());
        }

        System.out.println("\nLast Name:");
        for (List<String> w : table){
            System.out.println(w.get(1));
        }

        System.out.println("\nAges:");
        for (List<String> w : table){
            System.out.println(w.get(2));
        }

        System.out.println("\nCities:");
        for (List<String> w : table){
            System.out.println(w.getLast());
        }
    }
}
