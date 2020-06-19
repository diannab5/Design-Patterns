package patternState;

public class StareRidicata implements IStare{

	@Override
	public void doAction() {
		System.out.println("Se opreste avertizarea sonora");
		System.out.println("Bariera va fi ridicata");
	}
}
