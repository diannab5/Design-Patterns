package chain;

public class Calator implements ICalator{
  private String nume;
  private int nrKm;
  
  
	public Calator(String nume, int nrKm) {
	super();
	this.nume = nume;
	this.nrKm = nrKm;
}


	public String getNume() {
	return nume;
}


public void setNume(String nume) {
	this.nume = nume;
}


public int getNrKm() {
	return nrKm;
}


public void setNrKm(int nrKm) {
	this.nrKm = nrKm;
}


	@Override
	public void deplaseaza(int numarKm) {
		// TODO Auto-generated method stub
		
	}

}
