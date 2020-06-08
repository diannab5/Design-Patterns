package chain;

public class ProgramMain {

	public static void main(String[] args) {
		Notificator notificatorSMS = new NotificatorSMS();
		Notificator notificatorEmail = new NotificatorEmail();
		Notificator notificatorManager = new NotificatorManager();
		
		notificatorSMS.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);
		
		Client client = new Client("Popescu",null,null);
		notificatorSMS.notifica(client, "Mesaj fff important");

	}

}
