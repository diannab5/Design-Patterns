package strategyhotel;

public class VerificareNonUE implements ModVerificare {

	@Override
	public void verificaActe(String nume) {
		System.out.println("Am verificat viza cetateanului nonUE "+nume);
		
	}

}
