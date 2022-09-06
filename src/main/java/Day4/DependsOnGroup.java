package Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups = { "Regression" })
	public void testOne() {
		
		System.out.println("Test One");
		Assert.assertEquals("one", "one", "Your debug message that you want to display in case of failure");
	}

	@Test(groups = { "Sanity" })
	public void testTwo() {
		System.out.println("Test Two");
	}

	@Test(dependsOnGroups = { "Regression" })
	public void testThree() {
		System.out.println("Test Three");
	}

}
