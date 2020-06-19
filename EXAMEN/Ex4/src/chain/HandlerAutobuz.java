package chain;

public class HandlerAutobuz extends Handler {

	@Override
	public void handler(int km) {
		if(km<=5) {
			System.out.println("Calatorul merge cu autobozului");
		}else super.getUrmatorulHandler().handler(km);
	}

}
