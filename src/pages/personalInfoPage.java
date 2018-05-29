package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testcases.registerNurseTest;
import util.Constants;

// pages are classes
	@SuppressWarnings("unused")
	public class personalInfoPage {
		WebDriver driver;
		public personalInfoPage(WebDriver dr)
    {
		driver=dr;
	}
		@FindBy(xpath=Constants.Passport)
		WebElement Passport;
		@FindBy(xpath=Constants.Image2)
		WebElement Image2;
		@FindBy(xpath=Constants.Address)
		WebElement Address;
		@FindBy(xpath=Constants.City)
		WebElement City;
		@FindBy(xpath=Constants.StreetAdd)
		WebElement StreetAdd;
		@FindBy(xpath=Constants.Postal)
		WebElement Postal;
		@FindBy(xpath=Constants.Closest)
		WebElement Closest;
		@FindBy(xpath=Constants.Email)
		WebElement Email;
		@FindBy(xpath=Constants.DOB)
		WebElement DOB;
		@FindBy(xpath=Constants.Month)
		WebElement Month;
		@FindBy(xpath=Constants.Year)
		WebElement Year;
		@FindBy(xpath=Constants.selectYear)
		WebElement selectYear;
		@FindBy(xpath=Constants.selectMonth)
		WebElement selectMonth;
		@FindBy(xpath=Constants.selectDay)
		WebElement selectDay;
		@FindBy(xpath=Constants.Emergency)
		WebElement Emergency;
		
		public void registerNurseTwo(String p, String ad,String close,String email,String emerg, String db) throws Exception {
			//image upload code
					String pic= "/home/anchal/Desktop/download.jpeg";
				WebDriverWait wait=new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.Passport)));
					driver.findElement(By.xpath("//button[normalize-space(text())='Register a new Nurse']")).click();
				Thread.sleep(3000);
				try
				{
					Image2.click(); //nurse button
					StringSelection ss2=new StringSelection(pic);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
					Robot robo1=new Robot();
					Thread.sleep(3000);
					robo1.keyPress(KeyEvent.VK_CONTROL);
					robo1.keyPress(KeyEvent.VK_V);
					robo1.keyRelease(KeyEvent.VK_CONTROL);
					robo1.keyRelease(KeyEvent.VK_V);
					Thread.sleep(3000);
					robo1.keyPress(KeyEvent.VK_ENTER);
					robo1.keyRelease(KeyEvent.VK_ENTER);
					
				}
				catch(Exception e)
				{
					System.out.println("problem in uploading image");
				}
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"formHospitalReg_2\"]/div[4]/div[1]/div[2]")).click();
				Passport.sendKeys(p);
				
				Thread.sleep(1000);
				Address.sendKeys(ad);
				Thread.sleep(500);
				Address.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(500);
				Address.sendKeys(Keys.ENTER);
							
				driver.findElement(By.xpath("//*[@id=\"formHospitalReg_2\"]/div[4]/div[1]/div[2]")).click();
				Thread.sleep(1000);
				
				Closest.sendKeys(close);
				Thread.sleep(1000);
				
				DOB.sendKeys(db);
				Thread.sleep(1000);
				
				Email.sendKeys(email);
				Thread.sleep(1000);
		
				Emergency.sendKeys(emerg);
				Thread.sleep(1000);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space(text())='Next'])[2]")));
				driver.findElement(By.xpath("(//button[normalize-space(text())='Next'])[2]")).click(); 
					
			
		}
		
}
