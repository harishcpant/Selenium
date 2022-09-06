package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByLocators {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(new ByAll(By.name("qasa"), By.name("q"))).sendKeys("selenium");
	}

}
