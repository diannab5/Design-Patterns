package strategy;

public class ProgramMain {

	public static void main(String[] args) {
		Client client = new Client("Popescu");
		client.setModPlata(new PlataCard());
		client.plateste(20);
		client.setModPlata(new PlataCash());
		client.plateste(50);

	}

}
