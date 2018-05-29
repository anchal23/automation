package testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AdminSignUpPage;
import util.Testutil;

public class AdminSignUpTest extends testbase{
	@BeforeSuite
	 public void initiate()
	 {
	  init();  // starts driver
	 }
	 @Test(dataProvider="SignIn")
	 public void SignInas(Hashtable<String,String> data) throws Exception
	 {
	  if(!Testutil.isExecutable("SignIn", xls) || data.get("Runmode").equals("N"))
	   throw new SkipException("Skipping the test");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   AdminSignUpPage psp = PageFactory.initElements(driver, AdminSignUpPage.class);
	   psp.SignUpPage(data.get("UserName"),data.get("Password"));
	  // psp.SignUpPage(data.get("Password"));

	   
	 }
	 @DataProvider
	 public Object[][] SignIn()
	 {
	  return Testutil.getData("SignIn", xls);
	 }

}
