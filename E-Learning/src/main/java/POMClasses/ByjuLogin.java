package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import BaseClass.AllBrowser;

public class ByjuLogin extends AllBrowser {
	
	@FindBy(xpath="//img[@src='https://cdn1.byjus.com/byjusweb/img/home/svg/byjus_logo.svg']") private WebElement logo;
	@FindBy(xpath="//a[@class='primary-login-btn']") private WebElement loginBtn;
	@FindBy(xpath="//p[text()='Login']") private WebElement LogInText;
	@FindBy(xpath="//p[@class='enter-your-txt']") private WebElement LogInTagLine;
	@FindBy(xpath="//label[text()='Mobile Number']") private WebElement MobNoText;
	@FindBy(xpath="//input[@placeholder='Enter your mobile number']") private WebElement MobileNoTextField;
	@FindBy(xpath="//span[text()='+91']") private WebElement countrycodeDropDown;
	@FindBy(xpath="//button[text()='Continue']") private WebElement ContinueBtn;
	
	public ByjuLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void VerifyByjuLoginPageLogo() {
		Assert.assertTrue(logo.isDisplayed(),"Log in page logo not present on the webpage");
		Reporter.log("VerifyByjuLoginPageLogo",true);
	}
	
	public void VerifyByjuLoginBtn() {
		Assert.assertTrue(loginBtn.isDisplayed(),"loginBtn is present on the webpage");
		Assert.assertEquals(loginBtn.getText(), "Login");
		loginBtn.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Reporter.log("VerifyByjuLoginBtn",true);
	}
	
	public void VerifyLoginText() {
		Assert.assertTrue(LogInText.isDisplayed(),"LogInText is not displayed");
		Assert.assertEquals(LogInText.getText(),"Login");
		Reporter.log("VerifyLoginText",true);
	}
	
	public void LogInTagLine() {
		Assert.assertEquals(LogInTagLine.getText(),"Enter your mobile number to continue your journey");
		Assert.assertTrue(LogInTagLine.isDisplayed(),"LogInTagLine is not displayed");
		Reporter.log("LogInTagLine",true);
	}
	
	public void VerifyMobNoText() {
		Assert.assertEquals(MobNoText.getText(),"Mobile Number");
		Assert.assertTrue(MobNoText.isDisplayed(), "MobNoText is not displayed");
		Reporter.log("VerifyMobNoText",true);
	}
	
	public void VerifyMobileNoTextField() {
		Assert.assertTrue(MobileNoTextField.isEnabled(),"MobileNoTextField is not enabled");
		MobileNoTextField.sendKeys("9767339040");
		Reporter.log("VerifyMobileNoTextField",true);
	}
	
	public void VerifycountrycodeDropDown() {
		Assert.assertEquals(countrycodeDropDown.getText(), "+91");
		
	}
	
	public void VerifyContinueBtn() {
		Assert.assertTrue(ContinueBtn.isDisplayed(),"ContinueBtn is not displayed");
		Assert.assertEquals(ContinueBtn.getText(),"Continue");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
