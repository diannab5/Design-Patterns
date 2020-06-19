package cts.Balan.Diana.g1075.patternComposite;

import java.util.ArrayList;
import java.util.List;

public class GrupEmail extends NodEmail {
	private List<NodEmail> emails;

	public GrupEmail(String nume, String id, String email) {
		super(nume, id, email);
		this.emails = new ArrayList<>();
	}

	@Override
	public void adaugaEmail(NodEmail email) {
		this.emails.add(email);
	}

	@Override
	public void stergeEmail(NodEmail email) {
		this.emails.remove(email);

	}

	@Override
	public NodEmail getNodEmail(int pozitie) {
		return emails.get(pozitie);
	}

	public void afisarePeNivel(int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
	}

	@Override
	public void afisareStructura(int level) throws Exception {
		afisarePeNivel(level);
		System.out.println("Afisare grup email pe nivelul " + level);
		for (NodEmail nodEmail : emails) {
			nodEmail.afisareStructura(level + 1);
		}

	}

}
