package tests;

import static org.junit.Assert.*;

import org.junit.Test;


public class TesteSetPret {

	@Test
	 public void testRange1() throws ExceptiePretIncorect {
	        Produs produs = new Produs("Paine",10.0);
	        Double valoareAsteptata = 1.00;
	        produs.setPret(1.00,1);
	        assertEquals(valoareAsteptata,produs.getPret(),0.01);
	    }
	@Test
	 public void testRange1000() throws ExceptiePretIncorect  {
	        Produs produs = new Produs("Paine",10.0);
	        Double valoareAsteptata = 1000.00;
	        produs.setPret(1000.00,1);
	        assertEquals(valoareAsteptata,produs.getPret(),0.01);
	    }
	@Test
	public void testRange100() throws ExceptiePretIncorect {
        Produs produs = new Produs("Paine",10.0);
        Double valoareAsteptata = 100.00;
        produs.setPret(100.00,1);
        assertEquals(valoareAsteptata,produs.getPret(),0.01);
    }
	
	 @Test(expected = ExceptiePretIncorect.class)
	    public void testRange0() throws ExceptiePretIncorect {
	        Produs produs = new Produs("Paine",10.0);
	        Double valoareAsteptata = 100.00;
	        produs.setPret(0.00,1);
	        assertEquals(valoareAsteptata,produs.getPret(),0.01);
	    }
	 @Test
	 public void testRightTipPromotie2() throws ExceptiePretIncorect {
	        Produs produs = new Produs("Paine",10.0);
	        Double valoareAsteptata = 50.00;
	        produs.setPret(100.00,2);
	        assertEquals(valoareAsteptata,produs.getPret(),0.01);
	    }
	 @Test
	    public void testRightTipPromotie5() throws ExceptiePretIncorect {
	        Produs produs = new Produs("Paine",10.0);
	        Double valoareAsteptata = 100.00;
	        produs.setPret(100.00,1);
	        assertEquals(valoareAsteptata,produs.getPret(),0.01);
	    }
	 @Test
	 public void testBounderyInferiorCase1() {
		 Produs produs = new Produs("Paine",10.0);
		 Double valoareAsteptata = 1.00;
		 produs.setPret(1.00, 1);
		 assertEquals(valoareAsteptata,produs.getPret(),0.01);
	 }

	 
}
