package cts.Balan.Diana.gNr1075.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteSetPret {

	@Test
	 @Category(ICustomTeste.class)
	public void testRightSetPret1() {
		Produs produs=new Produs("Lapte",20.0); // o valoare care nu are leg 
		 Double valoareAsteptata = 20.0; //ce ne asteptam sa returneze
		 produs.setPret(20.0, 1); //efectiv valoarea noastra
		assertEquals(valoareAsteptata,produs.getPret(),0.01);
	}
	@Test
	public void testRightSetPret2() {
		Produs produs=new Produs("Lapte",20.0);
		 Double valoareAsteptata = 5.0;
		 produs.setPret(10.0, 2);
		assertEquals(valoareAsteptata,produs.getPret(),0.01);
	}
	
	@Test
	public void testRightSetPret3() {
		Produs produs=new Produs("Lapte",10.0);
		 Double valoareAsteptata = 20.0;
		 produs.setPret(20.0, 3);
		assertEquals(valoareAsteptata,produs.getPret(),0.01);
	}
    @Test
    public void testBounderySetPretInferior() {
    	Produs produs=new Produs("Lapte",1.0);
    	assertEquals(1.0,produs.getPret(),0.01);
    }
    @Test
    public void testBounderySetPretSuperior() {
    	Produs produs=new Produs("Lapte",1000.0);
    	assertEquals(1000.0,produs.getPret(),0.01);
    }
}
