package JunitTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JunitTestcases {
     WebDriver driver;
     String BaseURL;
     String Current_URL;
     
	@Before
	public void setUp() throws Exception {
		BaseURL="https://www.airasia.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(BaseURL);
	    driver.findElement(By.xpath("//span[@class="text-item"and @id="loginModal"])));
	    driver.findElement(By.id("sso-login-email-input")).click();
	    driver.findElement(By.id("sso-login-email-input")).sendKeys("Nayana.28mr@gmail.com");
	   
	    driver.findElement(By.id("sso-login-password-input")).click();
	    driver.findElement(By.id("sso-login-password-input")).sendKeys("Nayana");
	    driver.findElement((By.xpath("//button[contains(text(),'Log in']"))).sendKeys(Keys.ENTER);
	   
	}

	@After
	
	public void tearDown() throws Exception {
		//driver.close();
				
	}

	
}
