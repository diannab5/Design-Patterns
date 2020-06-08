package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.CasaDeMarcat;

public class TestCasaDeMarcat {

	@Test
	public void testCasaDeMarcatSingleton() {
		CasaDeMarcat casaDeMarcat=CasaDeMarcat.getInstance();
		CasaDeMarcat casaDeMarcat2=CasaDeMarcat.getInstance();
		assertSame(casaDeMarcat,casaDeMarcat2);
	}

}
