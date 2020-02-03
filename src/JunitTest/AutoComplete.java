package JunitTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete {
	static WebDriver driver;

	public static void main(String[] args) {

		String BaseURL = "https://www.airasia.com/check-in/en/gb";
		
		String Strname="Bengaluru (BLR)";
		String xpath1="//mat-option[@id='mat-option-";
		String xpath2= "']//span[@class='mat-option-text']";
		
		String cmpare="xpath1+textvalues.get(i).getText()+xpath2";

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BaseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@id='home-origin-autocomplete-heatmap']")).click();
		
		//driver.findElement(By.xpath("//div[@class='search-body']")).click();
		//driver.findElement(By.xpath("//parent::div[@class='input-field']//input[@id='departureCityInput']")).click();
		
		WebElement text= driver.findElement(By.xpath("//input[@id='departureCityInput']//parent::div[@class='input-field']"));
	    
		text.click();
		
		List< WebElement> textvalues = driver.findElements(By.tagName("mat-option"));
		System.out.println(textvalues.size());
		
		
				
		
		//mat-option[@id='mat-option-774']//span[@class='mat-option-text']
		//mat-option[@id='mat-option-776']//span[@class='mat-option-text']
		
		for (int i=0; i<textvalues.size(); i++) {
			
		String valuesofoption=	driver.findElement(By.xpath(xpath1+textvalues.get(i)+xpath2)).getText();
		
		//System.out.println("The values are " +valuesofoption);
			
			//System.out.println("The values are =>"+ xpath1+textvalues.get(i).getText()+xpath2);
	
			if(valuesofoption.equals(Strname)) {
				driver.findElement(By.xpath(xpath1+textvalues.get(i)+xpath2)).click();
			
             break;
             
		}
		
		}
	}
}
	

		
	

			
			/*if( textvalues.get(i).equals("Bengaluru (BLR)")) {
				
				textvalues.get(i).click();
				
				break;
			
		
		
	
		
		
	  //  driver.findElement(By.xpath("//input[@id='bookingNumberInput']")).sendKeys("BOOK123");
		*/
		/*
		 * WebElement list= driver.findElement(By.xpath(
		 * "//select[@id='ControlGroupRetrieveBookingExpediaAKView_BookingRetrieveInputExpediaAKView_ORIGINCITY1']"
		 * ));
		 * 
		 * list.click();
		 * 
		 * 
		 * Select sel= new Select(list);
		 * 
		 * sel.selectByVisibleText("Kota Bharu (KBR)");
		 * 
		 * 
		 * 
		 * List <WebElement> lvalues= sel.getOptions();
		 * 
		 * 
		 * for ( WebElement lvalues1 : lvalues) {
		 * 
		 * System.out.println(lvalues1.getText());
		 * 
		 * }
		 */
		 
		/*
		 * WebElement list = driver.findElement(
		 * By.xpath("//input[@id='home-destination-autocomplete-heatmap']"));
		 * 
		 * list.clear();
		 */
		/*
		 * driver.findElement(By.xpath(
		 * "//a[@id='PageHeader_MenuBar_SignInLink_SignInHyperlink']")).click();
		 * driver.findElement(By.xpath(
		 * "//input[@id='PageBody_SignInControl_UserNameTextBox']")).sendKeys("Nayana");
		 * driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		 * driver.findElement(By.xpath(
		 * "//li[@id='PageHeader_MenuBar_ProductCatalogLink']//a[contains(text(),'Products')]"
		 * )).click();
		 * 
		 * WebElement textbox= driver.findElement(By.xpath(
		 * "//input[@id='PageHeader_SearchBar_SearchTextBox']"));
		 * 
		 * textbox.click();
		 */


