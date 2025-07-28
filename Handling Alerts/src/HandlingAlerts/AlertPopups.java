package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPopups {
	@Test
	public void TestPopups() throws Exception{
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      //Simple Alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
      //Validate Text field content from Browser
        String result = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result);
        Assert.assertEquals("You successfully clicked an alert", result);
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert2.dismiss();
        String result2 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result2);
        Assert.assertEquals("You clicked: Cancel", result2);
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert3.accept();	
		String result3 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result3);
		Assert.assertEquals("You clicked: Ok", result3);
        driver.quit();
    }
	
	
	

}
