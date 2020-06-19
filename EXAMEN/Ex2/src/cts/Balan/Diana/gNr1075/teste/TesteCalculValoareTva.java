package cts.Balan.Diana.gNr1075.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteCalculValoareTva {
	@Category(ITesteCustom.class)
	@Test(expected =  ExceptieFacturaFaraProduse.class)
	public void testExceptionTVAEsteZero() {
		Facturare facturare = new Facturare();
		facturare.calculValoareTVA(23.0, null);
	}
	
	@Test
	public void testCrossCheck() throws ExceptieFacturaFaraProduse{
		 Facturare facturare = new Facturare();
		 Double valoareAsteptata = crossCheckCalculTVA(119.0,100.0);
	        Double valoareCalculata = facturare.calculValoareTVA(100.0,19.0);
	        assertEquals(valoareAsteptata,valoareCalculata,0.01);
	}
	public Double crossCheckCalculTVA(Double valoareaCuTVA,Double valoareFaraTVA){
        if(valoareaCuTVA!=null && valoareFaraTVA!=null){
            return valoareaCuTVA-valoareFaraTVA;
        }else{
            throw new IllegalArgumentException();
        }
    }
	
	
}
