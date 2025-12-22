package org.test;

import org.testng.annotations.Test;

public class Class1 {
	@Test(groups = {"sanity"})
	private void class1method1()
	{
		
		System.out.println(System.currentTimeMillis());
		System.out.println("Class1 Method 1");
		}

}
