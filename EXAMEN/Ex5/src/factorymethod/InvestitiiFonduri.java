package factorymethod;

public class InvestitiiFonduri implements IFinanciar {

	@Override
	public void descriere() {
		System.out.println("S-a realizat o investitie de fonduri");
	}

	@Override
	public void descrieBeneficiar(String numeBeneficiar) {
		System.out.println("Beneficiarul investitiei de fonduri este " + numeBeneficiar);
	}

}
