package Day4;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptHighlight {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='10px solid red'", driver.findElement(By.name("q")));
		
		PageSnapshot snap = Shutterbug.shootPage(driver, Capture.FULL);
		ImageIO.write(snap.getImage(), "PNG", new File(System.getProperty("user.dir") + "/Screenshots/border.png"));
		
		Object cookie = js.executeScript("return document.cookie");
		System.out.println(cookie);
	}
}
