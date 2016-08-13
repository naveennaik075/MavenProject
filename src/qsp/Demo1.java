package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {
	      ExtentReports e = new ExtentReports("./ExtentReport/ExtentReports.html");
          @Test
          public void method1(){
        	//  ExtentReports e = new ExtentReports("./ExtentReports.html");
        	  ExtentTest et = e.startTest("method1");
        	  et.log(LogStatus.PASS,"Hi ExtentTest passed");
        	  
        	  WebDriver driver = new FirefoxDriver();
        	  driver.get("https://www.google.co.in/");
        	  String str = driver.getTitle();
        	  Reporter.log(str, true);
        	 // Assert.fail();
        	  driver.close();
        	  e.endTest(et);
        	 // e.flush();
          }
          @Test
          public void method2(){
        	  //ExtentReports e = new ExtentReports("./ExtentReports.html");
        	  ExtentTest et = e.startTest("method2");
        	  et.log(LogStatus.FAIL,"Hi ExtentTest failed");
        	  
        	  WebDriver driver = new FirefoxDriver();
        	  driver.get("https://www.google.co.in/");
        	  String str = driver.getTitle();
        	  Reporter.log(str, true);
        	 // Assert.fail();
        	  driver.close();
        	  e.endTest(et);
        	  e.flush();
          }
}
