package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {
	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com");
		driver1.manage().window().maximize();
		String ps1 = driver1.getPageSource();
		System.out.println(ps1);
		driver1.quit();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://demo.opencart.com");
		driver2.manage().window().maximize();
		String ps2 = driver2.getPageSource();
		System.out.println(ps2);
		driver2.quit();
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.bing.com");
		driver3.manage().window().maximize();
		String ps3 = driver3.getPageSource();
		System.out.println(ps3);
		driver3.quit();
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.freecrm.com");
		driver4.manage().window().maximize();
		String ps4 = driver4.getPageSource();
		System.out.println(ps4);
		driver4.quit();
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.half.ebay.com");
		driver5.manage().window().maximize();
		String ps5 = driver5.getPageSource();
		System.out.println(ps5);
		driver5.quit();
		

	}
}
