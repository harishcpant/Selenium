package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.linkText("Terms")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.PAGE_UP);

	}

}
