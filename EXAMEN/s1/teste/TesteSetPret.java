package cts.Balan.Diana.g1075.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TesteSetPret {
       Produs produs;
	
       @Before
       public void setUp() {
    	   produs=new Produs("Lapte",200.0);
       }
       
       @Test
       @Category(ITesteCustom.class)
       public void testSetPretRight() {
    	   produs.setPret(250.0, 1);
    	   assertEquals(250,produs.getPret(),0.1);
       }
       @Test
       public void testSetPretBoundarySuperior() {
    	   produs.setPret(1000.0, 1);
    	   assertEquals(1000.0,produs.getPret(),0.1);
    	   
       }
       @Test
       public void testSetPretBoundaryInferior() {
    	   produs.setPret(1.0, 1);
    	   assertEquals(1.0,produs.getPret(),0.1);
    	   
       }
       

}
