package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
          @Test
          public void method1(){
        	  
        	  WebDriver driver = new FirefoxDriver();
        	  driver.get("https://www.google.co.in/");
        	  String str = driver.getTitle();
        	  Reporter.log(str, true);
        	 // Assert.fail();
        	  driver.close();
          }
}
