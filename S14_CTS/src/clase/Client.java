package clase;

public class Client {
    private String nume;
    private ModPLata modPlata;
    
	public Client(String nume) {
		super();
		this.nume = nume;
	}

	
    
	//setarea platii se face la final 
	
	public void setModPlata(ModPLata modPlata) {
		this.modPlata = modPlata;
	}



	public void plateste(float suma) {
		this.modPlata.realizeazaPlata(suma);
	}
    
    
}
