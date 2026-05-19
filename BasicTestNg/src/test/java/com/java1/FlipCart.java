package com.java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCart 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("Webdriver.chrome.driver", 
			"C:\\Users\\Balaji\\eclipse-workspace\\BasicTestNg\\Driver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	
	//----------------------Brocoli---------------
	WebElement Frame=driver.findElement(By.xpath("//a[@class='increment']"));
	Frame.click();
	
	Thread.sleep(3000);
	WebElement Frame1=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
	Frame1.click();
	
	//----------------------item---------------
	WebElement Frame2=driver.findElement(By.xpath("//a[@class='cart-icon']"));
	Frame2.click();
	
	
}
}
