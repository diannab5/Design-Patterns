package state;

import clase.CosCumparaturi;

public class StareFaraProduse implements IAfisareCos{

	@Override
	public void afisareMesajCos() {
		System.out.println("Cosul nu are produse");
		
	}

	@Override
	public void schimbaStarea(CosCumparaturi cos) {
		cos.setStare(this);
		
	}

}
