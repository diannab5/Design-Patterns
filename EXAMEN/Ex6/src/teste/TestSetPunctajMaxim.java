package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetPunctajMaxim {

	TestGrila test;

	@Before
	public void beforeEach() {
		test = new TestGrila("test1", 25, 1);
	}

	@Test
	@Category(ITesteCustom.class)
	public void setPunctajMaximLowerBoundary() {
		test.setPunctajMaxim(10);
		assertEquals(10, test.getPunctajMaxim());
	}

	@Test
	public void setPunctajMaximHigherBoundary() {
		test.setPunctajMaxim(90);
		assertEquals(90, test.getPunctajMaxim());
	}

	@Test(expected = IllegalArgumentException.class)
	public void setPunctajMaximErrorCondition() {
		test.setPunctajMaxim(1000);
	}

}
