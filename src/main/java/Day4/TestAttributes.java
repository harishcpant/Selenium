package Day4;

import org.testng.annotations.Test;

public class TestAttributes {
	
	@Test(expectedExceptions = { ArithmeticException.class })
	public void testMethods() {
		int i = 1 / 0;
		System.out.println("Failed");
	}

	@Test(invocationCount = 10)
	public void invocationCount() {
		System.out.println("Print");
	}

}
