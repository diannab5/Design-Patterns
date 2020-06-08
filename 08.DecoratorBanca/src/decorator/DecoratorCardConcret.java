package decorator;

public class DecoratorCardConcret extends DecoratorCardAbstract {

	public DecoratorCardConcret(ICard card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void efectuarePlataContactless() {
		System.out.println("Plata a fost efectuata contactless");
	}

}
