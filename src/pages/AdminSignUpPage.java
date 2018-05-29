package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Constants;

// pages are classes
public class AdminSignUpPage {

	WebDriver driver;
	// constructor 
	public AdminSignUpPage(WebDriver dr)
	{
		driver=dr;
	}
	@FindBy(xpath=Constants.userName)
	WebElement userName;
	@FindBy(xpath=Constants.Password)
	WebElement Password;
	@FindBy(xpath=Constants.Login)
	WebElement Login;
	public void SignUpPage(String username,String password) throws Exception
	{
		driver.get(Constants.URL+"/#/page/login");
		WebDriverWait wait=new WebDriverWait(driver,60);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.userName)));
		userName.sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.Password)));
		Password.sendKeys(password);
	  Login.click();
	}
	
}
