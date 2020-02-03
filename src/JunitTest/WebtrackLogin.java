package JunitTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtrackLogin {
	//static WebDriver driver;
	//static String URL = "http://warr-qa-bt39.solarsoft.local:8140/WebTrack/UserSignup.aspx";
	

	public static void main(String[] args)throws IOException{
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);*/
		// ********************************************Clicking on Alerts
	
		/*
		 * WebElement btn = driver.findElement(By.xpath(
		 * "//a[@id='PageBody_InvoiceAddress_AddressFinderControl_PostcodeFinderFindPostcode']//span[contains(text(),'Find')]"
		 * ));
		 * 
		 * btn.click(); Alert alt = driver.switchTo().alert();
		 * 
		 * String text1 = alt.getText();
		 * 
		 * System.out.println(text1);
		 * 
		 * alt.accept();
		 */

		// **********************************************************************************

	
	
	}	
	
//Reading the data and xpath from config file
		
public void Readingvalue()

{
	Properties prop = new Properties();
	FileInputStream ip1= new FileInputStream("C:\\Java_Projects\\Java_Project\\JunitTestcases\\src\\JunitTest\\Config.properties");
	
    prop.load(ip1);
    
  System.out.println(prop.getProperty("Username"));
		
}


	


