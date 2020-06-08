package clase;

public class BonDeCasa implements IBonDeCasa {
   private int nrMedicamente;
   private double totalBon;
   
   
	public BonDeCasa(int nrMedicamente, double totalBon) {
	super();
	this.nrMedicamente = nrMedicamente;
	this.totalBon = totalBon;
}


	@Override
	public void printBon() {
   System.out.println("Total bon "+this.totalBon+" nr.medicamente "+this.nrMedicamente);		
	}

}
