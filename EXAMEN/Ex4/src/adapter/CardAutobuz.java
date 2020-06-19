package adapter;

public class CardAutobuz {
	private double suma;

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public CardAutobuz(double suma) {
		super();
		this.suma = suma;
	}
	
	public String plateste() {
		return "S-a platit suma " + suma + " cu cardul de la autobuz" ;
	}
}
