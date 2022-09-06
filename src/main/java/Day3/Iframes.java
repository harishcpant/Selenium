package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		
		String text = driver.findElement(By.cssSelector("#tinymce p")).getText();

		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		
	}

}
