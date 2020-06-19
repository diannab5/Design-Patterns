package factorymethod;

public class FactorySchimbValutar implements Factory{

	@Override
	public IFinanciar creareServiciuFinanciar() {
		
		return new SchimbValutar();
	}

}
