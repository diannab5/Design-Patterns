package testare;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ProdusGetVanzareMaximaTests {

	@Category(CategorieProduseFaraVanzariZilnice.class)
	@Test(expected = MaxException.class)
	public void testExistence() {
		Produs produs=new Produs("Miere",10,10);
		produs.getVanzareMaxima();
		
	}
	
	@Test()
	@Category(CategorieProduseCuVanzariZilnice.class)
	public void testCrossCheck() {
		Produs produs=new Produs("Apa",20,30);
		ArrayList<Integer> vanzari=new ArrayList<Integer>();
		vanzari.add(30);
		vanzari.add(15);
		vanzari.add(50);
		produs.setVanzariZilnice(vanzari);
		int expected=Collections.max(vanzari);
		assertEquals(expected, produs.getVanzareMaxima());
	}

}
