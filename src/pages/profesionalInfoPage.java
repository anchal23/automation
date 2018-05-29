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

import testcases.profesionalInfoTest;
import util.Constants;

// pages are classes
	@SuppressWarnings("unused")
	public class profesionalInfoPage {
		WebDriver driver;
		public profesionalInfoPage(WebDriver dr)
    {
		driver=dr;
	}
		@FindBy(xpath=Constants.IncomeTax)
		WebElement IncomeTax;
		@FindBy(xpath=Constants.Sancyear)
		WebElement Sancyear;
		@FindBy(xpath=Constants.Sancno)
		WebElement Sancno;
		@FindBy(xpath=Constants.Nursty)
		WebElement Nursty;
		@FindBy(xpath=Constants.SancRecipt)
		WebElement SancRecipt;
	    @FindBy(xpath=Constants.ReciptNo)
      	WebElement ReciptNo;
	    
////		@FindBy(xpath=Constants.Employed)
////		WebElement Employed;
////		@FindBy(xpath=Constants.Transport)
////		WebElement Transport;
//		@FindBy(xpath=Constants.Experience)
//		WebElement Experience;
//		@FindBy(xpath=Constants.RegWith)
//		WebElement RegWith;
//			 	
		public void profesionalInfo(String it, String sy,String sn,String type,String recipt) throws Exception {
			//image upload code
					String pic= "/home/anchal/Desktop/download.jpeg";
				WebDriverWait wait=new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.IncomeTax)));
					driver.findElement(By.xpath("//button[normalize-space(text())='Register a new Nurse']")).click();
				Thread.sleep(3000);
				try
				{
					ReciptNo.click(); 
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
				
				IncomeTax.sendKeys(it);
				Thread.sleep(1000);
				
                Sancno.sendKeys(sn);
				Thread.sleep(1000);
				
				Sancyear.sendKeys(sy);
				Thread.sleep(500);
				Sancyear.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(500);
				Sancyear.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
           		driver.findElement(By.xpath("//*[@id=\"formHospitalReg_2\"]/div[4]/div[1]/div[2]")).click();
				
				
         		Nursty.sendKeys(type);
         		Thread.sleep(500);
         		Nursty.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(500);
				Nursty.sendKeys(Keys.ENTER);
//				
//				City.sendKeys(city2);
//				
//				Thread.sleep(1000);
//				Postal.sendKeys(post);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"formHospitalReg_3\"]/div[2]/div[1]/div[1]")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@value='OWN']")).click();
				Thread.sleep(500);
//				
				driver.findElement(By.xpath("//*[@id=\"formHospitalReg_2\"]/div[4]/div[1]/div[2]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"formHospitalReg_3\"]/div[3]/div/div/div")).click();
				Thread.sleep(500);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space(text())='Next'])[3]")));
		    	driver.findElement(By.xpath("(//button[normalize-space(text())='Next'])[3]")).click(); 
					
			
		}
		
}
