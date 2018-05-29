package testcases;

import org.testng.annotations.Test;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AdminSignUpPage;
import pages.PaymentDetailsPage;
import util.Testutil;

public class PaymentDetailsTest extends testbase{
//	@BeforeSuite
//	 public void initiate()
//	 {
//	  init();  // starts driver
//	 }
	
	 @Test(dataProvider="PaymentInfo")
	 // this is a method of PaymentDetails class....
	 public void PaymentInfo(Hashtable<String,String> data) throws Exception
	 {
	  if(!Testutil.isExecutable("SignIn", xls) || data.get("Runmode").equals("N"))
	   throw new SkipException("Skipping the test");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   PaymentDetailsPage psp = PageFactory.initElements(driver, PaymentDetailsPage.class);
	   psp.PaymentInfo(data.get("AccholderName"),data.get("BankName"),data.get("BranchName"),data.get("Branchcode"),data.get("AccountType"),data.get("AccNo"));
 
	 }
	 
	 @DataProvider
	 public Object[][] PaymentInfo()
	 {
	  return Testutil.getData("PaymentInfo", xls);
	 }

}
