package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement from=driver.findElement(By.id("draggable"));
		
		Thread.sleep(5000);
		
		WebElement to=driver.findElement(By.id("droppable"));
		
		Thread.sleep(5000);
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(from, to).build().perform();
		
		Thread.sleep(5000);
		
	}

}
