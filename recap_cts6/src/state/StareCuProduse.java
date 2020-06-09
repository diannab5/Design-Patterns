package state;

import clase.CosCumparaturi;

public class StareCuProduse implements IAfisareCos {

	@Override
	public void afisareMesajCos() {
		System.out.println("Cosul este cu produse!");
		
	}

	@Override
	public void schimbaStarea(CosCumparaturi cos) {
		cos.setStare(this);
		
	}

}
