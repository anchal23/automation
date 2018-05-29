package testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.personalInfoPage;
import pages.profesionalInfoPage;
import util.Testutil;

public class profesionalInfoTest extends testbase{


	
	
	@Test(dataProvider="profesionalInfo")
	 public void registerNurse11(Hashtable<String,String> data) throws Exception
	 {
	  if(!Testutil.isExecutable("profesionalInfo", xls) || data.get("Runmode").equals("N"))
	   throw new SkipException("Skipping the test");
	  
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   profesionalInfoPage psp = PageFactory.initElements(driver, profesionalInfoPage.class);
	   psp.profesionalInfo(data.get("IncomeTax"),data.get("SancRecipt"),data.get("Sancyear"),data.get("Sancno"),data.get("Nursty"));

	 }
	 @DataProvider
	 public Object[][] 
			 profesionalInfo()
	 {
	  return Testutil.getData("profesionalInfo", xls);
	 }
	 }