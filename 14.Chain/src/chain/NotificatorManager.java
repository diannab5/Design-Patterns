package chain;
//za finala
public class NotificatorManager extends Notificator {

	@Override
	public void notifica(Client client, String mesaj) {
		System.out.println(client.getNume() + " nu a putut primi mesajul");
		
	}

}
