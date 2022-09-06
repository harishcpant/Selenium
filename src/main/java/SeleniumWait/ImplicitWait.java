package SeleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ImplicitWait {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualResult=driver.getTitle();
		System.out.println("Step 1 ..");
		WebElement ele=driver.findElement(By.id("abc"));
		//Step 2 will come after 30 seconds
		System.out.println("Step 2 ..");
		driver.quit();
		System.out.println("Statement before First verify..");
		}catch(Exception e) {
			System.out.println("Exception Occured...");
		}
	}
}
