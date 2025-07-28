package com.locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoIDCaseStudy2 {
	WebDriver driver;
	@Test
	public void DemoTestID() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		driver.findElement(By.xpath("//body/div[@id='inner-sbox']/div[@class='gsc-control-cse gsc-control-cse-en']/div[@class='gsc-control-wrapper-cse']/div[@class='gsc-results-wrapper-nooverlay gsc-results-wrapper-visible']/div[@class='gsc-wrapper']/div[@class='gsc-resultsbox-visible']/div[@class='gsc-resultsRoot gsc-tabData gsc-tabdActive']/div[@class='gsc-results gsc-webResult']/div[@class='gsc-expansionArea']/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
	}
}
