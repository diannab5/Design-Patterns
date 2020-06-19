package chain;

public class HandlerMetrou extends Handler {

	@Override
	public void handler(int km) {
      if(km>10 && km<=15) {
    	  System.out.println("Calatorul foloseste metroul");
    	  
      }else  super.getUrmatorulHandler().handler(km);
	}

}
