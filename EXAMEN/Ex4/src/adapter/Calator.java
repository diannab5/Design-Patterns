package adapter;

public class Calator {
	private String nume;
	private CardAutobuz cardAutobuz;
	CardAdaptat cardAdaptat;

	public Calator(String nume, CardAutobuz cardAutobuz) {
		super();
		this.nume = nume;
		this.cardAutobuz = cardAutobuz;
		cardAdaptat=new CardAdaptat(cardAutobuz);

	}
	

	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public CardAutobuz getCardAutobuz() {
		return cardAutobuz;
	}

	public void platesteMetrou() {
		cardAdaptat.platesteMetrou();
	}

	public void platesteTramvai() {
		cardAdaptat.platesteTramvai();
	}

}
