package cts.Balan.Diana.gNr1075.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteSetPret {

	@Test(expected = ExceptiePretZeroSauNegativ.class)
	public void testRangeSetPret() {
		Produs produs=new Produs("Paine",10.0);
		produs.setPret(-10.0, 1);
		
	}

	@Test
	public void testSetPretBounderySuperiorCase1() {
		Produs produs = new Produs("Produs", 1000.0);
		assertEquals(1000.0, produs.getPret(), 0.1);

	}
	@Test
	@Category(ITesteCustom.class)
	public void testBoundaryInferiorSetPretCase2() {
		Produs produs = new Produs("A",1.0);
		produs.setPret(1.0, 2);
		assertEquals(0.5,produs.getPret(),0.01);
	}
	@Test
	public void testSetPretBoundaryInferiorCase1() {
		Produs produs = new Produs("A",1.0);
		produs.setPret(1.0, 1);
		assertEquals(1,produs.getPret(),0.01);

	}
	@Test
	public void testSetPretBoundaryInferiorCase2() {
		Produs produs = new Produs("A",1.0);
		produs.setPret(1.0, 2);
		assertEquals(0.5,produs.getPret(),0.01);

	}
	@Test
	public void testValoareDefault() {
		Produs produs = new Produs("A",60.0);
		produs.setPret(50.0, 3);
		assertEquals(50.0,produs.getPret(), 0.01);
	}
}
