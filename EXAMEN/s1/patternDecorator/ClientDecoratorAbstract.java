package cts.Balan.Diana.g1075.patternDecorator;

import java.util.Date;

import cts.Balan.Diana.g1075.patternComposite.IActiuniEmail;

public abstract class ClientDecoratorAbstract implements IActiuniEmail {
	 private IActiuniEmail client;

	public ClientDecoratorAbstract(IActiuniEmail client) {
		super();
		this.client = client;
	}

	@Override
	public void trimiteEmail(IActiuniEmail destinatie, String subject) {
		client.trimiteEmail(destinatie, subject);
		
	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
		client.creareEmailDraft(subject, prioritate);
		
	}

	@Override
	public String getEmail() {
		return client.getEmail();
	}

	@Override
	public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
		client.trimiteEveniment(dataEveniment, destinatie, subject);
		
	}

	@Override
	public String toString() {
		return "ClientDecoratorAbstract [client=" + client + "]";
	}
	
	 
	 
}
