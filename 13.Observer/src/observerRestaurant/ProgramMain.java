package observerRestaurant;

public class ProgramMain {

	public static void main(String[] args) {
		ClientFidel client1 = new ClientFidel("Ioana");
		ClientFidel client2 = new ClientFidel("Denisa");
		ClientFidel client3 = new ClientFidel("Andrei");
		
		Restaurant restaurant = new Restaurant();
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		restaurant.ofertaPret();
		
		restaurant.eliminaObserver(client1);
		restaurant.introducereMeniuNou();

	}

}
