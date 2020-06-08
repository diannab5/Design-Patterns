package factory;

public class JucatorFactorySingleton {
private static JucatorFactorySingleton instanta=null;
	
	private JucatorFactorySingleton() {
	}
	
	public static synchronized JucatorFactorySingleton getInstance() {
		if(instanta == null ) {
			instanta=new JucatorFactorySingleton();
		}
		return instanta;
	}

	public Jucator createJucator(TipJucator tipJucator, String nume) {
		switch(tipJucator) {
		case PORTAR: {
			return new Portar(nume);
		}
		case FUNDAS: {
			return new Fundas(nume);
		}
		case ATACANT: {
			return new Atacant(nume);
		}
		default: 
			return null;
		}
		
	}
}
