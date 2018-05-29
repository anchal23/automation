package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Constants;

public class MedicalInfoPage {

	WebDriver driver;
	public MedicalInfoPage(WebDriver dr)
	{
		
		driver=dr;
	}
	@FindBy(xpath=Constants.hepatitis)
	WebElement hepatitis;
	@FindBy(xpath=Constants.hepatitisNo)
	WebElement hepatitisNo;
	@FindBy(xpath=Constants.errorMsg)
	WebElement errorMsg;
	@FindBy(xpath=Constants.crimRecordNo)
	WebElement crimRecordNo;
	@FindBy(xpath=Constants.Back3)
	WebElement Back3;
	@FindBy(xpath=Constants.Next5)
	WebElement Next5;
	
	public void medicalInfo() throws Exception
	{
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.hepatitis)));
		Thread.sleep(1200);
		hepatitisNo.click();
		try
		{
			Next5.click();
			Thread.sleep(1000);
			if(errorMsg.isDisplayed())
			{
				
				System.out.println(errorMsg.getText());
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error->>"+errorMsg.getText());
		System.out.println("Please select yes and upload doc");
		}
		
		Thread.sleep(1200);
		try
		{
		hepatitis.click();
		//yaha upload doc ke button wala aclcik laga de
		StringSelection ss1=new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		Robot robo1=new Robot();
		Thread.sleep(3000);
		robo1.keyPress(KeyEvent.VK_CONTROL);
		robo1.keyPress(KeyEvent.VK_V);
		robo1.keyRelease(KeyEvent.VK_CONTROL);
		robo1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robo1.keyPress(KeyEvent.VK_ENTER);
		robo1.keyRelease(KeyEvent.VK_ENTER);
		
		crimRecordNo.click();
		}
		
		catch(Exception e)
		{
			System.out.println("problem in uploading doc");
		}
		
		Thread.sleep(3200);
		
		
				
		
			
		
	}

}
