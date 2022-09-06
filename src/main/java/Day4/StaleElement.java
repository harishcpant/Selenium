package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		WebElement name = driver.findElement(By.name("q"));
		System.out.println(name);

		driver.navigate().refresh();
		WebElement name1 = driver.findElement(By.name("q"));
		System.out.println(name1);
	}

}
