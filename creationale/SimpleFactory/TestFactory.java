package dp.factory;

import java.lang.annotation.ElementType;

public class TestFactory {

	public static void main(String[] args) {
		AAngajat ang1 = FactoryAngajat.creareAngajat(EAngajat.BUCATAR, "Gigel");
		AAngajat ang2 = FactoryAngajat.creareAngajat(EAngajat.OSPATAR, "Costel");
		
		System.out.println(ang1.getTip());
		System.out.println(ang2.getTip());
		
		ang1.afisare();
		ang2.afisare();

	}

}
