package Day2;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/r.php");
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"/Screenshots/defaultImage.png"));
		
		PageSnapshot snap=Shutterbug.shootPage(driver,Capture.FULL);
		ImageIO.write(snap.getImage(), "PNG", new File(System.getProperty("user.dir")+"/Screenshots/ShutterBug.png"));

	}

}
