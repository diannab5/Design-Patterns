package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.PachetTuristic;
import interfaces.IPersoanaTanaraTest;
import interfaces.IPersoanaVarstnicaTest;
import interfaces.PersoaneMajore;
import interfaces.PersoaneMinore;
import tests.dubluri.FakePersoana;
import tests.dubluri.StubPersoana;

public class TestPachetTuristic {

	@Test
	@Category(IPersoanaVarstnicaTest.class)
	public void testAplicaDiscountCuStub() {
		StubPersoana stubPersoana = new StubPersoana();
		PachetTuristic pachetTuristic=new PachetTuristic(stubPersoana,"Taiwan",2500.00);
		pachetTuristic.aplicaDiscountVarstnici(10);
		assertEquals(2250.00, pachetTuristic.getPret(),0.01);
	}
	
	@Test
	@Category(IPersoanaVarstnicaTest.class)
	public void testAplicaDiscountcuFake() {
		FakePersoana fakePersoana = new FakePersoana();
		fakePersoana.setValoareReturnataDeGetVarsta(66);
		PachetTuristic pachetTuristic=new PachetTuristic(fakePersoana,"Sydney",250.00);
		pachetTuristic.aplicaDiscountVarstnici(10);
		assertEquals(225.00, pachetTuristic.getPret(),0.01);
	}
	
	@Test
	@Category(IPersoanaTanaraTest.class)
	public void testAplicaDiscountcuFakeFaraDiscount() {
		FakePersoana fakePersoana = new FakePersoana();
		fakePersoana.setValoareReturnataDeGetVarsta(63);
		PachetTuristic pachetTuristic=new PachetTuristic(fakePersoana,"Sydney",250.00);
		pachetTuristic.aplicaDiscountVarstnici(10);
		assertEquals(250.00, pachetTuristic.getPret(),0.01);
	}

	@Test
	@Category({PersoaneMinore.class})
	public void testRezervareDeCatrePersoaneMinore() {
		FakePersoana persoana=new FakePersoana();
		persoana.setValoareReturnataDeGetVarsta(16);
		PachetTuristic pachet=new PachetTuristic(persoana, "Tenerife", 100.0);
		assertFalse(pachet.poateRezerva());
	}
	
	@Test
	@Category({PersoaneMajore.class})
	public void testRezervareDeCatrePersoaneMajore() {
		FakePersoana persoana=new FakePersoana();
		persoana.setValoareReturnataDeGetVarsta(25);
		PachetTuristic pachet=new PachetTuristic(persoana, "Iasi", 100.0);
		assertTrue(pachet.poateRezerva());
	}
	
	@Test
	@Category({PersoaneMinore.class})
	public void testGetDestinatie() {
		FakePersoana persoana=new FakePersoana();
		persoana.setValoareReturnataDeGetVarsta(13);
		PachetTuristic pachet=new PachetTuristic(persoana,"Suceava",1000.0);
		pachet.setDestinatie("Cluj");
		assertEquals("Cluj", pachet.getDestinatie());
	}
	
	@Test
	@Category({PersoaneMinore.class})
	public void testGetClient() {
		FakePersoana persoana=new FakePersoana();
		FakePersoana newPerson=new FakePersoana();
		persoana.setValoareReturnataDeGetVarsta(13);
		newPerson.setValoareReturnataDeGetVarsta(17);
		PachetTuristic pachet=new PachetTuristic(persoana,"Sydney",1000.0);
		pachet.setClient(newPerson);
		assertEquals(newPerson, pachet.getClient());
	}
	
	@Test
	public void testSetPret() {
		FakePersoana persoana=new FakePersoana();
		persoana.setValoareReturnataDeGetVarsta(13);
		PachetTuristic pachet=new PachetTuristic(persoana,"Sydney",1000.0);
		pachet.setPret(3000.0);
		assertEquals(3000.0, pachet.getPret(),0.01);
	}
}
