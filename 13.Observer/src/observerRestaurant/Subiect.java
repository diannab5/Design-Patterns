package observerRestaurant;

public interface Subiect {
	public void adaugaObserver(Observer observer);
	public void notificaObserveri(String mesaj);
	public void eliminaObserver(Observer observer);
}
