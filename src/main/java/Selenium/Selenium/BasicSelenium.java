package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicSelenium {

	public static void main(String[] args) {
		System.out.println("Opening a web page..");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		System.out.println("Test Ends..");
	
	}

}
