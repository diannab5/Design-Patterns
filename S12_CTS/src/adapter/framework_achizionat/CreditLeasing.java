package adapter.framework_achizionat;

public class CreditLeasing {
   private float pretProdus;
   private int nrLuni;
   
public CreditLeasing(float pretProdus, int nrLuni) {
	super();
	this.pretProdus = pretProdus;
	this.nrLuni = nrLuni;
}

public void achizionareLeasing() {
	System.out.println("A fost achizionat produsul la pretul de"+this.pretProdus);
}
   
 public float calculRataLunara() {
	 return this.pretProdus/this.nrLuni;
 }
}
