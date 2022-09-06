package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attributes {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/r.php");
		
		String aria_label=driver.findElement(By.name("firstname")).getAttribute("aria-label");
		System.out.println(aria_label);
		
		String bgColor=driver.findElement(By.name("firstname")).getCssValue("backgroundColor");
		System.out.println(bgColor);
		
		Rectangle size=driver.findElement(By.name("firstname")).getRect();
		System.out.println(size.getDimension().getHeight());
		System.out.println(size.getDimension().getWidth());
	}

}
