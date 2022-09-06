package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		Actions action=new Actions(driver);
		
		Thread.sleep(6000);
		action.dragAndDropBy(driver.findElement(By.xpath("//*[@id=\"slider\"]/span")),100,0).build().perform();
	}

}
