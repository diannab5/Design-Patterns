package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

import acs.ase.clase.ExceptieCNP;
import acs.ase.clase.Persoana;

public class TestPersoana {
	
	@Test
	public void testVarstaRight() {
		Persoana pers=new Persoana("Irina","2861202154852");
		assertEquals("Varsta nu este cea asteptata" , 33,pers.getVarsta());
	}
	
	@Test
	public void testVarstaRight2000() {
		Persoana pers=new Persoana("Ioana","5120513154852");
		assertEquals("Varsta nu este cea asteptata" , 7,pers.getVarsta());
	}
	
	@Test
	public void testVarstaBounderyInferior1900() {
		Persoana pers=new Persoana("Alex","2000101025482");
		assertEquals(120, pers.getVarsta());
	}
	
	@Test
	public void testVarstaBounderySuperior1999() {
		Persoana pers=new Persoana("Teo","1991231456347");
		assertEquals(20, pers.getVarsta());
	}
	
	@Test
	public void testVarstaBounderySuperior2000() {
		Persoana pers=new Persoana("Marius","5200323456879");
		assertEquals(0, pers.getVarsta());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCheckVarstaError() {
		Persoana pers=new Persoana("Alexandra","9983315078912");
	    pers.getVarsta();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCheckSuperior2000Error() {
		Calendar dataCurenta=Calendar.getInstance();
		String CNP="5"+(dataCurenta.get(Calendar.YEAR)-2000)+(dataCurenta.get(Calendar.MONTH)+1)+(dataCurenta.get(Calendar.DAY_OF_MONTH)+1)+"546789";
		Persoana pers=new Persoana("Alexandra",CNP);
	    pers.getVarsta();
	}
	@Test(timeout=10)//milisecunde
	public void testgetVarstaTimp() {
		Persoana persoana=new Persoana("Mara","2980315132346");
		persoana.getVarsta();
	}
	@Test(expected=IllegalArgumentException.class)
	public void checkCNPConformance() {
		Persoana pers=new Persoana("Ana","19804241789");
		 pers.checkCNP();
	}
	
	@Test(expected=ExceptieCNP.class)
	public void checkCNPConformanceChars() {
		Persoana pers=new Persoana("Ana","A8703ss178945");
		pers.checkCNP();
		
		
	}
	@Test(expected=ExceptieCNP.class)
	public void checkCNPConformanceFirstChar() {
		Persoana pers=new Persoana("Mira","0650711453621");
		pers.checkCNP();
		
	}
	
	@Test
	public void checkCNPCorrectFormat() {
		Persoana pers=new Persoana("Cosmin","1860913185238");
		assertTrue(pers.checkCNP());
	}
	@Test
	public void checkCNPIncorrectFormat() {
		Persoana pers=new Persoana("Cosmin","1860913185232");
		assertFalse(pers.checkCNP());//CNP-ul nu respecta cifra de control
	}
	
	@Test
	public void checkCNPOrder() {
		Persoana pers=new Persoana("Cosmin","19812050080427");
		Persoana pers2=new Persoana("Marius","1991205080427");
		
		assertTrue(pers.getVarsta()>pers2.getVarsta());
		
		//asa nu! niciodata
		//if(pers.getVarsta()>pers2.getVarsta())
			//assertTrue(false);
	}
	@Test(expected=IllegalArgumentException.class)
	public void checkCNPNull() {
		Persoana pers=new Persoana("Dan",null);
		pers.checkCNP();
	}
	@Test
	public void checkCardinalityVarsta0() {
		Persoana pers=new Persoana("Ana","6200329015269");
		assertEquals(0,pers.getVarsta());
	}
	@Test
	public void checkCardinalityVarsta1() {
		Persoana pers=new Persoana("Cici","6190329016567");
		assertEquals(1,pers.getVarsta());
	}
	
	@Test(timeout=10)
	public void checkTime() {
		Persoana pers=new Persoana("Ana","6000329046868");
		pers.getVarsta();
	}
	
}