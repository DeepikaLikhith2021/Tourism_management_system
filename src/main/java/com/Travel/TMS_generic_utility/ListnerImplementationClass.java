package com.Travel.TMS_generic_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementationClass implements ITestListener{
	ExtentReports report ;
	ExtentTest test;
		
	public void onTestStart(ITestResult result) {
		//Testscript execution starts from here
		String MethodName=result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"----------> TestScript execution started");
		
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName);
		Reporter.log(MethodName+"----------> TestScript execution successful");
		
	}

	public void onTestFailure(ITestResult result) {
//		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
//		File src=edriver.getScreenshotAs(OutputType.FILE);
//		File dest = new File(".\\FailScreenshot\\Failedscript.png");
//		try {
//			FileUtils.copyFile(src,dest);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String sceenshotName = WebdriverUtility.takesscreenshot(BaseClass.sdriver, result.getMethod().getMethodName());
//	
		try {
			String sceenshotName = WebdriverUtility.takesscreenshot(BaseClass.sdriver, result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(sceenshotName);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		test.log(Status.FAIL, result.getThrowable());
		Reporter.log("Testscript execution failed");
			
		}
	
	
	

	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+"-------->Skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log("Testscript execution skipped");
		
	}

	public void onStart(ITestContext context) {
		//create html report
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/report.html") ;
		htmlreport.config().setDocumentTitle("com.Travel.TMS");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("TMS");
		 report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("OS", "Window");
		report.setSystemInfo("Base_URL", "http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		report.setSystemInfo("Reporten Name", "deepika");
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	

}
