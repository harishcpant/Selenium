package Day2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/r.php");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			String link=links.get(i).getAttribute("href");
			System.out.println(link);
			
			URL url=new URL(link);
			
			HttpURLConnection httpConnect=(HttpURLConnection) url.openConnection();
			httpConnect.setConnectTimeout(3000);
			httpConnect.connect();
			
			if(httpConnect.getResponseCode()==200) {
				System.out.println("Valid Link..");
			} else {
				System.out.println("Invalid Link..");
			}
			
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
