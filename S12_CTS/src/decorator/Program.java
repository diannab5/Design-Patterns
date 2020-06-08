package decorator;

public class Program {

	public static void main(String[] args) {
		BonDeCasa bon=new BonDeCasa(20,2);
		bon.printBon();
		
		DecoratorConcret bonDecorat=new DecoratorConcret(bon);
	    
	}

}
