package Assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Not_equal {
@Test
public void TC2() {
	String expR="MOM";
	String actR="Dad";
	Assert.assertNotEquals(actR, expR);
}
}
