package adapter;

public class CardAdaptat implements IPlata {
	private CardAutobuz cardAutobuz;
	
	
	public CardAdaptat(CardAutobuz cardAutobuz) {
		super();
		this.cardAutobuz = cardAutobuz;
	}

	public CardAutobuz getCardAutobuz() {
		return cardAutobuz;
	}

	public void setCardAutobuz(CardAutobuz cardAutobuz) {
		this.cardAutobuz = cardAutobuz;
	}

	@Override
	public void platesteMetrou() {
		System.out.println(cardAutobuz.plateste() + " la metrou");
		
	}

	@Override
	public void platesteTramvai() {
		System.out.println(cardAutobuz.plateste() + " la tramvai");
		
	}

}
