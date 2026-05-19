package com.javaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Java_Executor 
{
@Test
private void sendkeys() throws InterruptedException 
{
	System.setProperty("webdriver.Edge.driver", 
			"C:\\Users\\Balaji\\eclipse-workspace\\BasicTestNg\\Newdriver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//------------------javaExecutor----------------
	
	WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value=90900;",userName);
	System.out.println("UserName Updated");
	   
	
	//-----scroll down  --------------------------------
	
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	//----------Scroll Up-------------
	
	js.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(3000);
	
	//---------------------click---------------
	
   WebElement submit=driver.findElement(By.xpath("//div[@ role='none']"));
    js.executeScript("arguments[0].click();",submit);
   // submit.click();
}
}
