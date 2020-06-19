package proxy;

public class ProxyBariera implements IBariera{
   private Bariera bariera;
   
   
	public ProxyBariera(Bariera bariera) {
	super();
	this.bariera = bariera;
}


	@Override
	public void verificareSuplimentara(Bariera bariera) {
if(bariera.nuEsteRidicata()) {
	this.bariera.verificareSuplimentara(bariera);
	
}else {
	System.out.println("Bariera este deja ridicata");
}

	}

}
