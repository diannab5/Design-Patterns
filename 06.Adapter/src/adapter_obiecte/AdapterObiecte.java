package adapter_obiecte;

import framework_achizionat.CreditLeasing;
import framework_existent.Credit;

public class AdapterObiecte implements Credit {
    //obiect din clasa achizionata
	private CreditLeasing creditLeasing;
    
    
	public AdapterObiecte(CreditLeasing creditLeasing) {
		super();
		this.creditLeasing = creditLeasing;
	}

	@Override
	public void oferaCredit() {
		this.creditLeasing.achizionareLeasing();
	}

	@Override
	public float rataLunara() {
		return this.creditLeasing.calculRataLunara();
	}

}
