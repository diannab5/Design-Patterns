package builder;
public class Utilizator {
	private String nume;
	private String prenume;
	private TipUtilizator tip;
	
	private int varsta;
	private String gen;
	private int grupa;
	private String facultatea;
	private String cursulCoordonat;
	
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public TipUtilizator getTip() {
		return tip;
	}

	public void setTip(TipUtilizator tip) {
		this.tip = tip;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public int getGrupa() {
		return grupa;
	}

	public void setGrupa(int grupa) {
		this.grupa = grupa;
	}

	public String getFacultatea() {
		return facultatea;
	}

	public void setFacultatea(String facultatea) {
		this.facultatea = facultatea;
	}

	public String getCursulCoordonat() {
		return cursulCoordonat;
	}

	public void setCursulCoordonat(String cursurlCoordonat) {
		this.cursulCoordonat = cursurlCoordonat;
	}
	
	@Override
	public String toString() {
		return "Utilizator [nume=" + nume + ", prenume=" + prenume + ", tip=" + tip + ", varsta=" + varsta + ", gen="
				+ gen + ", grupa=" + grupa + ", facultatea=" + facultatea + ", cursulCoordonat=" + cursulCoordonat
				+ "]";
	}

	
}
