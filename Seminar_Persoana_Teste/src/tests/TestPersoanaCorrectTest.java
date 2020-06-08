package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.ExceptieCNP;
import clase.Persoana;

public class TestPersoanaCorrectTest {
  //cand avem boolean -assertTrue sau assertFalse
	//Verificare exceptii = expected ca parametru
	@Test(expected=IllegalArgumentException.class)
	public void testCheckCNPConformance() {
	Persoana pers=new Persoana("Alex","244656");
   pers.checkCNP();
	}
	
	@Test(expected=ExceptieCNP.class)
     public void testCheckCNPConformanceChar() {
		Persoana pers=new Persoana("Maria","A87f59864372f");
		pers.checkCNP();
	}
   //un cnp care chiar e valid
	//CONFORMANCE
	@Test
    public void testCheckCNPCorrectFormat() {
		Persoana pers=new Persoana("Maria","6000606019177");
		assertTrue(pers.checkCNP());
	}
	@Test
    public void testCheckCNPIncorrectFormat() {
		Persoana pers=new Persoana("Maria","6000606019178");
		assertFalse(pers.checkCNP());
	}
	//TESTE DE CORECTITUDINE
	@Test(expected=ExceptieCNP.class)
    public void testCheckCNPConformanceFirstChar() {
		Persoana pers=new Persoana("Maria","0980506678543");
		pers.checkCNP();
	}
	
	//ORDERING
   @Test
   public void checkOrderVarsta() {
	   Persoana pers1=new Persoana("Maria","6000606019178");
	   Persoana pers2=new Persoana("Sara","6010606019178");
	 //  if(pers1.getVarsta()>pers2.getVarsta())
	   assertTrue(pers1.getVarsta()>pers2.getVarsta());
	   
	   //asa nu 
	   //if(pers.getVarsta()>pers2.getVarsta()
	     //assertTrue(false);
	   
	   //RANGE - sa ne incadram in interval, sa det intervalele
	   //am facut deja la boundery, error etc
	   
	   //Refference - obiect extern pe care il fol in cadrul metodei testate de noi
	   
	   //Existance - ne lipseste un parametru\ sau e 0 asemanator cu testul de roare de la right bicep
   }
      //pica, mergem in clasa Persoana si aruncam o exceptie verficam sa nu fie null cnp-ul
	  @Test(expected=IllegalArgumentException.class)
	   public void checkCNPNull() {
		   Persoana pers=new Persoana("Andrei",null);
		   pers.checkCNP();
	   }
	  
	  //CARDINALITY ; 0-1-n ; 
	  @Test
	  public void checkVarstaCardinality0() {
		  Persoana pers=new Persoana("Sara","6200505567849");
		  assertEquals(0,pers.getVarsta());
	  }
	  @Test
	  public void checkVarstaCardinality1() {
		  Persoana pers=new Persoana("Sara","6190505567849");
		  assertEquals(1,pers.getVarsta());
	  }
	  
	  @Test
	  public void checkVarstaCardinalityN() {
		  Persoana pers=new Persoana("Sara","6170505567849");
		  assertEquals(3,pers.getVarsta());
	  }
	  
	  //TIME
	  @Test(timeout=10)
	  public void checkTime() {
		  Persoana pers=new Persoana("Sara","6170505567849");
		  pers.getVarsta();
		  }
	 //mai intai se apeleaza checkCnp si dupa getVarsta test pt time 
	  
	 
   }

