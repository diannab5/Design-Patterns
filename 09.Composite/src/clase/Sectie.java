package clase;

//clasa frunza
public class Sectie implements InterfataComunaNoduri {
	private String nume;

	
	public Sectie(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void descriere() {
		System.out.println("Sectia: "+this.nume);
		
	}
	
	
}
