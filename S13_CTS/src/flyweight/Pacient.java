package flyweight;

public class Pacient implements IPacient{
      private String nume;
      private String nrTelefon;
      private String adresa;
      
      
	public Pacient(String nume, String nrTelefon, String adresa) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresa = adresa;
	}


	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", nrTelefon=" + nrTelefon + ", adresa=" + adresa + "]";
	}

	

	public String getNume() {
		return nume;
	}


	public String getNrTelefon() {
		return nrTelefon;
	}


	public String getAdresa() {
		return adresa;
	}


	@Override
	public void printarePacient(Spitalizare spitalizare) {
		  System.out.println("Pacientul " +toString()+" este internat in " + spitalizare.toString());
	}

}
