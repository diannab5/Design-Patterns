package adapter.framework_achizitionat;

public class ComandaBar {
    private float sumaDePlataBar;

	public ComandaBar(float sumaDePlataBar) {
		super();
		this.sumaDePlataBar = sumaDePlataBar;
	}
    
    public void emitereBonBar() {
    	System.out.println("Clientul are de plata la bar "+this.sumaDePlataBar);
    }
}
