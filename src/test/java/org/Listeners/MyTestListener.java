package org.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener
{
	public void onStart(ITestContext context) {
	    System.out.println("on Class Started");
	  }
	public void onTestStart(ITestResult result) {
		System.out.println("on Test Started");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
		  }
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test Failure");
		  }
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skipped");
		  }
	public void onFinish(ITestContext context) {
		System.out.println("on Test Finished");
		  }

}
