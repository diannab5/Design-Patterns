package factura;

public class ProgramMain {

	public static void main(String[] args) {
      Factura factura=new Factura(100,450);
      factura.printeazaFactura();
      
      Decorator facturaDecorata=new FacturaDecorata(factura);
      facturaDecorata.aplicaDiscount(10);
      facturaDecorata.printeazaFactura();
	}

}
