package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
    @BeforeSuite
	private void beforeSuite() {
		System.out.println("BeforeSuite");		
	}
    @BeforeTest
	private void beforeTest() {
		System.out.println("BeforeTest");
    }
		@BeforeClass
		private void beforeClass() {
			System.out.println("BeforeClass");
		}
			@BeforeMethod
			private void beforeMethod() {
				System.out.println("BeforeMethod");
			}
				
				@Test
				private void test02() {
					System.out.println("test02");}
					@Test
					private void test01() {
						System.out.println("test01");}
				
				
				
				@AfterTest
				private void afterTest() {
					System.out.println("afterTest");}
					@AfterClass
					private void afterClass() {
						System.out.println("afterClass");}
						@AfterMethod
						private void afterMethod() {
							System.out.println("afterMethod");}
							@AfterSuite
							private void afterSuite() {
								System.out.println("afterSuite");}
					
				
				
				
						}		
			
		
	


