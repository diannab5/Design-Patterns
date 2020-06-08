package factura;

public class Factura implements IFactura {
	private int codFactura;
	private double sumaFactura;
	
	
	public Factura(int codFactura, double sumaFactura) {
		super();
		this.codFactura = codFactura;
		this.sumaFactura = sumaFactura;
	}


	public int getCodFactura() {
		return codFactura;
	}


	public void setCodFactura(int codFactura) {
		this.codFactura = codFactura;
	}


	public double getSumaFactura() {
		return sumaFactura;
	}


	public void setSumaFactura(double sumaFactura) {
		this.sumaFactura = sumaFactura;
	}


	@Override
	public void printeazaFactura() {
      System.out.println("Factura cu codul "+this.codFactura+" are suma de plata "+this.sumaFactura);		
	}

}
