package observerchain;

public class ProgramMain {

	public static void main(String[] args) {
         ClientFidel client1=new ClientFidel("Ana");
         ClientFidel client2=new ClientFidel("Marius");
         ClientFidel client3=new ClientFidel("Cristi");

         Restaurant restaurant=new Restaurant();
         
         restaurant.adauagaObserver(client1);
         restaurant.ofertaPret();
         restaurant.eliminaObserver(client1);
         restaurant.adauagaObserver(client2);
         restaurant.adauagaObserver(client3);
         restaurant.meniuNou();

	}

}
