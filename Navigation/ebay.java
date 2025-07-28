package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.half.ebay.com");
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().forward();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().refresh();
		String Title = driver.getTitle();
		System.out.println(Title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String ps = driver.getPageSource();
		System.out.println(ps);
		
		driver.quit();
		
	}
}
