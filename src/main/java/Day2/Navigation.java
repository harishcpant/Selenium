package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(5000);		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);	
		driver.navigate().back();
		Thread.sleep(5000);	
		driver.navigate().forward();
		Thread.sleep(5000);	
		driver.navigate().refresh();
		
	}

}
