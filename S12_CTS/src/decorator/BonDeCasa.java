package decorator;

public class BonDeCasa implements IBonDeCasa {
    private double totalBon;
    private int nrMedicamente;
	public BonDeCasa(double totalBon, int nrMedicamente) {
		super();
		this.totalBon = totalBon;
		this.nrMedicamente = nrMedicamente;
	}
	public double getTotalBon() {
		return totalBon;
	}
	
	public int getNrMedicamente() {
		return nrMedicamente;
	}
	@Override
	public void printBon() {
		System.out.println("Suma totala: "+this.totalBon+" Nr medicamente: "+this.getNrMedicamente());
	}
	
    
    
}
