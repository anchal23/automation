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

import util.Constants;

public class EmployeInfoPage{

	WebDriver driver;
	public EmployeInfoPage(WebDriver dr)
	{
		
		driver=dr;
	}
	@FindBy(xpath=Constants.EmpName)
	WebElement EmpName;
	@FindBy(xpath=Constants.Work)
	WebElement Work;
	@FindBy(xpath=Constants.Position)
	WebElement Position;
	@FindBy(xpath=Constants.Duration)
	WebElement Duration;
	@FindBy(xpath=Constants.Instituion)
	WebElement Instituion;
	@FindBy(xpath=Constants.Telno)
	WebElement Telno;
	@FindBy(xpath=Constants.ContactPerson)
	WebElement ContactPerson;
	@FindBy(xpath=Constants.Nursing)
	WebElement Nursing;
	@FindBy(xpath=Constants.Proof)
	WebElement Proof;
	@FindBy(xpath=Constants.Employed)
	WebElement Employed;

	// method
	
public void EmployeInfo(String em, String work, String pos, String dur,String institut,String tel,String CP,String employd ) throws Exception
{
WebDriverWait wait=new WebDriverWait(driver,60);

String pic= "/home/anchal/Desktop/download.jpeg";
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[.='Select Group']")));
Thread.sleep(2000);
driver.findElement(By.xpath("(//b[.='Select Group']/../following::div/button[.='Select'])[1]")).click();
Thread.sleep(1000);
for(int i=1;i<=3;i++)
{
driver.findElement(By.xpath("(//th[.='Group Name']/../../following-sibling::tbody/tr/td/input)["+i+"]")).click();
}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myModalHospital\"]/div/div/div[2]/div/form/div[2]/button[1]"))).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//b[.='Select Group']/../following::div/button[.='Select'])[2]")).click();

for(int j=1;j<4;j++)
{
driver.findElement(By.xpath("(//th[.='Hospital Name']/../../following-sibling::tbody/tr/td/input)["+j+"]")).click();
}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myModal3\"]/div/div/div[2]/div/form/div[2]/button[1]"))).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//b[.='Select Group']/../following::div/button[.='Select'])[3]")).click();
for(int k=1;k<3;k++)
{
driver.findElement(By.xpath("(//th[.='Ward Type']/../../following-sibling::tbody/tr/td/input)["+k+"]")).click();
}
driver.findElement(By.xpath("//*[@id=\"myModal3\"]/div/div/div[2]/div/form/div[2]/button[1]")).click();
Thread.sleep(1000);


try
{
	Nursing.click(); //nurse button
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


try
{
	Proof.click(); 
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

// TODO

EmpName.sendKeys(em);
Thread.sleep(1000);

Work.sendKeys(work);
Thread.sleep(500);

Position.sendKeys(pos);
Thread.sleep(500);

Duration.sendKeys(dur);

Instituion.sendKeys(institut);
Thread.sleep(500);

Telno.sendKeys(tel);
Thread.sleep(500);

ContactPerson.sendKeys(CP);
Thread.sleep(500);

Employed.sendKeys(employd);
Thread.sleep(500);


  }
}