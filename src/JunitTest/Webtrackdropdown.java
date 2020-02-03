package JunitTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtrackdropdown {

	public static void main(String[] args) {
		WebDriver driver;
		String URL = "http://warr-qa-bt39.solarsoft.local:8140/WebTrack/BranchSelect.aspx";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

		WebElement Cdrp = driver
				.findElement(By.xpath("//select[@id='PageBody_DeliveryAddress_CountrySelector_CountryList']"));
		
		dropselection(Cdrp, "[Select country]");
		driver.findElement(By.xpath("//label[contains(text(),'Collect Later')]")).click();
		
		WebElement Bdrp = driver
				.findElement(By.xpath("//select[@id='PageBody_SearchCallbackPanel_BranchDropDownList']"));
		
		dropselection(Bdrp, "Runcorn - The Heath, Runcorn, Chesire, WA7 4QX, United Kingdom");
		/*
		 * Select sel = new Select(Cdrp); List<WebElement> dropopt= sel.getOptions();
		 * 
		 * for ( WebElement opt : dropopt) { System.out.println(opt.getText()); }
		 * 
		 * sel.selectByVisibleText("[Select country]");
		 * 
		 * 
		 * driver.findElement(By.xpath("//label[contains(text(),'Collect Later')]")).
		 * click(); WebElement Bdrp= driver.findElement(By.xpath(
		 * "//select[@id='PageBody_SearchCallbackPanel_BranchDropDownList']")); Select
		 * sel1 = new Select(Bdrp); sel1.selectByIndex(1); }
		 * 
		 */
		String name=driver.getTitle();
		System.out.println(name);

	}


	public static void dropselection(WebElement element, String value) {

		Select selection = new Select(element);

		selection.selectByVisibleText(value);

	}

}

