package testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.personalInfoPage;
import util.Testutil;

public class personalinfo extends testbase{


	
	
	@Test(dataProvider="Personalinfo")
	 public void registerNurse11(Hashtable<String,String> data) throws Exception
	 {
	  if(!Testutil.isExecutable("personalinfo", xls) || data.get("Runmode").equals("N"))
	   throw new SkipException("Skipping the test");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   personalInfoPage psp = PageFactory.initElements(driver, personalInfoPage.class);
	 
	   psp.registerNurseTwo(data.get("Passport"),data.get("Address"),data.get("Closest"),data.get("Email"),data.get("Date"),data.get("Emergency"));

	 }
	 @DataProvider
	 public Object[][] Personalinfo()
	 {
	  return Testutil.getData("personalinfo", xls);
	 }
}
