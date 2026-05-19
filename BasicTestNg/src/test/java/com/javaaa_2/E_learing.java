package com.javaaa_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class E_learing {
	WebDriver driver;

	@BeforeSuite
	public void homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Balaji\\eclipse-workspace\\BasicTestNg\\src\\test\\resources\\Driverrr\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void add_to_card() {
		WebElement Brocolli = driver.findElement(By.xpath("//a[@class='increment']"));
		Brocolli.click();
		WebElement add_to_card = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		add_to_card.click();
	}

	@Test
	private void test_a() {
		// TODO Auto-generated method stub

	}

}
