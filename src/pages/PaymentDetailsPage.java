package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Constants;

// pages are classes
public class PaymentDetailsPage {

		WebDriver driver;
		public PaymentDetailsPage(WebDriver dr)
		{
			driver=dr;
		}
		
		@FindBy(xpath=Constants.AccholderName)
		WebElement AccholderName;
		@FindBy(xpath=Constants.BankName)
		WebElement BankName;
		@FindBy(xpath=Constants.BranchName)
		WebElement BranchName;
		@FindBy(xpath=Constants.Branchcode)
		WebElement Branchcode;
		@FindBy(xpath=Constants.AccountType)
		WebElement AccountType;
	    @FindBy(xpath=Constants.AccNo)
      	WebElement AccNo;
	
	public void PaymentInfo(String ac,String bn,String branch,String bcode,String acctype,String accno ) throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		Thread.sleep(3000);
		

		AccholderName.sendKeys(ac);
		Thread.sleep(1000);
		
		BankName.sendKeys(bn);
		Thread.sleep(1000);
		

		BranchName.sendKeys(branch);
		Thread.sleep(500);

		Branchcode.sendKeys(bcode);
		Thread.sleep(500);

		AccountType.sendKeys(acctype);
		Thread.sleep(500);
		
		AccNo.sendKeys(accno);
		Thread.sleep(500);
		}
}