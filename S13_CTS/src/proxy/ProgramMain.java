package proxy;

public class ProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana pacient1 = new Persoana("Irina", true);
		Persoana pacient2 = new Persoana("Cristian", false);
		
		Spital spital = new Spital();
		spital.internare(pacient1);
		spital.internare(pacient2);
		
		ProxySpital proxy = new ProxySpital(spital);
		proxy.internare(pacient1);
		proxy.internare(pacient2);
	}

}