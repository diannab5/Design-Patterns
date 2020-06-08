package factory;

public class Program {
	public static void afisareDetalii(Jucator jucator) {
		System.out.println("Nume: " +jucator.getNamePlayer()+", pozitie: " +jucator.getPosition());
	}

	public static void main(String[] args) {
		JucatorFactory fabrica =new JucatorFactory();
		Jucator jucator1 = fabrica.createJucator(TipJucator.ATACANT, "Andrei");
		afisareDetalii(jucator1);
		Jucator jucator2 = fabrica.createJucator(TipJucator.FUNDAS, "Mircea");
		afisareDetalii(jucator2);
		
		JucatorFactorySingleton fabricaSingleton =JucatorFactorySingleton.getInstance();
		Jucator jucatorSingleton = fabricaSingleton.createJucator(TipJucator.PORTAR, "Razvan");
		afisareDetalii(jucatorSingleton);
	}

}
