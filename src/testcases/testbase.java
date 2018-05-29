package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Xls_Reader;

public class testbase {

	public static WebDriver driver;
	public static Xls_Reader xls = new Xls_Reader("/home/anchal/eclipse-workspace/NOL/src/data/NOLSheet.xls");

	   
	public void init() {
		System.out.println("launching Chrome browser"); 
		System.setProperty("webdriver.chrome.driver","/home/anchal/eclipse/chromedriver");
		driver = new ChromeDriver();
	}
	
}
