import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepsDef {

    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
    }
    @And("I enter email Amanda@gmail.com")
    public void i_enter_email_amanda_gmail_com() {

    }
    @And("I enter password @{int}")
    public void i_enter_password(Integer int1) {

    }
    @When("I click login button")
    public void i_click_login_button() {

    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }
}
