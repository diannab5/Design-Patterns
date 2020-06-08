package clase;

public class CasaDeMarcatLazy {
    private double suma;
    private static CasaDeMarcatLazy casaDeMarcatLazy=null; //trebuie sa fie statica
    
    //Ambii constructori trebuie private
    private CasaDeMarcatLazy() {
		this.suma=0;
	}
//E privat ca sa nu poata fi accesat in afara clasei
	private CasaDeMarcatLazy(double suma) {
		super();
		this.suma = suma;
	}

	
	public static CasaDeMarcatLazy getInstance(double sumaInitiala) {
		if(casaDeMarcatLazy==null) {
			casaDeMarcatLazy=new CasaDeMarcatLazy(sumaInitiala);
		}
		return casaDeMarcatLazy;
		
	}
	
	public static CasaDeMarcatLazy getInstance() {
		return getInstance(100);
	}
	public void incaseazaNota(double sumaIncasata) {
 	   suma+=sumaIncasata;
    }
	public double getSuma() {
		return suma;
	}
	
}
