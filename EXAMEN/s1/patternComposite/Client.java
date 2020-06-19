package cts.Balan.Diana.g1075.patternComposite;

import java.util.Date;

public class Client extends NodEmail implements IActiuniEmail {

	public Client(String nume, String id, String email) {
		super(nume, id, email);

	}

	public void afisarePeNivel(int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
	}

	@Override
	public void trimiteEmail(IActiuniEmail destinatie, String subject) {
		System.out.println("Trimite email");

	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
		System.out.println("Creare email draft");

	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void trimiteEveniment(Date dataEveniment, IActiuniEmail destinatie, String subject) {
		System.out.println("Email nou cu subiectul :" + subject);

	}

	@Override
	public void adaugaEmail(NodEmail email) throws Exception {
		throw new Exception("Nu este implementata");

	}

	@Override
	public void stergeEmail(NodEmail email) throws Exception {
		throw new Exception("Nu este implementata");

	}

	@Override
	public NodEmail getNodEmail(int pozitie) throws Exception {
		throw new Exception("Nu este implementata");
	}

	@Override
	public void afisareStructura(int level) {
		afisarePeNivel(level);
		System.out.println("Afisare email pe nivelul " + level);
		afisarePeNivel(level);
		System.out.println("Nume " + nume + " email: " + email);

	}

}
