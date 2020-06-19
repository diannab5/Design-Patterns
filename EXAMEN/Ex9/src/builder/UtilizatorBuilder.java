package builder;



public class UtilizatorBuilder implements Builder{
	private Utilizator utilizator;
	
	public UtilizatorBuilder(String nume,String prenume, TipUtilizator tip) {
		utilizator = new Utilizator();
		utilizator.setNume(nume);
		utilizator.setPrenume(prenume);
		utilizator.setTip(tip);
	}
	
	public UtilizatorBuilder setVarsta(int varsta) {
		utilizator.setVarsta(varsta);
		return this;
	}
	
	public UtilizatorBuilder setGen(String gen) {
		utilizator.setGen(gen);
		return this;
	}
	
	public UtilizatorBuilder setGrupa(int grupa) {
		utilizator.setGrupa(grupa);
		return this;
	}
	
	public UtilizatorBuilder setFacultate(String facultatea) {
		utilizator.setFacultatea(facultatea);
		return this;
	}
	
	public UtilizatorBuilder setCursulCoordonat(String cursulCoordonat) {
		utilizator.setCursulCoordonat(cursulCoordonat);
		return this;
	}

	@Override
	public Utilizator build() {
		return utilizator;
	}
}