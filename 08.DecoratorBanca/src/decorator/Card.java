package decorator;

public class Card implements ICard {

	@Override
	public void efectuarePlataOnline() {
System.out.println("Plata a fost efectuala online");		
	}

	@Override
	public void efectuarePlataNormala() {
  System.out.println("Plata a fost efectuata cash");
		
	}

}
