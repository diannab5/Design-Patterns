package adapter;

import adapter.framework_achizitionat.ComandaBar;
import adapter.framework_existent.ComandaBucatarie;
import adapter.framework_existent.IComandaBucatarie;

public class ProgramMain {
	//primeste ca parametru ComandaBucatarie cand nu avem interfata IComan...
  public static void printareBonuriBucatarie(IComandaBucatarie comanda) {
	  comanda.solicitareBon();
  }
	public static void main(String[] args) {
		ComandaBucatarie comanda1=new ComandaBucatarie(400);
		printareBonuriBucatarie(comanda1);
		
		//nu recunoaste tipul asta de obiect , nu sunt compatibile tipurile
		ComandaBar comandaBar1=new ComandaBar(340);
		//printareBonuriBucatarie(comandaBar1);
		
		//adapter obiecte
		AdapterObiecteComandaBar comandaBarAdaptata=new AdapterObiecteComandaBar(comandaBar1);
		printareBonuriBucatarie(comandaBarAdaptata);
		
		//adapter clase
		AdapterClaseComandaBar comandaBarAdaptataClase=new AdapterClaseComandaBar(1900);
		printareBonuriBucatarie(comandaBarAdaptataClase);
		
        
	}

}
