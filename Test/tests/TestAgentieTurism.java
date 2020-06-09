package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import clase.AgentieTurism;
import clase.PachetTuristic;
import tests.dubluri.FakePersoana;
public class TestAgentieTurism {
	@Test
	public void testRightCalculSumaPachete() {
		FakePersoana pers1=new FakePersoana();
		pers1.setValoareReturnataDeGetVarsta(24);
		FakePersoana pers2=new FakePersoana();
		pers1.setValoareReturnataDeGetVarsta(21);
		FakePersoana pers3=new FakePersoana();
		pers1.setValoareReturnataDeGetVarsta(40);
		PachetTuristic pachet1=new PachetTuristic(pers1, "Sydney", 300.0);
		PachetTuristic pachet2=new PachetTuristic(pers2, "Tokyo", 700.0);
		PachetTuristic pachet3=new PachetTuristic(pers3, "Mumbai", 1200.0);
		AgentieTurism agentie=new AgentieTurism();
		agentie.adaugaPachet(pachet1);
		agentie.adaugaPachet(pachet2);
		agentie.adaugaPachet(pachet3);
		assertEquals(2200.0, agentie.calculareSumaTotalaPachete(),0.01);
	}

}
