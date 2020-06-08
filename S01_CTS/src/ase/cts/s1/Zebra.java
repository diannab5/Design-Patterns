package ase.cts.s1;

public class Zebra extends Animal {
  public Zebra(String name,String tipHrana) {
		super(name);
		this.tipHrana=tipHrana;
  }

private String tipHrana;
  
	@Override
	public String getTipHrana() {
		return tipHrana;
	}

}
