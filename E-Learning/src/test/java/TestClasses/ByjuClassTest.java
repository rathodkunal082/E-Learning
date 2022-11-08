package TestClasses;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.AllBrowser;
import POMClasses.ByjuLogin;

public class ByjuClassTest<driver> extends AllBrowser {
	
	@BeforeClass
	public void setup() {
		Setup("chrome");
		driver.get("https://byjus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@AfterClass
	public void teardown() {
		AllBrowser.driver.close();
	}
	
	@Test
	public void ByjuLoginPageTest() {
		ByjuLogin l=new ByjuLogin(driver);
		
		l.VerifyByjuLoginPageLogo();
		
		l.VerifyByjuLoginBtn();
		
		l.VerifyLoginText();
		
		l.VerifycountrycodeDropDown();
		
		l.VerifyMobNoText();
		
		l.VerifyMobileNoTextField();
		
		l.VerifyContinueBtn();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
