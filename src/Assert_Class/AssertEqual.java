package Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqual {
	@Test
	public void TC1() {
		String expR="Sunita";
		String actR="unita";
		Assert.assertEquals(expR, actR);
	}

}
