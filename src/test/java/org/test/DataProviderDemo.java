package org.test;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeMethod
	public void browserSetup()
	{
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider = "data")
	public void TitleVerification(String title)
	{
		Assert.assertEquals(driver.getTitle(), title);
	}

	
	@Test(dataProvider = "datas")
	public void LoginVerification(String username, String password) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("dashboard"));
	
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
    
	@DataProvider
	public String[] data()
	{
		String[] arr = {"OrangeHRM"}
		return arr;
	}
	
	@DataProvider
	public String[][] datas() {
		String [] [] arr = {
				{"Admin","admin123"},
				{"oranium","oranium123"},
				{"Priya","Priya123"}
		};
		return arr;
		
	}
}
