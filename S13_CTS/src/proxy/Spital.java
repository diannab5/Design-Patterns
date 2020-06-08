package proxy;

public class Spital implements ISpital {
	public void internare(Persoana pacient) {
		System.out.println(pacient.getNume()+ " a fost internat");
	}
}
