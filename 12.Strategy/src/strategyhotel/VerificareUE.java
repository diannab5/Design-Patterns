package strategyhotel;

public class VerificareUE implements ModVerificare {

	@Override
	public void verificaActe(String nume) {
		System.out.println("Am verificat viza cetateanului ue "+nume);
		
	}

}
