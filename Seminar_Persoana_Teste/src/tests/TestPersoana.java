package tests;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Persoana;
import interfete.IPersoanaTanaraTest;
import interfete.IPersoanaVarstnicaTest;

public class TestPersoana {

	
	
	//trebuie sa dam niste valori
	//sa vedem daca ne returneaza varsta corecta
	//Avem nevoie de un obj de tip persoana
	//Putem sa facem si in setUp deoarece peste tot avem nevoie de o pers
     //Fiecare apel o sa difere, deci chiar daca fac setUp, trebuie sa modific obj, deci mai bine il creez in cadrul testului
	
	//Verificam corectitudinea rezultatului returnat de metoda
	//Teste right de corectitudine
	@Test
	@Category(IPersoanaTanaraTest.class)
	public void testVarstaRight1900() {
	 Persoana pers=new Persoana("Diana","2860413382091");
	 assertEquals("Varsta nu este cea asteptata!",34,pers.getVarsta());
	
	}
	@Category(IPersoanaTanaraTest.class)
	@Test
	public void testVarstaRight2000() {
		Persoana pers=new Persoana("Alex","5120713272890");
		assertEquals("Varsta nu este cea asteptata!",7,pers.getVarsta());
	}
	
	//Boundery pt limitele intervalelor
	//1800-1899,1900-1999,2000-2099 si ar trebui si pentru ziua curenta
	//limitele inf 1 ian 1800, 1900,2000 limitele superioare 31 dec 1899,1999 si ziua curenta(ca doar azi poate sa fie nascut, nu putem face in viitor)
	@Category(IPersoanaVarstnicaTest.class)
	@Test
	public void testVarstaBounderyInferior1900() {
		Persoana pers=new Persoana("Mihaela","2000101458967");
		assertEquals("Varsta nu este cea asteptata",120,pers.getVarsta());
	}
	@Test
	public void testVarstaBounderyInferior2000() {
		Persoana pers=new Persoana("Irina","5000101457868");
		assertEquals("Varsta nu este cea asteptata!",20,pers.getVarsta());
	}
	
	@Test
	public void testVarstaBounderySuperior1900() {
		Persoana pers=new Persoana("Iman","2991231495868");
		assertEquals("Varsta nu este cea asteptata!",20,pers.getVarsta());
	}
	@Test
	public void testVarstaBounderySuperior2000() {
		Persoana pers=new Persoana("Sara","6200606678956");
		assertEquals("Varsta nu este cea asteptat!",0,pers.getVarsta());
	}

	//Inverse Relationship
	//pornind de la rezultat sa ajungem la datele de intrare
	//nu putem aplica pt getvarsta
	
	//Cross-Check = folosirea unei alte metode care sa returneze acelasi rezultat
	//Nu se aplica
	
	//Error conditions
	//Poate sa dea eroare daca cnp-ul nu incepe cu 1,2,3,4,5,6
	
	@Test(expected=IllegalArgumentException.class)
	public void testCheckVarstaError() {
		Persoana pers=new Persoana("Mihai","9845284759348");
		pers.getVarsta();
		
	}
	
	//Pentru ce e in interiorul intervalului: teste de corectitudine
	//Boundery -limite sup si inf 
	//Ce e in afara intervalului - teste de exceptie 
	
	@Test(expected=IllegalArgumentException.class)
	public void testCheckVarstaSuperior() {
		Calendar dataCurenta=Calendar.getInstance();
		String CNP="5"+(dataCurenta.get(Calendar.YEAR)-2000)+(dataCurenta.get(Calendar.MONTH)+1)+(dataCurenta.get(Calendar.DAY_OF_MONTH)+1)+"567897";
		Persoana pers=new Persoana("Mihai",CNP);
		pers.getVarsta();
		
	}
	
	@Test (timeout=10)//milisecunde
	public void testGetVarstaTimp() {
		Persoana pers=new Persoana("Sara","6200606678956");
		pers.getVarsta();
	}
}
