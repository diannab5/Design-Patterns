package strategyhotel;

public class VerificareAmericani implements ModVerificare {

	@Override
	public void verificaActe(String nume) {
		System.out.println("Am verificat viza cetateanului american "+nume);
		
	}

}
