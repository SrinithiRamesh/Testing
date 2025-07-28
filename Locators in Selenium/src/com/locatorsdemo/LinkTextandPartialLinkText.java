package com.locatorsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTextandPartialLinkText {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkTest() {
		driver.get("https://www.hollandandbarrett.com/");
		driver.findElement(By.partialLinkText("Vitamins")).click();
		
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int nolinks=Links.size();
		System.out.println("No.of links in website:" +nolinks);
		
		for(int i=0;i<Links.size();i++) {
			System.out.println(Links.get(i).getText());
			String str = Links.get(i).getText();
			
			String str1 ="vitamins";
			
			if(str==str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("(//a[contains@type,'button')])[4]")).click();
			}
		}
	}
}
