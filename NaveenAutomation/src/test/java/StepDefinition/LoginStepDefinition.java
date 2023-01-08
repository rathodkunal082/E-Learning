package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("User is already on login page.")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\NaveenAutomation\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
	   
	}

	@When("title of the login page is Free CRM")
	public void title_of_the_login_page_is_free_crm() {
		String title=driver.getTitle();
		Assert.assertEquals(title,"Free CRM #1 cloud software for any business large or small");
	    
	}
	
	@And("User click on the login button")
	public void User_click_on_the_login_button(){
		driver.findElement(By.xpath("//ul/a")).click();
	}


	@Then("user enter {string} and enter {string}")
	public void user_enter_and_enter(String username, String password) {
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	    
	}

	@Then("Varify error massage")
	public void Varify_error_massage() {
	 String errormsg = driver.findElement(By.xpath("//div[text()='Something went wrong...']")).getText();
	 Assert.assertEquals(errormsg,"Something went wrong...");
	}


}
