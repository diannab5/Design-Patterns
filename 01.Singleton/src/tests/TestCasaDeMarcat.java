package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.CasaDeMarcat;

public class TestCasaDeMarcat {

	//asertSame verifica daca cele doua instante sunt in spate de fapt aceeasi instanta
	@Test
	public void testCasaDeMarcat() {
		CasaDeMarcat casaDeMarcat=CasaDeMarcat.getInstance();
		CasaDeMarcat casaDeMarcat1=CasaDeMarcat.getInstance();
		assertSame(casaDeMarcat1,casaDeMarcat);
	}

}
