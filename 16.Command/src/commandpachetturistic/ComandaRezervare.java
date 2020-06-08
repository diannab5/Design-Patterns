package commandpachetturistic;

public class ComandaRezervare implements Comanda {

	private PachetTuristic pachet;
	
	public ComandaRezervare(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}
	
	@Override
	public void executa() {
		pachet.rezerva();
	}
}

