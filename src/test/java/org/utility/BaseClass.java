package org.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod
	public static WebDriver browserSetup() throws IOException {
File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
		
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		String url = prop.getProperty("testurl");
		String browser = prop.getProperty("testbrowser");
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			driver.get(url);
		}
		else 
		{
			System.out.println("Enter a valid browser name in property file");
		}
		return driver;
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
