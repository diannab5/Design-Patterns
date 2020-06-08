package facade;

public class Depozit {
  public static boolean verificareDisponibilitate(int codMedicament) {
	  return codMedicament%2==0;
  }
}
