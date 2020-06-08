package templatepachetturistic;

public class ProgramMain {

	public static void main(String[] args) {
		PachetTuristic pachetCazare=new PachetCazare(5);
		pachetCazare.vindePachet();
		
		PachetTuristic pachetCT=new PachetCazareTransport(23);
		pachetCT.vindePachet();

	}

}
