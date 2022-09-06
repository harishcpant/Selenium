package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParameterization {
	
	WebDriver driver;
	
	@Parameters ({"browser"})
	@Test
	public void setup(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.google.com");
	}
	
//	@Test
//	public void openBrowser()
//	{
//		driver.get("https://www.google.com");
//	}
	
	
	
	

}
