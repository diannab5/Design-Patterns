package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculValoareTVA {

	@Test(expected = ExceptieFacturaFaraProduse.class)
    public void test() throws ExceptieFacturaFaraProduse {
        Facturare facturare = new Facturare();
        facturare.calculValoareTVA(23.0,null);
    }

}
