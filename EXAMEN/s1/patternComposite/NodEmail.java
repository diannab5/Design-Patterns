package cts.Balan.Diana.g1075.patternComposite;

public abstract class NodEmail {
	protected String nume;
	protected String id;
	protected String email;
	public NodEmail(String nume, String id, String email) {
		super();
		this.nume = nume;
		this.id = id;
		this.email = email;
	}
	
	public abstract void adaugaEmail(NodEmail email) throws Exception ;
	public abstract void stergeEmail(NodEmail email) throws Exception ;
	public abstract NodEmail getNodEmail(int pozitie) throws Exception ;
	public abstract void afisareStructura(int level)throws Exception ;
	
	
}
