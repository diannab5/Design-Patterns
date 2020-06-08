package clase;

public class ProgramMain {

	public static void main(String[] args) {
  Client client=new Client("popescu");
  
  client.setModPlata(new PlataCard());
	client.plateste(124.50f);
	client.setModPlata(new PlataCash());
	client.plateste(15);
	}

}
