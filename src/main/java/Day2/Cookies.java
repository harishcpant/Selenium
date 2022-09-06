package Day2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.pocruises.com/find-a-cruise/B123/B123");
		Cookie ck1=driver.manage().getCookieNamed("countryCode");
		//Set<Cookie> ck1=driver.manage().getCookies();		
		System.out.println(ck1);
		
		Cookie cookie1=new Cookie("countryCode","GB");
		driver.manage().addCookie(cookie1);
		
		Cookie ck2=driver.manage().getCookieNamed("countryCode");
		System.out.println(ck2);		
		driver.navigate().refresh();
	}
}
