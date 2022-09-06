package PositionXY;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetPositionXY {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		System.out.println("Step 1 done");
		Thread.sleep(5000);
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		// find the SoftwareTestingMaterial logo using linkText Locator
		WebElement element = driver.findElement(By.linkText("Demo Sites"));
		//Used points class to get x and y coordinates of element.
		Point point = element.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		// Using Actions class
		Actions action = new Actions(driver);
		//clicking on the logo based on x coordinate and y coordinate 
		//you will be redirecting to the home page of softwaretestingmaterial.com
		action.moveToElement(element, xcord, ycord).click().build().perform();
		System.out.println("Step 4 done");
		Thread.sleep(17000);
		driver.quit();
	}

}
