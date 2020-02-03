package Properties;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PropertiesTest {
	static Properties prop = new Properties();
	public static void main(String[] args) throws IOException {
		
		writingdata();
		Readingvalue();  
         
		

	}

	public static void writingdata() throws IOException {
		FileOutputStream output= new FileOutputStream("C:\\Java_Projects\\Java_Project\\JunitTestcases\\src\\Properties\\readingdata.properties");
		
		prop.setProperty("Username", "SMIRADARSHAN");
		prop.store(output, "nayanaeditedit");
		
		
	}
	
	
	public static void Readingvalue() throws IOException {
	
		try {
			FileInputStream Input = new FileInputStream("C:\\Java_Projects\\Java_Project\\JunitTestcases\\src\\Properties\\readingdata.properties");
			prop.load(Input);
			
			System.out.println(prop.getProperty("Username"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}