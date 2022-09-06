package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapa {
	 public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 
		 DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 
		 ChromeOptions options=new ChromeOptions();
		 options.merge(cap);
		 
		 WebDriver driver=new ChromeDriver(options);
		 driver.get("https://expired.badssl.com/");
		 
	}
}
