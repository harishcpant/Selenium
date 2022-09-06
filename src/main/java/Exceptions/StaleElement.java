package Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Stale Element..");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement element=driver.findElement(By.id("bmwcheck"));		
		driver.get(driver.getCurrentUrl());
		element.click();
		
		Thread.sleep(6000);
		
		driver.close();
	}   

}
