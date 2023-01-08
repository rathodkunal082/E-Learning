package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import BaseClass.BrowserLaunch;
import PageClasses.CRMproRegistrationPOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CRMproCreateUserStepDefinition {
	
WebDriver driver;
CRMproRegistrationPOM crm;
@Given("user launch the browser")
public void user_launch_the_browser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SDETAutomation\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

   
}



@When("user hit the given url {string}")
public void user_hit_the_given_url(String url) {
	driver.get(url);
   
}

@Then("varify user is on CRMpro registration page")
public void varify_user_is_on_cr_mpro_registration_page() {
	crm=new CRMproRegistrationPOM(driver);
   String title = driver.getTitle();
   Reporter.log(title);
}

@When("user select CRMpro edition from the dropdown")
public void user_select_cr_mpro_edition_from_the_dropdown() {
crm.verifyCRMproEditionDropDown();
}

@And("fill all available field such as {string},{string},{string},{string},{string},{string},{string}")
public void fill_all_available_field_such_as(String username, String lastname, String email_Id, String confirm_EmailID, String username1, String password1, String cpassword) {
   crm.verifyCRMproFirstNameField(username);
   crm.verifyCRMproLastNameField(lastname);
   crm.verifyCRMproEmailIdField(email_Id);
   crm.verifyCRMproEmailIdConfirmField(confirm_EmailID);
   crm.VerifyCRMproUsernameField(username1);
   crm.VerifyCRMproPasswordField(password1);
   crm.VerifyCRMproConfirmPasswordField(cpassword);
   
}

@And("checked on the term and condition checkbox")
public void checked_on_the_term_and_condition_checkbox() {
	
    crm.verifyCRMproRegistrationPageCheckBoxIsClickable();
}

@And("click on the submit button")
public void click_on_the_submit_button() {
	crm.VerifyCRMproRegistrationSubmitBtnIsClickable();
}

@Then("varify user account create successful massage")
public void varify_user_account_create_successful_massage() {
   String maintitle = driver.getTitle();
   Reporter.log(maintitle);
    
}

}
