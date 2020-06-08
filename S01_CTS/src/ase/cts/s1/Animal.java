package ase.cts.s1;

public abstract class Animal {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract String getTipHrana();
    
    
}
