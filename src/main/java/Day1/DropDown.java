package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		Select sel=new Select(driver.findElement(By.id("month")));
		sel.selectByValue("3");
		
		List<WebElement> ddVal=sel.getOptions();
		
		for(int i=0;i<ddVal.size();i++)
		{
			String txtVal=ddVal.get(i).getText();
			System.out.println(txtVal);
		}
		
	}

}
