package strategyhotel;

public class ProgramMain {

	public static void main(String[] args) {
		Client client = new Client("Gigel", new VerificareAmericani());
		client.verificareDocumente();
		client.setModVerificare(new VerificareNonUE());
		client.verificareDocumente();

	}

}
