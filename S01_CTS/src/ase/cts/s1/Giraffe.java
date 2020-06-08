package ase.cts.s1;

public class Giraffe extends Animal {
    private String tipHrana;
	public Giraffe(String name,String tipHrana) {
		super(name);
	    this.tipHrana=tipHrana;
	}

	@Override
	public String getTipHrana() {
		return tipHrana;
	}

}
