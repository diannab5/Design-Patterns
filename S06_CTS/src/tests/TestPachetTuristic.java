package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import acs.ase.clase.PachetTuristic;
import tests.dubluri.FakePersoana;
import tests.dubluri.PersoanaStub;

public class TestPachetTuristic {

	@Test
	public void testAplicaDiscountCuStub() {
		PersoanaStub stubPers=new PersoanaStub();
	    PachetTuristic pachetTuristic=new PachetTuristic(stubPers, "Hawaii", 2500.00);
	    pachetTuristic.aplicaDiscountVarstnici(10);
	    assertEquals(2250.00,pachetTuristic.getPret(),0.01);
	}
	
	@Test
	public void testAplicaDiscoutFake() {
		FakePersoana fakePers=new FakePersoana();
		fakePers.setValoareReturnataGetVarsta(66);
		PachetTuristic pachet=new PachetTuristic(fakePers,"Maldive",250.00);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(225.00,pachet.getPret(),0.01);
	}
	
	@Test
	public void testAplicaDiscoutFakefaraDiscount() {
		FakePersoana fakePers=new FakePersoana();
		fakePers.setValoareReturnataGetVarsta(63);
		PachetTuristic pachet=new PachetTuristic(fakePers,"Tokyo",250.00);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(250.00,pachet.getPret(),0.01);
	}
}
