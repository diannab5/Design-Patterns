package acs.ase.clase;

public class ExceptieCNP extends IllegalArgumentException{
  
	public String mesaj;

	public ExceptieCNP(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}
	
	
}
