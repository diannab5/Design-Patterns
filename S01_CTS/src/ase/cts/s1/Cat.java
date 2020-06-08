package ase.cts.s1;

public class Cat extends Animal {
  private String tipHrana;
	public Cat(String name,String tipHrana) {
		super(name);
		this.tipHrana=tipHrana;
	}

	@Override
	public String getTipHrana() {
		return tipHrana;
	}

}
