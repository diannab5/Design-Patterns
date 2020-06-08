package facade;

public class FacadeReteta {
	public static boolean verificaReteta(Reteta reteta) {
		if (Depozit.verificaDisponibilitate(reteta.getCodMedicament())) {
			if (CasaDeAsigurari.esteAsigurat(reteta.getNrCard())) {
				return true;
			}
		}
		return false;
	}
	
	public static String verificaRetetaMesaj(Reteta reteta) {
		if (Depozit.verificaDisponibilitate(reteta.getCodMedicament())) {
			if (CasaDeAsigurari.esteAsigurat(reteta.getNrCard())) {
				return "Reteta poate fi procesata!";
			}
			else {
				return"Clientul nu este asigurat";
			}
		}
		return "Clientul";
	}
}
