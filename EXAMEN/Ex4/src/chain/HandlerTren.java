package chain;

public class HandlerTren extends Handler {

	@Override
	public void handler(int km) {
		if(km>15) {
			System.out.println("Calatorul merge cu trenul in afara orasului");
		}
	}

}
