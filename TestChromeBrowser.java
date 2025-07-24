package com.seleniumBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class TestChromeBrowser {
	
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();
		WebDriver driver4 = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver1.get("https://demo.opencart.com");
		driver2.get("https://www.bing.com");
		driver3.get("https://www.freecrm.com");
		driver4.get("https://www.half.ebay.com");
	}
}
