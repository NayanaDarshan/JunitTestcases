package JunitTest;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsBasics {
	WebDriver driver;
	String BaseURL;

	@Before
	public void setUp() throws Exception {
		BaseURL="https://airasia.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	@Test
	
	public void test() {
		driver.get(BaseURL);
		//driver.findElement(By.className("search-icon")).click();
		//driver.findElement(By.id("gsc-i-id1")).sendKeys("Selenium");
		driver.findElement(By.xpath("//a[contains(text(), 'Support')]")).click();
		String Parent_Handle= driver.getWindowHandle();
		System.out.println("The parent handle is" +Parent_Handle);
		
	Set <String> Childhandles = driver.getWindowHandles();
		for (String Handles: Childhandles) {
			System.out.println("The child handles are " +Handles);
			
			if(!Handles.equals(Parent_Handle)) {
				driver.switchTo().window(Handles);
				driver.findElement(By.id("253:0")).sendKeys("Nayana");
				driver.switchTo().window(Parent_Handle);
				driver.findElement(By.id("home-flight-search-airasia-button-inner-button-select-flight-heatmap")).click();
				
				
			}
		}
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
