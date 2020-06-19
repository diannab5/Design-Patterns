package chain;

public class ProgramMain {

	public static void main(String[] args) {
		//definire 5 calatori
		Calator c1 = new Calator("Adrian", 3);
		Calator c2 = new Calator("Ion", 9);
		Calator c3 = new Calator("Alex", 13);
		Calator c4 = new Calator("Elena", 20);
		Calator c5 = new Calator("Diana", 15);
		
		//mijloacele de transport 
		HandlerAutobuz autobuz = new HandlerAutobuz();
		HandlerTramvai tramvai = new HandlerTramvai();
		HandlerMetrou metrou = new HandlerMetrou();
		HandlerTren tren = new HandlerTren();
		
		autobuz.setUrmatorulHandler(tramvai);
		tramvai.setUrmatorulHandler(metrou);
		metrou.setUrmatorulHandler(tren);
		
		autobuz.handler(c1.getNrKm());
		autobuz.handler(c2.getNrKm());
		autobuz.handler(c3.getNrKm());
		autobuz.handler(c4.getNrKm());
		autobuz.handler(c5.getNrKm());


	}

}
