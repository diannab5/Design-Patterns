package adapter;

import adapter.framework_achizitionat.ComandaBar;
import adapter.framework_existent.IComandaBucatarie;

//extindem clasa pe care vrem sa o adaptam si implementam interfata la care vrem sa facem adaptarea
public class AdapterClaseComandaBar extends ComandaBar implements IComandaBucatarie{

	public AdapterClaseComandaBar(float sumaDePlataBar) {
		super(sumaDePlataBar);
		
	}

	//apelam metoda din clasa parinte ComandaBar
	@Override
	public void solicitareBon() {
		super.emitereBonBar();
		
	}

}
