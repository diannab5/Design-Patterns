package compositebanca;


public class Filiala extends Sucursala {

	public Filiala(String numeManager) {
		super(numeManager);

	}

	@Override
	public void adaugaSucursala(Sucursala sucursala) throws Exception {
		throw new Exception("Nu este implementata");
		
	}

	@Override
	public void stergeSucursala(Sucursala sucursala) throws Exception {
		throw new Exception("NU este implementata");
		
	}

	@Override
	public Sucursala getSucursala(int pozitie) throws Exception {
		throw new Exception("NU este implementata");
	}

	@Override
	public void descriereSucursala() {
		 System.out.println("\tDescriere filiala:");
	        System.out.println("\tManager Filiala"+getNumeManager());
		
	}

}
