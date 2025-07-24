package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com");
		driver1.manage().window().maximize();
		String URL1 = driver1.getCurrentUrl();
		System.out.println(URL1);
		driver1.quit();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://demo.opencart.com");
		driver2.manage().window().maximize();
		String URL2 = driver2.getCurrentUrl();
		System.out.println(URL2);
		driver2.quit();
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.bing.com");
		driver3.manage().window().maximize();
		String URL3 = driver3.getCurrentUrl();
		System.out.println(URL3);
		driver3.quit();
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.freecrm.com");
		driver4.manage().window().maximize();
		String URL4 = driver4.getCurrentUrl();
		System.out.println(URL4);
		driver4.quit();
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.half.ebay.com");
		driver5.manage().window().maximize();
		String URL5 = driver5.getCurrentUrl();
		System.out.println(URL5);
		driver5.quit();
		

	}
}
