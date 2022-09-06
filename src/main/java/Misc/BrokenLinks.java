package Misc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	      driver.get("https://en-gb.facebook.com/r.php");
	      
	      String url="";
	      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
	      System.out.println("Total links on the Wb Page: " + allURLs.size());

	      Iterator<WebElement> iterator = allURLs.iterator();
	      while (iterator.hasNext()) {
	    	  url = iterator.next().getText();
	    	  System.out.println(url);
	      }
	      
          for(int i=0;i<allURLs.size();i++)
	      {
             WebElement E1= allURLs.get(i);
             String link= E1.getAttribute("href");
	         System.out.println(link);
	         URL url1=new URL(link);
				
				HttpURLConnection httpConnect=(HttpURLConnection) url1.openConnection();
				httpConnect.setConnectTimeout(3000);
				httpConnect.connect();
				
				if(httpConnect.getResponseCode()==200) {
					System.out.println("Valid Link..");
				} else {
					System.out.println("Invalid Link..");
				}
         }
	      
          Thread.sleep(8000);
	      driver.quit();

	}

}
