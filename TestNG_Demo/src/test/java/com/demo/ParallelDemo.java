package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelDemo {

	@Test
	private void chromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\TestNG_Demo\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-orders%2Forders%3Fref_%3Dnav_orders_first&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_retail_yourorders_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='testing';",username );
		
		System.out.println("Value passed");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		js.executeScript("arguments[0].click();", submit);
		
		
				
	}

//	@Test
//	private void edgeDriver() {
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\Balaji\\eclipse-workspace\\TestNG_Demo\\Driver\\msedgedriver.exe");
//
//		WebDriver driver = new EdgeDriver();
//
//		driver.get("https://www.facebook.com/");
//
//	}

}
