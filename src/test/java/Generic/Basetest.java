package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	 protected WebDriver driver;
	 protected String origin;
	 protected String npin;
	 protected String nsp;
	 protected String nep;
	 protected String piin;
	 protected String bpin;
	 protected String mpin;
	 protected String bopin;
	 protected String bsp;
	 protected String bep;
	

@BeforeMethod
	public void setup() throws IOException{
		
		
		driver = new ChromeDriver();
		
		Properties properties = new Properties();
		
		FileInputStream file= new FileInputStream("C:\\Users\\vaish\\OneDrive\\Desktop\\SDET\\Naptool\\src\\test\\resources\\config.properties");
		
		properties.load(file);
		
		String origin = properties.getProperty("url");
		
		driver.get(origin);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		npin= properties.getProperty("pin");
		
		nsp= properties.getProperty("sp");
		
		nep= properties.getProperty("ep");
		
		piin=properties.getProperty("pin");
		
		bpin=properties.getProperty("pin");
		
		mpin= properties.getProperty("pin");
		
		bopin=properties.getProperty("pin");
		
		bsp= properties.getProperty("sp");
		
		bep= properties.getProperty("ep");
		
		
				
}



@AfterMethod
public void teardown() {
	driver.quit();
	

}
}
