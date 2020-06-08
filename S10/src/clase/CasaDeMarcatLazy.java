package clase;

public class CasaDeMarcatLazy {
	private double suma;
	private static CasaDeMarcatLazy casaDeMarcatLazy =null;
	
	public double getSuma() {
		return suma;
	}

	private CasaDeMarcatLazy() {
		this.suma = 0;
	}
	
	private CasaDeMarcatLazy(double suma) {
		this.suma = suma;
	}
	
	public void incaseazaNota(double sumaIncasata) {
		suma+=sumaIncasata;
	}
	
	public static CasaDeMarcatLazy getInstance(double sumaInitiala) {
		if(casaDeMarcatLazy == null) {
			casaDeMarcatLazy =new CasaDeMarcatLazy(sumaInitiala);
		}
		return casaDeMarcatLazy;
	}
	
	public static CasaDeMarcatLazy getInstance() {
		return getInstance(100);
	}

}
