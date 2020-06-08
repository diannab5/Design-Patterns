package ase.cts.s1;

public class Pizza {
    private int diagonala;
    private String topping;
    public Pizza(int diagonala,String topping) {
    	super();
    	this.diagonala=diagonala;
    	this.topping=topping;
    }
	@Override
	public String toString() {
		return "Pizza [diagonala=" + diagonala + ", topping=" + topping + "]";
	}
    
    
}
