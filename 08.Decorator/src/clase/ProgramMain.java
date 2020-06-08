package clase;

import decorator.DecoratorConcret;

public class ProgramMain {

	public static void main(String[] args) {
     BonDeCasa bon=new BonDeCasa(3, 100);
     bon.printBon();
     
     DecoratorConcret bonDecorat=new DecoratorConcret(bon);
     bonDecorat.printareFelicitare();
	}

}
