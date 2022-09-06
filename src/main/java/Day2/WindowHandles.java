package Day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/r.php");

		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Data Policy")).click();
		
		Thread.sleep(4000);
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		String parentWin=it.next();
		String childWin=it.next();
		
		System.out.println(parentWin);
		System.out.println(childWin);
		Thread.sleep(4000);
		driver.switchTo().window(childWin);
		driver.close();
		Thread.sleep(4000);
		driver.switchTo().window(parentWin);
		
		driver.close();
		
		
	}

}
