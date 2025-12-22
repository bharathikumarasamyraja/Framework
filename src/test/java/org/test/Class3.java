package org.test;

import org.testng.annotations.Test;

public class Class3 {
	@Test(groups = {"regression"})
	private void class3method1()
	{
		
		System.out.println(System.currentTimeMillis());
		System.out.println("Class3 Method 1");
		}
}
