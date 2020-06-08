package ase.clase.teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ase.clase.Matematica;

public class MatematicaTests {
	private Matematica m;
	
	@Before
	public void setUp(){
		m=new Matematica();
	}

	@Test
	public void testSumaCorecta() {
		
		int rezultatPrimit=m.suma(5, 8);
	    int rezultatAsteptat=13;
	    assertEquals("Suma incorecta",rezultatPrimit, rezultatAsteptat);
	}

	@Test
	public void testRaportCorect(){
		
		double rezultat=m.raport(15, 3);
		double rezultatAsteptat=5;
		assertEquals(rezultatAsteptat, rezultat,0.1);
	}
	@Test
	public void testEsteParCorect(){
		
		assertTrue("Numarul este par",m.estePar(6));
		assertFalse("Numarul nu este fals",m.estePar(7));
		assertFalse(m.estePar(-7));
	}
	
	@Test
	public void testRaportImpartireLaZero() {
	
		try {
		m.raport(60, 0);
		fail("Nu trebuia sa ajunga aici");
		}catch(IllegalArgumentException iae) {
			
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRaportExceptieJUnit4(){
		
		m.raport(45, 0);
	}
	@Test
	public void testNNumerePareNULL(){
	
		List<Integer> lista=m.nNumerePare(0);
		assertNull(lista);
	}
}
