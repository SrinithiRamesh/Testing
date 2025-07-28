package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Combined {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://demo.opencart.com");
		url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.bing.com");
		url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.freecrm.com");
		url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.half.ebay.com");
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		
//		driver.navigate().refresh();
//		String Title = driver.getTitle();
//		System.out.println(Title);
//		String ps = driver.getPageSource();
//		System.out.println(ps);
		
		
		driver.navigate().forward();
		url = driver.getCurrentUrl();
		System.out.println(url);
//		driver.navigate().refresh();
//		String Title1 = driver.getTitle();
//		System.out.println(Title1);
//		String ps1 = driver.getPageSource();
//		System.out.println(ps1);
//		driver.navigate().forward();
//		url = driver.getCurrentUrl();
//		System.out.println(url);
//		driver.navigate().refresh();
//		String Title2 = driver.getTitle();
//		System.out.println(Title2);
//		String ps2 = driver.getPageSource();
//		System.out.println(ps2);
//		driver.navigate().forward();
//		url = driver.getCurrentUrl();
//		System.out.println(url);
//		driver.navigate().refresh();
//		String Title3 = driver.getTitle();
//		System.out.println(Title3);
//		String ps3 = driver.getPageSource();
//		System.out.println(ps3);
//		driver.navigate().forward();
//		url = driver.getCurrentUrl();
//		System.out.println(url);
//		driver.navigate().refresh();
//		String Title4 = driver.getTitle();
//		System.out.println(Title4);
//		String ps4 = driver.getPageSource();
//		System.out.println(ps4);
		
		
		
		driver.quit();
		
	}
}

