package dp.factory;

public abstract class AAngajat {
	private String nume;

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getNume() {
		return nume;
	}

	public abstract String getTip();
	public abstract void afisare();
}
