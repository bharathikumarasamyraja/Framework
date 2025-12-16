package org.test;

import org.testng.annotations.Test;

public class Attributes {
	@Test(priority = -2, description = "login functionality", expectedExceptions =Exception.class )
	private void login()
	{
		System.out.println("It is a login functionality");
		System.out.println(10/0);
		}
@Test(priority = -1, description = "homepage functionality", dependsOnMethods = "login", alwaysRun = true )
private void homepage()
{
	System.out.println("It is a homepage functionality");
	}
@Test(priority = 0, description = "productpage functionality",invocationCount = 2,invocationTimeOut=2000 )
private void productpage()
{
	System.out.println("It is a productpage functionality");
	}
@Test(priority = 1, description = "Searchpage functionality", timeOut = 2000)
private void Searchpage() throws InterruptedException
{
	System.out.println("It is a Searchpage functionality");
	Thread.sleep(2000);
	}

@Test(priority = 2, description = "logout functionality", enabled = false)
private void logout()
{
	System.out.println("It is a logout functionality");
	}




}

