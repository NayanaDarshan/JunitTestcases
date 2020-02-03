package JunitTest;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	static WebDriver driver;
	static String URL = "http://warr-qa-bt39.solarsoft.local:8140/WebTrack/Search.aspx";
	
	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			
			driver.findElement(By.xpath("//input[@id='PageHeader_SearchBar_SearchTextBox']")).sendKeys("NRTEST03");
			
			driver.findElement(By.xpath("//input[@id='PageHeader_SearchBar_SearchButton']")).click();
			
			WebElement icon= driver.findElement(By.xpath("//input[@id='PageBody_ctl05_ShowQtyBreaksButton']"));
			
			icon.click();
			
			String Phandle= driver.getWindowHandle();
			
			System.out.println("The parent window is" +Phandle);
			
			Set <String> Chandles=  driver.getWindowHandles();
			
			for ( String childHandle : Chandles) {
				
				System.out.println(childHandle);
				
				if(!Phandle.equals(childHandle)) {
					
					driver.switchTo().window(childHandle);
					
					System.out.println("The user is in child window is: "+driver.getTitle());
					
					driver.close();
					
					
				}
				
				
				
				
				
			}
			
			
				
			
			
	}

}
