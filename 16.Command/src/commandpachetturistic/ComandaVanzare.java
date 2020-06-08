package commandpachetturistic;

public class ComandaVanzare  implements Comanda{
private PachetTuristic pachet;
	
	public ComandaVanzare(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}
	@Override
	public void executa() {
		pachet.vanzare();
		
	}

}
