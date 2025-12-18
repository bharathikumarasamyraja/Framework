package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class AmazonTest extends BaseClass{
	
	@Test
	public void Amazontitle() {
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}
	@Test
    public void verifyAmazonUrl() {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("amazon.in"));
    }
}
