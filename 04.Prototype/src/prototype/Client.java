package prototype;

public class Client implements IClient {
    private String nume;
    private int puncteDeFidelitate;
	
    
    public Client() {
		super();
	}
	public Client(String nume, int puncteDeFidelitate) {
		super();
		this.nume = nume;
		this.puncteDeFidelitate = puncteDeFidelitate;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getPuncteDeFidelitate() {
		return puncteDeFidelitate;
	}
	public void setPuncteDeFidelitate(int puncteDeFidelitate) {
		this.puncteDeFidelitate = puncteDeFidelitate;
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", puncteDeFidelitate=" + puncteDeFidelitate + "]";
	}
	@Override
	public IClient copiaza() {
		Client c=new Client();
		c.setNume(this.nume);
		c.setPuncteDeFidelitate(this.puncteDeFidelitate);
	    return c;
	}
	
	
    
    
}
