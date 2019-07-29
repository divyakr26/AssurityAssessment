/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  org.openqa.selenium.WebDriver
 *  org.testng.IClass
 *  org.testng.IInvokedMethod
 *  org.testng.IResultMap
 *  org.testng.IRetryAnalyzer
 *  org.testng.ISuite
 *  org.testng.ISuiteListener
 *  org.testng.ITestContext
 *  org.testng.ITestListener
 *  org.testng.ITestNGMethod
 *  org.testng.ITestResult
 *  org.testng.Reporter
 *  org.testng.internal.ConstructorOrMethod
 *  org.testng.internal.Utils
 *  org.testng.xml.XmlTest
 */
package com.assurity.reports;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class WebTestListeners extends BaseTest implements ITestListener 
{private static String getTestMethodName(ITestResult iTestResult) {
    return iTestResult.getMethod().getConstructorOrMethod().getName();
}

@Override
public void onStart(ITestContext iTestContext) {
    System.out.println("I am in onStart method " + iTestContext.getName());
    Properties props = new Properties();
    try {
		props.load(new FileInputStream(System.getProperty("user.dir")+"//src//test//resource//log4j.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    PropertyConfigurator.configure(props);
}


@Override
public void onTestStart(ITestResult iTestResult) {
    System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
}

@Override
public void onTestSuccess(ITestResult iTestResult) {
    System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
    //ExtentReports log operation for passed tests.
   
}

@Override
public void onTestFailure(ITestResult iTestResult) {
    System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");

    //Get driver from BaseTest and assign to local webDriver variable.
     iTestResult.getInstance();

  

}

@Override
public void onTestSkipped(ITestResult iTestResult) {
    System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
    //ExtentReports log operation for skipped tests.
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
