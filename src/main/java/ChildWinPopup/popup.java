package ChildWinPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("55557");
		driver.findElement(By.name("submit")).submit();
		Alert alert1=driver.switchTo().alert();
		String alertMsg=alert1.getText();
		System.out.println("alertMsg---->"+alertMsg);
		Thread.sleep(5000);
		driver.quit();
	}

}
