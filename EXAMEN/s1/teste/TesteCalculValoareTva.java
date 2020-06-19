package cts.Balan.Diana.g1075.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteCalculValoareTva {

	@Test(expected=ExceptieFacturaFaraProduse.class)
	@Category(ITesteCustom.class)
	public void testCalculValoareTVAExistence() {
		Facturare factura=new Facturare();
		factura.calculValoareTVA(0.0,0.19);
	}
	@Test
	public void testCalculValoareTVACrossCheck() {
		Facturare factura = new Facturare();
		assertEquals(20/100*0.19, factura.calculValoareTVA(20.0, 0.19),0.1);
	}
}
