package cts.Balan.Diana.gNr1075.teste;

public class Produs {

	private String denumireProdus;
	private Double pret;// interval [1,1000]

	public Produs(String denumireProdus, Double pret) {
		super();
		this.denumireProdus = denumireProdus;
		this.pret = pret;
	}

	public void setDenumireProdus(String denumireProdus) {
		this.denumireProdus = denumireProdus;
	}

	public void setPret(Double pret, int tipPromotie) {
		
		if(pret<0) {
			 throw new ExceptiePretZeroSauNegativ("Pretul trebuie sa fie mai mare decat 0!");
		}
		
		switch (tipPromotie) {
		case 1:
			this.pret = pret;
			break;
		case 2:
			this.pret = pret / 2;
			break;
		default:
			this.pret = pret;
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
