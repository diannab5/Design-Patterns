package cts.Balan.Diana.g1075.patternDecorator;

import cts.Balan.Diana.g1075.patternComposite.IActiuniEmail;

public class ClientDecoratorFunctie extends ClientDecorator{

	public ClientDecoratorFunctie(IActiuniEmail client,String oraInregistrata) {
		super(client,oraInregistrata);
		
	}
	@Override
    public void creareEmailDraft(String subject, int prioritate) {
        System.out.println("Functie modificata");
    }

}
