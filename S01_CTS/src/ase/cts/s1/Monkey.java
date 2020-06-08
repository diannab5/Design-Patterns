package ase.cts.s1;

public class Monkey extends Animal {
    private Pizza tipHrana;
	public Monkey(String name,Pizza pizza) {
		super(name);
		this.tipHrana=pizza;
	};

	@Override
	public String getTipHrana() {
		return tipHrana.toString();
	}

}
