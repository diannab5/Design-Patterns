package observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect {
   private List<Observer> clientiFideli;
	
   
   public Restaurant() {
	super();
	clientiFideli=new ArrayList<Observer>();
}

@Override
	public void adauagaObserver(Observer observer) {
clientiFideli.add(observer);		
	}

	@Override
	public void notificaObserver(String mesaj) {
    for (Observer observer : clientiFideli) {
	 observer.receptioneazaMesaj(mesaj);
 }
	}

	@Override
	public void eliminaObserver(Observer observer) {
		clientiFideli.remove(observer);		
	}
	
	public void ofertaPret() {
		notificaObserver("S-a introdus o noua oferta de pret");
	}
   public void meniuNou() {
	   notificaObserver("S-a introdus un meniu nou");
   }
}
