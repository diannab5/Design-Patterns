package testare;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdusSetPretTests {

	@Test
	public void testRightSetPret() {
		Produs produs=new Produs("Apa",100,200);
		produs.setPret(3000);
		assertEquals(3000, produs.getPret(),0.01);
	}
	
	@Test(expected = ExceptiePretZeroSauNegativ.class)
	public void testRangeSetPret() {
		Produs produs=new Produs("Paine",20,30);
		produs.setPret(0);
		
	}

}
