package Misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
 public static void main(String[] args) {
	 	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobile 50000+");
		driver.findElement(By.id("nav-search-submit-button")).click();	
		
		List<WebElement> myElements = driver.findElements(By.xpath("//div[@class=\"s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16\"]"));
		
		System.out.println("Size of the result :  - >"+myElements.size());
 	}
}
