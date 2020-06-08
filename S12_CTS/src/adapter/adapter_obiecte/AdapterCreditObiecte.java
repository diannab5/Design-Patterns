package adapter.adapter_obiecte;

import adapter.framework_achizionat.CreditLeasing;
import adapter.framework_existent.Credit;

public class AdapterCreditObiecte implements Credit {
    private CreditLeasing creditLeasing;
	
	
    
	public AdapterCreditObiecte(CreditLeasing creditLeasing) {
		super();
		this.creditLeasing = creditLeasing;
	}

	@Override
	public void oferaCredit() {
		creditLeasing.achizionareLeasing();
		
	}

	@Override
	public float rataLunara() {
		return creditLeasing.calculRataLunara();
	}

}
