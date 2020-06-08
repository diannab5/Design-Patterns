package clase;

import adapter_obiecte.AdapterObiecte;
import framework_achizionat.CreditLeasing;
import framework_existent.Credit;
import framework_existent.CreditDeNevoiPersonale;

public class ProgramMain {
    public static void informatiiCredit(Credit credit) {
    	credit.oferaCredit();
    	System.out.println("Rata lunara este de "+credit.rataLunara());
    }
	public static void main(String[] args) {
   CreditDeNevoiPersonale creditDeNevoiPersonale=new CreditDeNevoiPersonale(400, 20);
   informatiiCredit(creditDeNevoiPersonale);
	
   //inainte de implementarea adapterului clasa nu poate fi fol
   CreditLeasing creditLeasing=new CreditLeasing(800, 8);
  // informatiiCredit(creditLeasing);
   
   AdapterObiecte adapterObiecte=new AdapterObiecte(creditLeasing);
   informatiiCredit(adapterObiecte);
	}

}
