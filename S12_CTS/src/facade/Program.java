package facade;

public class Program {

	public static void main(String[] args) {
		Reteta reteta=new Reteta(130,565);
		
		if(Depozit.verificaDisponibilitate(reteta.getCodMedicament())) {
			if(CasaDeAsigurari.esteAsigurat(reteta.getNrCard())) {
			System.out.println("Reteta poate fi procesata!");
			}
			else System.out.println("Clientul nu este asigurat!");
		} else
		{System.out.println("Nu exista disponibilitate pentru medicamentul respectiv!");
		}
		
	}

}
