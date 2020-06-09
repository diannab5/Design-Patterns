package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.ExceptieCNP;
import clase.Persoana;
import interfaces.IPersoanaTanaraTest;
import interfaces.IPersoanaVarstnicaTest;

public class TestPersoana {
	
	@Test
	@Category(IPersoanaTanaraTest.class)
	public void testVarstaRight() {
		Persoana pers=new Persoana("Daria","2861202154678");
		assertEquals("Varsta nu este cea asteptata" , 33,pers.getVarsta());
	}
	
	
	@Test
	public void testVarstaRight2000() {
		Persoana pers=new Persoana("Tania","5120513154852");
		assertEquals("Varsta nu este cea asteptata" , 7,pers.getVarsta());
	}
	@Test
	public void testVarstaRight1800() {
		Persoana pers=new Persoana("Sara","4991202756345");
		assertEquals("Varsta nu este cea asteptata" , 120,pers.getVarsta());
	}
	
	@Test
	public void testCorectitudineSex() {
		Persoana pers1 = new Persoana("Alex Munteanu", "1920411242356");
		Persoana pers2 = new Persoana("Alina Pop", "2950717175678");
		Persoana pers3=new Persoana("Valentin","3950305568923");
		Persoana pers4=new Persoana("Alina","4881106876437");
		Persoana pers5=new Persoana("Sorin","5940204756923");
		Persoana pers6=new Persoana("Sara","6841106877847");
		assertEquals("M", pers1.getSex());
		assertEquals("F", pers2.getSex());
		assertEquals("M",pers3.getSex());
		assertEquals("F",pers4.getSex());
		assertEquals("M",pers5.getSex());
		assertEquals("F",pers6.getSex());
		
	}
	@Test
	public void testCNPCorect() {
		Persoana pers=new Persoana("Radu","1861202587321");
		assertEquals("CNP-ul nu este corect" , false,pers.checkCNP());
	}	
	@Test
	@Category(IPersoanaVarstnicaTest.class)
	public void testVarstaBounderyInferior1900() {
		Persoana pers=new Persoana("Alex","2000101025482");
		assertEquals(120, pers.getVarsta());
	}
	
	@Test
	@Category(IPersoanaTanaraTest.class)
	public void testVarstaBounderyInferior2000() {
		Persoana pers=new Persoana("Razvan","5000101025482");
		assertEquals(20, pers.getVarsta());
	}

	@Test
	public void testVarstaBounderySuperior1999() {
		Persoana pers=new Persoana("Marian","1991231025482");
		assertEquals(20, pers.getVarsta());
	}
	
	@Test
	public void testVarstaBounderySuperior2000() {
		Persoana pers=new Persoana("Marian","5200323025482");
		assertEquals(0, pers.getVarsta());
	}
	
	@Test
	public void testCNPBoundery() {
		Persoana pers=new Persoana("Iulian","1981212254875");
		assertEquals(true, pers.checkCNP());
		
	}
	@Test
	public void testSexBounderyFeminin() {
		Persoana pers=new Persoana("Iulia","2200523026721");
		assertEquals("F", pers.getSex());
	}
	
	@Test
	public void testSexBounderyMasculin() {
		Persoana pers=new Persoana("Alex","1981212254569");
		assertEquals("M", pers.getSex());
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category({IPersoanaVarstnicaTest.class, IPersoanaTanaraTest.class})
	public void testCheckVarstaError() {
		Persoana pers=new Persoana("Mara","9980315127899");
		pers.getVarsta();
	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCheckSuperior2000Error() {
		Calendar dataCurenta=Calendar.getInstance();
		String CNP= "5" + (dataCurenta.get(Calendar.YEAR)-2000) +(dataCurenta.get(Calendar.MONTH)+1)+(dataCurenta.get(Calendar.DAY_OF_MONTH)+1) + "452154";
		Persoana pers=new Persoana("Sara", CNP);
		pers.getVarsta();
	}
	
	@Test(timeout=10)//milisecunde
	public void testgetVarstaTimp() {
		Persoana pers=new Persoana("Daria","2980315125489");
		pers.getVarsta();
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void checkCNP() {
		Persoana pers=new Persoana("Ioama","295062366347");
		pers.checkCNP();
	}
	

	@Test(expected=ExceptieCNP.class)
	public void checkCNPConformanceChars() {
		Persoana pers=new Persoana("Ion","A9804s37a76f2");
		pers.checkCNP();
	}
	
	
	@Test(expected=ExceptieCNP.class)
	public void checkCNPConformanceFirstChar() {
		Persoana pers=new Persoana("Marian","0950656785657");
		pers.checkCNP();
	}
	
	@Test
	public void checkCNPCorrectFormat() {
		Persoana pers=new Persoana("Alex","1910319357474");
		assertTrue(pers.checkCNP());
	}
	
	@Test
	public void checkCNPIncorrectFormat() {
		Persoana pers=new Persoana("Alex","1910319357475");
		assertFalse(pers.checkCNP());
	}
	
	@Test
	public void checkCNPOrder() {
		Persoana pers=new Persoana("Cristi","1910319357474");
		Persoana pers2=new Persoana("Marius","1950319357474");
		assertTrue(pers.getVarsta()>pers2.getVarsta());
		
		// ASA NU
//		if(pers.getVarsta()>pers2.getVarsta()) {
//			assertTrue(false);;
//		}
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void checkCNPNull() {
		Persoana pers=new Persoana("Ioana",null);
		pers.checkCNP();
	}
	
	@Test
	public void checkVarsta0Cardinality() {
		Persoana pers=new Persoana("Raluca","6200329357474");
		assertEquals(0, pers.getVarsta());
	}
	
	@Test
	public void checkVarsta1Cardinality() {
		Persoana pers=new Persoana("Ionut","5190229357474");
		assertEquals(1, pers.getVarsta());
	}
	
	@Test(timeout=10)
	public void checkTime() {
		Persoana pers=new Persoana("Razvan","5190229357474");
		pers.getVarsta();
	}
	
	@Test
	public void testSexNecunoscut() {
		Persoana pers=new Persoana("Razvan","7830406658935");
		assertEquals("N/A", pers.getSex());
	}
	

}
