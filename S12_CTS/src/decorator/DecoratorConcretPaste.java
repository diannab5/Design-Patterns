package decorator;

public class DecoratorConcretPaste extends Decorator{

	public DecoratorConcretPaste(IBonDeCasa iBonDeCasa) {
		super(iBonDeCasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printareFelicitare() {
		System.out.println("Paste fericit!");
		
	}

}
