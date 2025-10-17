package tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.T06_AddContactPage;
import pages.T06_EditPage;
import pages.T06_SignupPage;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public class T06_ContactFlow {

    @Test
    public void test01() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();


        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

        T06_SignupPage signupPage = new T06_SignupPage(driver);
        T06_AddContactPage addContactPage = new T06_AddContactPage(driver);
        T06_EditPage editPage = new T06_EditPage(driver);

        signupPage
                .clickSignupButton()
                .enterFirstname("Yaser")
                .enterLastname("SDA3029")
                .enterEmail(Faker.instance().internet().emailAddress())
                .enterPassword("12345678")
                .clickSubmitButton();

        addContactPage.clickAddContact()
                .enterFirstName(Faker.instance().name().firstName())
                .enterLastName(Faker.instance().name().lastName())
                .enterBirthdate(new java.text.SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(Faker.instance().date().birthday()))
                .enterEmail(Faker.instance().internet().emailAddress())
                .enterPhone(Faker.instance().numerify("05########"))
                .enterStreet1(Faker.instance().address().streetAddress())
                .enterStreet2(Faker.instance().address().secondaryAddress())
                .enterCity(Faker.instance().address().city())
                .enterStateProvince(Faker.instance().address().state())
                .enterPostalCode(Faker.instance().address().zipCode())
                .enterCountry(Faker.instance().address().country())
                .clickSubmit()
                .clickContactRows();

        editPage
                .clickEditContactBtn()
                .enterEditFirstName(Faker.instance().name().firstName())
                .enterEditLastName(Faker.instance().name().lastName())
                .enterEditEmail(Faker.instance().internet().emailAddress())
                .enterEditPhone(Faker.instance().numerify("05########"))
                .clickSubmit()
                .clickDeleteBtn();

        driver.quit();

    }

}
