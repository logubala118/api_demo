package com.javaaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Browser_validation 
{
@Test
private void chrome() 
{
	System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Balaji\\eclipse-workspace\\BasicTestNg\\Newdriver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
     driver.manage().window().maximize();
}

@Test
private void edge() 
{
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\Balaji\\eclipse-workspace\\BasicTestNg\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
}
}
