package dp.factory;

public class Bucatar extends AAngajat{

	@Override
	public String getTip() {
		// TODO Auto-generated method stub
		return "Bucatar";
	}

	@Override
	public void afisare() {
		System.out.println("Angajatul "+this.getNume() + " este bucatar");
		
	}

}
