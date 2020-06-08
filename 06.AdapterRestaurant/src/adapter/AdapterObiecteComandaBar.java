package adapter;

import adapter.framework_achizitionat.ComandaBar;
import adapter.framework_existent.ComandaBucatarie;

public class AdapterObiecteComandaBar extends ComandaBucatarie {
	
	//atribut de tipul clasei achizionate
	private ComandaBar comandaBar;
	

    //fara atriubtul pret 
	public AdapterObiecteComandaBar(ComandaBar comandaBar) {
		super();
		this.comandaBar = comandaBar;
	}
	
	//trebuie sa suprascriem metoda din clasa ComandaBucatarie, aia cu solicitareBon
	@Override
	public void solicitareBon() {
		//nu adaug o functionalitate noua, ci ma folosesc de metoda pe care o am
		//in ComandaBar aici cu emitereBonBar
		comandaBar.emitereBonBar();
	}
    

	

	
       
}
