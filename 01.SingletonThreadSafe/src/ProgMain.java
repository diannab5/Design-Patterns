
public class ProgMain {

	public static void main(String[] args) {
      Agentie agentie=Agentie.getInstanta("Disney",2000,10);
      Agentie agentie1=Agentie.getInstanta("Disney",2000,10);
      agentie.setCapital(250000);
      System.out.println(agentie.toString());
      System.out.println(agentie1.toString());
      System.out.println(Agentie.getInstanta().toString());
	}

}
