package MulWinAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("55557");
		driver.findElement(By.name("submit")).submit();
		Alert alert1=driver.switchTo().alert();
		String alertMsg=alert1.getText();
		System.out.println("alertMsg---->"+alertMsg);
		Thread.sleep(3000);
		//alert1.accept();//Click submit button
		alert1.dismiss();//Click Cancel button
		Thread.sleep(6000);
		driver.quit();
	}

}
