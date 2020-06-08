package decorator;

import clase.IBonDeCasa;

public abstract class DecoratorAbstract implements IBonDeCasa {
  private IBonDeCasa bonDeCasa;

public DecoratorAbstract(IBonDeCasa bonDeCasa) {
	super();
	this.bonDeCasa = bonDeCasa;
}
  
@Override
public void printBon() {
	bonDeCasa.printBon();
}
  public abstract void printareFelicitare();
}
