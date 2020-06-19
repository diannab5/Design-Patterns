package factorymethod;

public class ProgramMain {

	public static void main(String[] args) {
		Factory f1 = new FactoryInvestitiiFonduri();
		Factory f2 = new FactorySchimbValutar();
		
		f1.creareServiciuFinanciar().descriere();
		f2.creareServiciuFinanciar().descrieBeneficiar("Casa de schimb valutar BCR");

	}

}
