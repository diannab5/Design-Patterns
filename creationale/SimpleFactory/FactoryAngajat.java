package dp.factory;

public class FactoryAngajat {
	public static AAngajat creareAngajat(EAngajat tipAngajat, String nume) {
		AAngajat angajat = null;
		
		switch(tipAngajat) {
		case OSPATAR:
			angajat = new Ospatar();
			angajat.setNume(nume);
			break;
		case BUCATAR:
			angajat = new Bucatar();
			angajat.setNume(nume);
			break;
		}
		
		return angajat;
	}
}
