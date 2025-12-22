package org.test;

import org.testng.annotations.Test;

public class Class2 {
	@Test (groups = {"smoke", "regression"})
	private void class2method1()
	{
		
		System.out.println(System.currentTimeMillis());
		System.out.println("Class2 Method 1");
		}
	@Test(groups = {"sanity", "smoke"})
	private void class2method2()
	{
		
		System.out.println(System.currentTimeMillis());
		System.out.println("Class2 Method 2");
		}
}
