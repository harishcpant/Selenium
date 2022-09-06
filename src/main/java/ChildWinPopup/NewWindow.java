package ChildWinPopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String parentWin=driver.getWindowHandle();
		Set<String> childWins=driver.getWindowHandles();
		Iterator<String> i1=childWins.iterator();
		for(int i=0;i<=childWins.size()-1;i++) {
			String childWin=i1.next();			
			if(!parentWin.equalsIgnoreCase(childWin)) {
				System.out.println("Child window --  "+childWin);
				driver.switchTo().window(childWin);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.name("btnLogin")).click();	
			}
		}
		driver.switchTo().window(parentWin);
		Thread.sleep(6000);
		driver.quit(); 
	
	}

}
