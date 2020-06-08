package adapter.framework_achizionat;

import adapter.framework_existent.Credit;

public class AdapterCredit extends CreditLeasing implements Credit {

	public AdapterCredit(float pretProdus, int nrLuni) {
		super(pretProdus, nrLuni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.achizionareLeasing();
		
	}

	@Override
	public float rataLunara() {
		return super.calculRataLunara();
	}

}
