package clase;

public class CasaDeMarcat {
	private double suma;
	private static CasaDeMarcat casaDeMarcat =new CasaDeMarcat();
	
	public double getSuma() {
		return suma;
	}

	private CasaDeMarcat() {
		this.suma = 0;
	}
	
	private CasaDeMarcat(double suma) {
		this.suma = suma;
	}
	
	public static CasaDeMarcat getInstance() {
		return casaDeMarcat;
	}
	
	public void incaseazaNota(double sumaIncasata) {
		suma+=sumaIncasata;
	}
	

	
}
