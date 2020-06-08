package facade;

public class Depozit {
   public static boolean verificaDisponibilitate(int codMedicament) {
	   return codMedicament%2==0;
   }
}
