package chain;

public class NotificatorEmail extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		if(client.getAdresa_mail() !=null) {
			System.out.println(client.getNume()+ " ai un mail cu mesajul "+mesaj);
		}
		else super.getUrmatorulNotificator().notifica(client, mesaj);
		
	}

}
