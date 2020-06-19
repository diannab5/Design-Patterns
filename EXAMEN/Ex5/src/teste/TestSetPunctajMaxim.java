package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSetPunctajMaxim {

	@Test(expected = IllegalArgumentException.class)
	public void setPunctajMaximError() {
		TestGrila test=new TestGrila("Test",24,2);
		test.setPunctajMaxim(5);
	}

}
