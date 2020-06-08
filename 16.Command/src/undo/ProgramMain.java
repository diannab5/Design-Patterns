package undo;

public class ProgramMain {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetCazare(23);

		Operator operator=new Operator();
		
		Comanda vanzare=new ComandaVanzare(pachet);
		Comanda rezervare=new ComandaRezervare(pachet);

		operator.invoca(rezervare);
		operator.invoca(vanzare);
		
		operator.undo();
		operator.undo();

	}

}
