package decorator;

public abstract class  Decorator implements IBonDeCasa {
     private IBonDeCasa iBonDeCasa;

	public Decorator(IBonDeCasa iBonDeCasa) {
		super();
		this.iBonDeCasa = iBonDeCasa;
	}
     
     @Override
     public void printBon() {
    	 iBonDeCasa.printBon();
     }
	
     public abstract void printareFelicitare();
}
