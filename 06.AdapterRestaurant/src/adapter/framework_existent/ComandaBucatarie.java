package adapter.framework_existent;

public class ComandaBucatarie implements IComandaBucatarie {
      private float pretComanda;

      public ComandaBucatarie() {
    	  
      }
	public ComandaBucatarie(float pretComanda) {
		super();
		this.pretComanda = pretComanda;
	}
      
      public void solicitareBon() {
    	  System.out.println("Clientul are de plata "+ this.pretComanda);
      }
}
