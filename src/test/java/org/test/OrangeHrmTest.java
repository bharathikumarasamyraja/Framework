package org.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class OrangeHrmTest extends BaseClass{
	@Test (dataProviderClass= DataProviderUsingExcel.class,dataProvider = "excelReader")
	public void loginverification(String username, String password) {
			
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}

}
