package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.*;

public class AssertTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		String actualResult=driver.getTitle();
		driver.quit();
		System.out.println("Statement before assert..");
		Assert.assertEquals(actualResult, "testFail");
		System.out.println("Statement after assert..");
	}

}
