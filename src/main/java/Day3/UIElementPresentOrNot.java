package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIElementPresentOrNot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		boolean isPresent=driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]")).isDisplayed();

		System.out.println(isPresent);
	}

}
