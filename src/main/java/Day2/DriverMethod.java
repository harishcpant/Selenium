package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMethod {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/r.php");
		System.out.println("*******"+driver.getTitle());
		
		System.out.println("*******"+driver.getCurrentUrl());
		//System.out.println("*******"+driver.getPageSource());
	
	}
}
