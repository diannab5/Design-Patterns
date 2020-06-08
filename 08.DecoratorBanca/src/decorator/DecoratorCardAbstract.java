package decorator;

public abstract class DecoratorCardAbstract implements ICard {
  private ICard card;

  
public DecoratorCardAbstract(ICard card) {
	super();
	this.card = card;
}

@Override
public void efectuarePlataOnline() {
   card.efectuarePlataOnline();	
}

@Override
public void efectuarePlataNormala() {
card.efectuarePlataNormala();	
}
  
//anunt nota metoda pt adaugare functionalitate
public abstract void efectuarePlataContactless();
  
}
