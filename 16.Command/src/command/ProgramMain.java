package command;

public class ProgramMain {

	public static void main(String[] args) {
     Medic medic = new Medic("Popescu Irina","dermatologie");
		
		Operator operator = new Operator();
		
		operator.invoca(new ComandaInternare(medic, "Marisa"));
		operator.invoca(new ComandaTratare(medic, "Lucian"));
		
		operator.executaComanda();
		operator.invoca(new ComandaInternare(medic, "Mirabela"));
		
		operator.executaComenzi();

	}

}
