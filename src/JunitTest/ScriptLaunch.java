package JunitTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptLaunch {
	
	public static void main(String[] args) {
	
	WebDriver driver;
	JavascriptExecutor Js;
	//String URL="Syntax error on token "System", delete this token";
	
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
	Js=(JavascriptExecutor) driver;
	driver.manage().window().maximize();
    Js.executeScript("window.location ='http://warr-qa-bt39.solarsoft.local:8140/WebTrack/UserSignup.aspx';");
	
    long Height=  (long)Js.executeScript("return window.innerHeight");
    long Width=  (long)Js.executeScript("return window.innerWidth");
    
    System.out.println("The height is "+Height);
    System.out.println("The width is " +Width);
	
	//driver.manage().window().maximize();
	//driver.get(URL);
	
}
}


