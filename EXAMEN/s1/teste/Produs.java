package cts.Balan.Diana.g1075.teste;


public class Produs {

	private String denumireProdus;
	private Double pret;//cuprins in [1,1000]
	public Produs(String denumireProdus, Double pret) {
		super();
		this.denumireProdus = denumireProdus;
		this.pret = pret;
	}
	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}
	
	public void setPret(Double pret, int tipPromotie) {
		if(pret >= 1 && pret <= 1000) {
		switch(tipPromotie){
		case 1:
			this.pret = pret;
			break;
		case 2:
			this.pret = pret/2;
			break;//am adaugat break ca sa mearga testul de bounderysuperior pt 2
		default:
			this.pret = pret;	
			break;
		}
		}
		
	}
	public String getDenumireProdus() {
		return denumireProdus;
	}
	public Double getPret() {
		return pret;
	}
	@Override
	public String toString() {
		return "Produs [" + denumireProdus + ",    pret=" + pret + "]";
	}
	
	
}
