package PageClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CRMproRegistrationPOM {
	@FindBy(xpath="//input[@name='payment_plan_id']") private WebElement CRMproEditiondropdown;
	@FindBy(xpath="//input[@name='first_name']") private WebElement first_name;
	@FindBy(xpath="//input[@name='last_name']") private WebElement last_name;
	@FindBy(xpath="//input[@name='email']") private WebElement email;
	@FindBy(xpath="//input[@name='email_confirm']") private WebElement email_confirm;
	@FindBy(xpath="//input[@name='username']") private WebElement username;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//input[@name='passwordconfirm']") private WebElement passwordconfirm;
	@FindBy(xpath="//input[@type='checkbox']") private WebElement Checkbox;
	@FindBy(xpath="//*[@id=\"multipleForm\"]/div[12]/div") private WebElement SubmitBtn;
	
	public CRMproRegistrationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCRMproEditionDropDown() {
		Select s=new Select(CRMproEditiondropdown);
		s.selectByVisibleText("Free Edition");
	}
	
	public void verifyCRMproFirstNameField(String username) {
		Assert.assertTrue("first name field is not displayed on the registration page", first_name.isDisplayed());
		first_name.sendKeys(username);
	}
	
	public void verifyCRMproLastNameField(String lastname) {
		Assert.assertTrue("Last name field is not displyed on the registration page",last_name.isDisplayed());
		last_name.sendKeys(lastname);
	}
	
	public void verifyCRMproEmailIdField(String email_Id) {
		Assert.assertTrue("email id field is not displayed on the webpage",email.isDisplayed());
		email.sendKeys(email_Id);
	}
	
	public void verifyCRMproEmailIdConfirmField(String confirm_EmailID) {
		Assert.assertTrue("Confirm email id field is not displayed",email_confirm.isDisplayed());
		email_confirm.sendKeys(confirm_EmailID);
	}
	
	public void VerifyCRMproUsernameField(String username1) {
		username.sendKeys(username1);
	}
	
	public void VerifyCRMproPasswordField(String password1) {
		password.sendKeys(password1);
	}
	
	public void VerifyCRMproConfirmPasswordField(String cpassword) {
		passwordconfirm.sendKeys(cpassword);
	}
	
	public void verifyCRMproRegistrationPageCheckBoxIsClickable() {
		Checkbox.click();
	}
	
	public void VerifyCRMproRegistrationSubmitBtnIsClickable() {
		SubmitBtn.click();
	}
	
	
	
	
	

}
