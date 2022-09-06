package SeleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FluentWait {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.ebay.com");
			driver.manage().window().maximize();
//			FluentWait wait = new FluentWait(driver)
//					.withTimeout(30, TimeUnit.SECONDS)
//					.pollingEvery(5, TimeUnit.SECONDS)
//					.ignoring(NoSuchElementException.class);
//			System.out.println("Step 1 ..");			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abc")));
			String actualResult=driver.getTitle();
			//Step 2 will come after 30 seconds
			System.out.println("Step 2 ..");
			driver.quit();
		}catch(Exception e) {
			System.out.println("Exception Occured...");
		}

	}

}
