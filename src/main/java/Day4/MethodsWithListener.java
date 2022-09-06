package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(Listenertest.class)
public class MethodsWithListener {

	@Test (priority=1)
	public void methodOne() {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.google.com");
		
		System.out.println("methodOne.... ");
		Assert.assertEquals(3,2,"Not Matching");
	}
	
	@Test (priority=2, enabled=false)
	public void methodTwo() {
		System.out.println("....Method Two 2....");
	}
}
