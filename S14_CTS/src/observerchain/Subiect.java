package observerchain;

public interface Subiect {
  public void adauagaObserver(Observer observer);
  public void notificaObserver(String mesaj);
   public void eliminaObserver(Observer observer);
}
