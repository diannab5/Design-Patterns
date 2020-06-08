package clase;


//Eager dezavantaj: nu pot citi din fisier
//Eager static:initializeaza instanta chiar daca nu e fol
//Lazy: cand initializam instanta o facem cu null
       //in cadrul metodei getInstance verificam daca inst a fost initializata cu null
//Thread safe singleton -> versiune recomandata
public class CasaDeMarcat {
       private double suma;
       private static CasaDeMarcat casaDeMarcat=new CasaDeMarcat(); //trebuie sa fie statica
       
       //Ambii constructori trebuie private
       private CasaDeMarcat() {
		this.suma=0;
	}
   //E privat ca sa nu poata fi accesat in afara clasei
	private CasaDeMarcat(double suma) {
		super();
		this.suma = suma;
	}

	
	public static CasaDeMarcat getInstance() {
		return casaDeMarcat;
	}
	public void incaseazaNota(double sumaIncasata) {
    	   suma+=sumaIncasata;
       }
	public double getSuma() {
		return suma;
	}
	public static CasaDeMarcat getCasaDeMarcat() {
		return casaDeMarcat;
	}
	
	
}
