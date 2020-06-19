package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSetPunctajMaxim {

TestGrila testGrila;
	
	@Before
	public void beforeEach() {
		testGrila = new TestGrila("Test1", 25, 3);
	}

	@Test(expected = IllegalArgumentException.class)
	public void setPunctajMaximErrorCondition() {
		testGrila.setPunctajMaxim(-123);
	}

}
