
// this class is used to pick test data from excel sheet...
package testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import pages.AdminSignUpPage;
import pages.registerNursePage;
import util.Testutil;

public class registerNurseTest extends testbase {
//	@BeforeSuite
//	 public void initiate()
//	 {
//	  init();  // starts driver
//	 }
	
	
	@Test(dataProvider="RegisterNurse")
	 public void registerNurse11(Hashtable<String,String> data) throws Exception
	 {
	  if(!Testutil.isExecutable("RegisterNurse", xls) || data.get("Runmode").equals("N"))
	   throw new SkipException("Skipping the test");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   registerNursePage psp = PageFactory.initElements(driver, registerNursePage.class);
	   psp.registerANurse(data.get("Fname"),data.get("Lname"),data.get("CallName"),data.get("Mobile"),data.get("Rpassword"),data.get("Rcpassword"),data.get("Gender"));
//	   psp.registerNurseTwo(data.get("Passport"),data.get("Address"),data.get("City"),data.get("StreetAdd"),data.get("Postal"),data.get("Nation"));

	 }
	 @DataProvider
	 public Object[][] RegisterNurse()
	 {
	  return Testutil.getData("RegisterNurse", xls);
	 }

}
