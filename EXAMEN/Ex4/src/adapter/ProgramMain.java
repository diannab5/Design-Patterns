package adapter;



public class ProgramMain {

	public static void main(String[] args) {
		CardAutobuz cardAutobuz = new CardAutobuz(30);
		Calator calator = new Calator("Alex", cardAutobuz);
		calator.platesteMetrou();
		
		calator.getCardAutobuz().setSuma(45);
		calator.platesteTramvai();
		

	}

}
