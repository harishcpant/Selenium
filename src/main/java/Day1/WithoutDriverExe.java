package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutDriverExe {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().browserVersion("92.09").setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
	}
}
