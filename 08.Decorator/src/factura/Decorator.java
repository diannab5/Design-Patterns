package factura;

public abstract class Decorator implements IFactura {
    protected Factura factura;
    
    
	public Decorator(Factura factura) {
		super();
		this.factura = factura;
	}


	@Override
	public void printeazaFactura() {
		factura.printeazaFactura();
		
	}

	 public abstract void aplicaDiscount(int procent);
}
