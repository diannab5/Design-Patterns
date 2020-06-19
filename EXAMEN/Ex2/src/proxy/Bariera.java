package proxy;

public class Bariera implements IBariera{
    private boolean nuEsteRidicata;

	public Bariera(boolean nuEsteRidicata) {
		super();
		this.nuEsteRidicata = nuEsteRidicata;
	}

	public boolean nuEsteRidicata() {
		return nuEsteRidicata;
	}

	

	@Override
	public void verificareSuplimentara(Bariera bariera) {
		System.out.println("S-a efectuat verificarea suplimentara");
		
	}
    
    
}
