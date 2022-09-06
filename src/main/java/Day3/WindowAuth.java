package Day3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAuth {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://secure.indeed.com/account/login");

		driver.findElement(By.id("login-google-button")).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.id("identifierId")).sendKeys("selenium");
		
		//driver.switchTo().window(parentWindow);
		
		driver.switchTo().defaultContent();
		String attr=driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='path'])[1]")).getAttribute("fill");
		System.out.println(attr);


	}

}
