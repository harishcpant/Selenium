package Day4;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class multiTestNG {

	public static void main(String[] args) {
//		TestNG tng=new TestNG();
//		
//		List<String> suites=new ArrayList<String>(); 
//		
//		suites.add("C:\\Harish\\Study\\Java\\EclipseWS\\Selenium\\TestNG.xml");
//		suites.add("C:\\Harish\\Study\\Java\\EclipseWS\\Selenium\\TestNG2.xml");
//		
//		tng.setTestSuites(suites);
//		
//		tng.run();
		
		
		TestNG testng = new TestNG();

		List<String> suites = new ArrayList<String>();
		suites.add("C:\\Harish\\Study\\Java\\EclipseWS\\Selenium\\TestNG.xml");
		suites.add("C:\\Harish\\Study\\Java\\EclipseWS\\Selenium\\TestNG2.xml");

		testng.setTestSuites(suites);
		
		testng.run();

	}

}
