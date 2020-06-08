package factory;

public class JucatorFactory {
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
