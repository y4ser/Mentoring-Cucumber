package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.AddRecordPage;

import java.util.List;

public class AddRecordStepDefinitions {
    AddRecordPage addRecordPage;

    @When("enter data")
    public void enter_data(DataTable dataTable) {
        addRecordPage = new AddRecordPage();

        List<List<String>> lists = dataTable.asLists();
        for (List<String> eachList : lists) {
            System.out.println(eachList);
            addRecordPage.enterName(eachList.getFirst());
            addRecordPage.enterAge(eachList.get(1));
            addRecordPage.selectCountry(eachList.getLast());
            addRecordPage.clickAddRecord();
        }

        addRecordPage.assertAllRecords();
    }


}
