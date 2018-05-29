package testcases;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import pages.MedicalInfoPage;


public class MedicalInfoTest extends testbase{
	
	 @Test
	 public void medicleInfo() throws Exception
	 {
	
		 MedicalInfoPage mip=PageFactory.initElements(driver, MedicalInfoPage.class);
		 mip.medicalInfo();
	 }
}