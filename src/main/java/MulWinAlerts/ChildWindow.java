package MulWinAlerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String mainWin=driver.getWindowHandle();
		System.out.println("Main window - >"+mainWin);
		Set<String> childWins=driver.getWindowHandles();
		Iterator<String> i1=childWins.iterator();
		
		while(i1.hasNext()) {
			String childWindow=i1.next();			
			if(!mainWin.equalsIgnoreCase(childWindow)) {
				System.out.println("Child Window - >"+childWindow);
				driver.switchTo().window(childWindow);
				Thread.sleep(6000);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
                driver.findElement(By.name("btnLogin")).click();	
                driver.close(); // Closing the child window as we have used switchto earlier
			}
		}
		Thread.sleep(6000);
		driver.switchTo().window(mainWin);
		driver.close(); // Closing the main window		
	}

}
