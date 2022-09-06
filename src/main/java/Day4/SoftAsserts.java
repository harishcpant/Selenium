package Day4;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
	
	@Test
	public void softAssert() {
		System.out.println("Soft Assertion...");
		SoftAssert assert1=new SoftAssert();
		
		//assert1.assertTrue(false);
		System.out.println("after fail...");
		assert1.assertAll();
		
		
	}

}
