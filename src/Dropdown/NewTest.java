package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;

	WebElement OriginList;
	String BaseURL = "https://www.airasia.com/en/gb";
	
	
	@BeforeMethod
	
	public void setup()

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get(BaseURL);

	}
	
	@Test
	public void Dropdownselection() {
		
		System.out.println("Clicking Hotel Link.....");
		
		//WebElement BookNum=driver.findElement(By.id("//input[@id='ControlGroupRetrieveBookingExpediaAKView_BookingRetrieveInputExpediaAKView_CONFIRMATIONNUMBER1']"));
		
		driver.findElement(By.xpath("//div[contains(text(), 'Hotels')]")).click();
		 /* Thread.sleep(2000);
		 * 
		 * System.out.println(BookNum.isDisplayed());
		 * System.out.println(BookNum.isEnabled()); BookNum.click();
		 * BookNum.sendKeys("Nayana");
		 * 
		 * 
		 */
		
	   // WebElement OriginList= driver.findElement(By.xpath("//select[@id='ControlGroupRetrieveBookingExpediaAKView_BookingRetrieveInputExpediaAKView_ORIGINCITY1']//parent::gtmactionname"));
		
	 //   Thread.sleep(2000);
		//Select sel= new Select(OriginList);
		
		//sel.selectByIndex(3);

		
	}

	@AfterMethod
	
	public void teardown() {
	//System.out.println("After class");
	}

	
	
	
	}

