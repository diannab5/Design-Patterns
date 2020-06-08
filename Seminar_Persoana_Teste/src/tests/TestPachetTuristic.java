package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.PachetTuristic;
import interfete.IPersoanaTanaraTest;
import interfete.IPersoanaVarstnicaTest;
import tests.dubluri.PersoanaFake;
import tests.dubluri.PersoanaStub;

public class TestPachetTuristic {
   //Cand utilizam dubluri nu depindem de referinta externa 
	//test right
	@Test
	@Category(IPersoanaVarstnicaTest.class)
	public void testAplicaDiscountStub() {
		PersoanaStub stubPersoana=new PersoanaStub();
		PachetTuristic pachet=new PachetTuristic(stubPersoana,"Manila",2500.00);
	    pachet.aplicaDiscountVarstnici(10);
	    assertEquals(2250.00,pachet.getPret(),0.01);
	}
	//aceeasi chestie ca cel de deasupra doar ca cu fake
	@Test
	@Category(IPersoanaVarstnicaTest.class)
	public void testAplicaDiscountFake() {
		PersoanaFake fakePersoana=new PersoanaFake();
		fakePersoana.setValoareReturnataDeGetVarsta(65);
		PachetTuristic pachet=new PachetTuristic(fakePersoana,"Manila",2500.00);
	    pachet.aplicaDiscountVarstnici(10);
	    assertEquals(2250.00,pachet.getPret(),0.01);
	}
	
	@Test
	@Category(IPersoanaTanaraTest.class)
	public void testAplicaDiscountFakeCorectitudine() {
		PersoanaFake fakePersoana=new PersoanaFake();
		fakePersoana.setValoareReturnataDeGetVarsta(64);
		PachetTuristic pachet=new PachetTuristic(fakePersoana,"Manila",2500.00);
	    pachet.aplicaDiscountVarstnici(10);
	    assertEquals(2500.00,pachet.getPret(),0.01);
	}

}
