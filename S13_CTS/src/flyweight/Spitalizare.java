package flyweight;

public class Spitalizare {
     private int nrSalon;
     private int nrPat;
     private int nrZileSpitalizare;
	public Spitalizare(int nrSalon, int nrPat, int nrZileSpitalizare) {
		super();
		this.nrSalon = nrSalon;
		this.nrPat = nrPat;
		this.nrZileSpitalizare = nrZileSpitalizare;
	}
	@Override
	public String toString() {
		return "Spitalizare [nrSalon=" + nrSalon + ", nrPat=" + nrPat + ", nrZileSpitalizare=" + nrZileSpitalizare
				+ "]";
	}
	public int getNrSalon() {
		return nrSalon;
	}
	public int getNrPat() {
		return nrPat;
	}
	public int getNrZileSpitalizare() {
		return nrZileSpitalizare;
	}
     
     
}
