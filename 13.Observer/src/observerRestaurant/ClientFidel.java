package observerRestaurant;

public class ClientFidel implements Observer{
private String nume;
	
	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}
	@Override
	public void receptioneazaMesaj(String mesaj) {
		System.out.println(this.nume + ", ai primit mesajul: "+mesaj);
		
	}

}
