package org.test;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.utility.BaseClass;

public class ListenersDemo extends BaseClass{
	@Test(dataProviderClass= DataProviderUsingExcel.class, dataProvider = "excelReader")
	public void loginVerification(String username,String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("dashboard"));
	}

}
