package patternState;

public class BarieraInteligenta implements ITrecereCaleFerata {

	private IStare stare;

	public BarieraInteligenta() {
		super();
		this.stare = new StareRidicata();
	}

	public IStare getStare() {
		return stare;
	}

	public void setStare(IStare stare) {
		this.stare = stare;
	}

	@Override
	public void pornesteAvertizareSonora(long durata) {
		System.out.println("A fost pornita avertizarea sonora pentru: " + durata + " secunde");
	}

	@Override
	public void ridicaBariera() {
		boolean vineTren = this.trenulATrecut();
		if(!vineTren) {
//			System.out.println("Bariera este ridicata");
//			System.out.println("Avertizarea sonora este oprita");
			this.stare = new StareRidicata();
			this.stare.doAction();
		}
	}

	@Override
	public void coboaraBariera() {
		boolean vineTren = this.seApropieTren();
		if(vineTren) {
			this.stare = new StareCoborata();
			this.pornesteAvertizareSonora(10);
			this.stare.doAction();
		}
	}

	@Override
	public boolean seApropieTren() {

		return true;
	}

	@Override
	public boolean trenulATrecut() {
		
		return false;
	}

}
