package decorator;

public class DecoratorConcret extends Decorator {

	public DecoratorConcret(IBonDeCasa iBonDeCasa) {
		super(iBonDeCasa);
	}

	@Override
	public void printareFelicitare() {
		System.out.println("La multi ani!");
		
	}
    
}
