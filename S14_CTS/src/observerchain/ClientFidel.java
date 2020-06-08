package observerchain;

public class ClientFidel implements Observer {
    private String nume;
    private String nrTelefon;
    private String adresaMail;
    
    
	public ClientFidel(String nume) {
		super();
		this.nume = nume;
	}
	
	
	public ClientFidel(String nume, String nrTelefon, String adresaMail) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.adresaMail = adresaMail;
	}



	@Override
	public void receptioneazaMesaj(String mesaj) {
         System.out.println(this.nume+ " ai primit mesajul " +mesaj);		
	}


	@Override
	public String getNrTelefon() {
		return this.nrTelefon;
	}


	@Override
	public String getEmail() {
	return this.getEmail();
	}


	@Override
	public String getNume() {
		return this.getNume();
	}

}
