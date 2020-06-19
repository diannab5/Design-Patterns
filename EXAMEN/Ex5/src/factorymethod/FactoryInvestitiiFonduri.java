package factorymethod;

public class FactoryInvestitiiFonduri implements Factory {

	@Override
	public IFinanciar creareServiciuFinanciar() {
		return new InvestitiiFonduri();
	}

}
