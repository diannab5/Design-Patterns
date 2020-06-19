package chain;

public class HandlerTramvai extends Handler {

	@Override
	public void handler(int km) {
		if(km>5&&km<=10) {
			System.out.println("Calatorul merge cu tramavaiul");
		}else super.getUrmatorulHandler().handler(km);
	}

}
