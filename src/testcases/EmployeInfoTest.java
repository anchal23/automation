package testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.EmployeInfoPage;
import util.Testutil;

public class EmployeInfoTest extends testbase{
//	@BeforeSuite
//	 public void initiate()
//	 {
//	  init();  // starts driver
//	 }
	 @Test(dataProvider="EmployeInfo")
	 public void SignInas(Hashtable<String,String> data) throws Exception
	 {
	  if(!Testutil.isExecutable("EmployeInfo", xls) || data.get("Runmode").equals("N"))
	   throw new SkipException("Skipping the test");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   EmployeInfoPage psp = PageFactory.initElements(driver, EmployeInfoPage.class);
	   psp.EmployeInfo(data.get("employrName "),data.get("Wards"),data.get("position "),data.get("duration"),data.get("Instituion"),data.get("Telno"),data.get("ContactPerson"),data.get("Employed"));
	  // psp.SignUpPage(data.get("Password"));

	   
	 }
	 @DataProvider
	 public Object[][] EmployeInfo()
	 {
	  return Testutil.getData("EmployeInfo", xls);
	 }

}
