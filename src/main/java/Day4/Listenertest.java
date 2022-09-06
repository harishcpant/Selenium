//package Day4;
//
//import java.io.File;
//import java.io.IOException;
//
//import javax.imageio.ImageIO;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.assertthat.selenium_shutterbug.core.Capture;
//import com.assertthat.selenium_shutterbug.core.PageSnapshot;
//import com.assertthat.selenium_shutterbug.core.Shutterbug;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Listenertest implements ITestListener  {
//	
//	public void onTestFailure(ITestResult result) {
//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		PageSnapshot snap = Shutterbug.shootPage(driver, Capture.FULL);
//		
//		System.out.println("result.getName()--->"+result.getName());
//
//		try {
//			ImageIO.write(snap.getImage(), "PNG",
//					new File(System.getProperty("user.dir") + "/Screenshots/" + result.getName() + ".png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//
//}
