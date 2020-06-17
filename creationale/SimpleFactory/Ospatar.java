package dp.factory;

public class Ospatar extends AAngajat{

	@Override
	public String getTip() {
		// TODO Auto-generated method stub
		return "Ospatar";
	}

	@Override
	public void afisare() {
		System.out.println("Angajatul "+this.getNume() + " este ospatar");
		
	}

}
