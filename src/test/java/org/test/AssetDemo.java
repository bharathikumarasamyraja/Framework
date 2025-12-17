package org.test;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssetDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browserSetup() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void FBLoginPageTitleVerification()  //test verification1
	{
		
		@Nullable
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up", "Title verification failed");
		System.out.println("Completed");
		
	}
	@Test
	public void loginButtonIsEnabled() { //test verification 2
		WebElement login = driver.findElement(By.name("login"));
		 SoftAssert obj = new SoftAssert();
		 obj.assertTrue(login.isEnabled());
		 System.out.println("Completed");
		 obj.assertAll();
	}
	@Test
	public void ForgottenPasswordIsEnabled() {// Test Verification3
		WebElement Fpassword = driver.findElement(By.linkText("Forgotten password?"));
		 SoftAssert obj = new SoftAssert();
		 obj.assertTrue(Fpassword.isEnabled());
		 System.out.println("Completed");
		 obj.assertAll();
	}
	
	@Test
	public void CreateNewAccountIsEnabled() {// Test Verification4
		WebElement CreateNewButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		 SoftAssert obj = new SoftAssert();
		 obj.assertTrue(CreateNewButton.isEnabled());
		 System.out.println("Completed");
		 obj.assertAll();
	}
	
	@Test
	public void EmailTextBoxIsDisplayed() // Test Verification5
	{
		WebElement email = driver.findElement(By.id("email"));
		SoftAssert obj = new SoftAssert();
		 obj.assertTrue(email.isEnabled(), "TextBox is not Displayed");
		 System.out.println("Completed");
		 obj.assertAll();
	}
	@Test
	public void PasswordTextBoxIsDisplayed() // Test Verification6
	{
		WebElement password = driver.findElement(By.id("pass"));
		SoftAssert obj = new SoftAssert();
		 obj.assertTrue(password.isEnabled(), "TextBox is not Displayed");
		 System.out.println("Completed");
		 obj.assertAll();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
