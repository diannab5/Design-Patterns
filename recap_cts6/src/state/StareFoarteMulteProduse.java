package state;

import clase.CosCumparaturi;

public class StareFoarteMulteProduse implements IAfisareCos{

	@Override
	public void afisareMesajCos() {
		System.out.println("Cosul este cu foarte multe produse");
		
	}

	@Override
	public void schimbaStarea(CosCumparaturi cos) {
		cos.setStare(this);
		
	}

}
