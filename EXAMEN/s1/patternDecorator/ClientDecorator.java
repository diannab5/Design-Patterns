package cts.Balan.Diana.g1075.patternDecorator;

import cts.Balan.Diana.g1075.patternComposite.IActiuniEmail;

public class ClientDecorator extends ClientDecoratorAbstract {
	 private String oraInregistrata;
	public ClientDecorator(IActiuniEmail client,String oraInregistrata) {
		super(client);
		this.oraInregistrata = oraInregistrata;
	}
	@Override
	public void trimiteEmail(IActiuniEmail destinatie, String subject) {
		super.trimiteEmail(destinatie, subject);
		System.out.println("Ora inregistrata "+this.oraInregistrata);
	}
	@Override
	public String toString() {
		return "ClientDecorator [oraInregistrata=" + oraInregistrata + "]";
	}
	

}
