package Selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

public class VerifyTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		String actualResult=driver.getTitle();
		driver.quit();
		System.out.println("Statement before First verify..");
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actualResult, "Test");
		System.out.println("Statement after first verify..");
		sf.assertEquals(actualResult, "Test");
		System.out.println("Statement after second verify..");
		sf.assertAll();
		
	}
}
