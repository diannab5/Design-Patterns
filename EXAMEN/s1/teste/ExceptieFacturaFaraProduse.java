package cts.Balan.Diana.g1075.teste;

public class ExceptieFacturaFaraProduse extends IllegalArgumentException {
	private String mesaj;

	public ExceptieFacturaFaraProduse(String mesaj) {
		super();
		this.mesaj = mesaj;
	}
}
