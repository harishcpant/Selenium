package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> values = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']/span"));
		
		for (int i=0;i<values.size();i++) {
			String text=values.get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Selenium 30")) {
				values.get(i).click();
				break;
			}
		}
	}

}
