package adapter;

import clase.ICosCumparaturi;

public class AdapterCosCumparaturi extends CosCumparaturiNou implements ICosCumparaturi {
	

	@Override
	public void adaugaProdus(String produs) {
		super.addProduct(produs);
		
	}

	@Override
	public void plata() {
		super.pay(super.numarProduse);
		
	}

}
