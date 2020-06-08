package adapter;

import adapter.adapter_obiecte.AdapterCreditObiecte;
import adapter.framework_achizionat.AdapterCredit;
import adapter.framework_achizionat.CreditLeasing;
import adapter.framework_existent.Credit;
import adapter.framework_existent.CreditDeNevoiPersonale;

public class Program {

	
	public static void oferaInformatiiCredit(Credit credit) {
		credit.oferaCredit();
		System.out.println("Rata lunara "+credit.rataLunara());
	}
	public static void main(String[] args) {
		CreditDeNevoiPersonale credit=new CreditDeNevoiPersonale(4500,5);
		oferaInformatiiCredit(credit);
		
		CreditLeasing creditLeasing=new CreditLeasing(3000,6);
	//oferaInformatiiCredit(creditLeasing);
		AdapterCredit adapterCredit=new AdapterCredit(3000,6);
		oferaInformatiiCredit(adapterCredit);
		
		AdapterCreditObiecte adapterObiecte=new AdapterCreditObiecte(creditLeasing);
		oferaInformatiiCredit(adapterObiecte);

	}

}
