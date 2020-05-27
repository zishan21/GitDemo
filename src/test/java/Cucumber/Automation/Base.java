package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	
	public static WebDriver getDriver() throws IOException {
		
		properties = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Zishanali\\eclipse-workspace\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		properties.load(fis);
		
		
		System.setProperty("webdriver.chrome.diver", "C:\\bin\\chromedriver83\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
	    return driver;
	}
}
