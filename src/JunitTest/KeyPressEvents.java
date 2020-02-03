package JunitTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyPressEvents {
	WebDriver driver;
	String BaseURL;

	@Before
	public void setUp() throws Exception {
		BaseURL="https:/letskodeit.teachable.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws Exception {
		driver.get(BaseURL);
		driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
		
		//Explicit waits
		  WebDriverWait wait = new WebDriverWait(driver, 3);
		  WebElement emailfield =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		  emailfield.sendKeys("Nayana.raghu@epicor.com");
		  
		  //Action class
		 // WebElement mainelement= driver.findElement((By.id("mousehover")));
		  //Actions act1 = new Actions(driver);
		  //act1.moveToElement(mainelement).perform();
		  
		  String parenthandles= driver.getWindowHandle();
		  System.out.println(" The parent handle is :" +parenthandles);
	      
		//driver.findElement(By.className("text-center")).sendKeys(Keys.CONTROL + "a");
		
		/*WebElement wb=driver.findElement(By.xpath("//a[@href=\"/pages/practice\"]"));
		wb.click();
		driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Thread.sleep(2000);
		//Actions class for key press events
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.COMMAND).perform();*/
		
		
		//driver.findElement(By.id("user_email")).sendKeys("Nayana@gmail.com");
	    //driver.findElement(By.id("user_email")).sendKeys(Keys.TAB);
		/*Thread.sleep(200);
		driver.findElement(By.id("user_password")).sendKeys("Tester");
		Thread.sleep(200);
		driver.findElement(By.name("commit")).sendKeys(Keys.RETURN);*/
	}

	@After
	public void tearDown() throws Exception {
	}


}
