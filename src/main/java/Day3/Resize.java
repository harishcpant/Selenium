package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		
		Actions action=new Actions(driver);
		
		Thread.sleep(6000);
		 
		action.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]")), 100, 150).build().perform();
		
		

	}

}
