package observerRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect {
	public List<Observer> clientiFideli;
	
	
	public Restaurant() {
		clientiFideli = new ArrayList();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		clientiFideli.add(observer);
		
	}

	@Override
	public void notificaObserveri(String mesaj) {
		for (Observer observer:clientiFideli) {
			observer.receptioneazaMesaj(mesaj);
		}
		
	}

	@Override
	public void eliminaObserver(Observer observer) {
		clientiFideli.remove(observer);
		
	}

	public void ofertaPret() {
		notificaObserveri("S-a introdus o noua oferta de pret");
	}
	
	public void introducereMeniuNou() {
		notificaObserveri("S-a introdus un meniu nou");
	}
}
