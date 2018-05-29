
// we divide each page of admin into pages. then these pages creates method and calls the data...
package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testcases.registerNurseTest;
import util.Constants;

// pages are classes
	@SuppressWarnings("unused")
	public class registerNursePage {
		WebDriver driver;
		public registerNursePage(WebDriver dr)
    {
		driver=dr;
	}
	
	@FindBy(xpath=Constants.Image)
	WebElement Image;
	@FindBy(xpath=Constants.Fname)
	WebElement Fname;
	@FindBy(xpath=Constants.Lname)
	WebElement Lname;
	@FindBy(xpath=Constants.CallName)
	WebElement CallName;
	@FindBy(xpath=Constants.Mobile)
	WebElement Mobile;
	@FindBy(xpath=Constants.Rpassword)
	WebElement Rpassword;
	@FindBy(xpath=Constants.Rcpassword)
	WebElement Rcpassword;
	@FindBy(xpath=Constants.Next)
	WebElement Next;
	
	
	// this a method of above class.
	public void registerANurse(String fn, String ln, String cl, String mob, String pass,String cpass,String gender) throws Exception
	{
		//image upload code
		String pic= "/home/anchal/Desktop/download.jpeg";
	WebDriverWait wait=new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space(text())='Register a new Nurse']")));
		driver.findElement(By.xpath("//button[normalize-space(text())='Register a new Nurse']")).click();
	Thread.sleep(3000);
	try
	{
		try
		{
			Image.click(); //nurse button
			StringSelection ss1=new StringSelection(pic);
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
			
		}
		catch(Exception e)
		{
			System.out.println("problem in uploading image");
		}
		
	}
	
	catch(Exception e)
	   {
		System.out.println("Image upload prob");
	   }
	Thread.sleep(3000);
	System.out.println(fn);
	
	Fname.sendKeys(fn);
	Thread.sleep(1000);
	Lname.sendKeys(ln);
	CallName.sendKeys(cl);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@value='"+gender+"']")).click();
	
	Mobile.sendKeys(mob);
	Thread.sleep(1000);
	Rpassword.sendKeys(pass);
	Thread.sleep(1000);
	Rcpassword.sendKeys(cpass);
	Thread.sleep(3000);
	WebElement a = driver.findElement(By.xpath("(//button[@class='dashboardTab btn btn-lg btn-default'])[1]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", a);
	Thread.sleep(1500);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space(text())='Next'])[1]")));
	driver.findElement(By.xpath("(//button[normalize-space(text())='Next'])[1]")).click();   		
	Thread.sleep(5000);
}
	}