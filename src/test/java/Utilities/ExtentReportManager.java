package Utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.activation.DataSource;

import org.apache.commons.mail.DataSourceResolver;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.BaseClassFinder;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestBase.Basetest;
import pageobjects.BasePage;


public class ExtentReportManager implements ITestListener{


	public ExtentSparkReporter spaerkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	String repname;

	public void onStart(ITestContext context) 
	{
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.MM.ss").format(new Date());
		repname="Test-Report-"+timestamp+".html";

		spaerkreporter= new ExtentSparkReporter(".\\reports\\"+repname);
		spaerkreporter.config().setDocumentTitle("Opencart Automation Report");
		spaerkreporter.config().setReportName("Opencart Functional Testing");
		spaerkreporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(spaerkreporter);
		extent.setSystemInfo("Application","Opencart");
		extent.setSystemInfo("Module","Admin");
		extent.setSystemInfo("TesterName","chandrakiran");
		extent.setSystemInfo("Submodule","Customer");
		extent.setSystemInfo("Username",System.getProperty("user.name"));
		extent.setSystemInfo("Environment","QA");

		String os=context.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);

		String browser=context.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser ", "browser");

		List<String>includegroups=context.getCurrentXmlTest().getIncludedGroups();
		if(!includegroups.isEmpty())
		{
			extent.setSystemInfo("groups", includegroups.toString());
		}


	}

	public void onTestSuccess(ITestResult result) 
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups()); 
		test.log(Status.PASS,"Test case is:"+result.getName()+"got successfully exicuted");
	}
	public void onTestFailure(ITestResult result) 
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.FAIL, result.getName()+"got failed");
		test.log(Status.INFO,result.getThrowable().getMessage());
		try
		{
			String imgpath=new Basetest().capturescreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);

		}
		catch(IOException e1)
		{
			e1.getStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) 
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP,result.getName()+"got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());


	}


	public void onFinish(ITestContext context) 
	{
		extent.flush();
//		String pathofextentreport=System.getProperty(".\\reports\\repname");
//		File extentreport= new File(pathofextentreport);
//		try 
//		{
//			Desktop.getDesktop().browse(extentreport.toURI());
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}

//		try 
//		{
//			URL url=new URL("file://"+System.getProperty(".\\reports\\"+repname));
//			// create the email message
//			ImageHtmlEmail email=new ImageHtmlEmail();
//			email.setDataSourceResolver(new DataSourceUrlResolver(url));
//			email.setHostName("smtp.googlemail.com");
//			email.setSmtpPort(465);
//			email.setAuthenticator(new DefaultAuthenticator("chandrakiranchilukoti.QA@gmail.com", "chandu@12/3"));
//			email.setSSLOnConnect(true);
//			email.setFrom("chandrakiranchilukoti.QA@gmail.com");  //sender
//			email.setSubject("Test Result");
//			email.setMsg("Please find the attached report");
//			email.addTo("chanduchilukoti17@gmail.com");    //reciver
//			email.attach(url,"extent report","please check report...");
//			email.send();
//
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
	}
}
