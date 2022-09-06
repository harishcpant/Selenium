package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		System.out.println("rowCount-->"+rowCount);
		
		for(int i=2; i<=rowCount;i++) {
			
			int colCount = driver.findElements(By.xpath("(//table[@id='customers']//tr)[" + i + "]/td")).size();
			
			System.out.println("Row Number --> "+i);
			
			for(int j=1;j<=colCount;j++) {
				String text = driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(text);
			}
			
		}

	}

}
