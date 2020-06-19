package main;

import cts.Balan.Diana.g1075.patternComposite.Client;
import cts.Balan.Diana.g1075.patternComposite.GrupEmail;
import cts.Balan.Diana.g1075.patternComposite.IActiuniEmail;
import cts.Balan.Diana.g1075.patternComposite.NodEmail;
import cts.Balan.Diana.g1075.patternDecorator.ClientDecorator;
import cts.Balan.Diana.g1075.patternDecorator.ClientDecoratorAbstract;
import cts.Balan.Diana.g1075.patternDecorator.ClientDecoratorFunctie;

public class ProgramMain {

	public static void main(String[] args) throws Exception {
		    NodEmail nodEmail1 = new Client("Alex","1","alex@yahoo.com");
	        NodEmail nodEmail2 = new Client("Vlad","2","vlad@yahoo.com");
	        NodEmail nodEmail3 = new Client("Raluca","3","raluca@yahoo.com");
	        NodEmail nodEmail4 = new Client("Ioana","4","ioana@yahoo.com");
	        NodEmail nodEmail5 = new Client("Maria","5","maria@yahoo.com");
	        NodEmail nodEmail6 = new Client("Gigel","6","gigel@yahoo.com");

	        GrupEmail grupEmail = new GrupEmail("GrupI","G1","grup1@yahoo.com");
	        NodEmail grupEmail2 = new GrupEmail("GrupII","G2","grup2@yahoo.com");
	        NodEmail grupEmail3 = new GrupEmail("GrupIII","G3","grup3@yahoo.com");

	        grupEmail.adaugaEmail(nodEmail1);
	        grupEmail.adaugaEmail(grupEmail2);
	        grupEmail2.adaugaEmail(nodEmail2);
	        grupEmail2.adaugaEmail(nodEmail3);
	        grupEmail2.adaugaEmail(nodEmail4);
	        grupEmail2.adaugaEmail(grupEmail3);
	        grupEmail3.adaugaEmail(nodEmail5);
	        grupEmail3.adaugaEmail(nodEmail6);
	        grupEmail.afisareStructura(0);

	        IActiuniEmail client = new Client("Alex","1","alex@yahoo.com");
	        ClientDecoratorAbstract clientDecoratorAbstract = new ClientDecorator(client,"10:30AM");
	        ClientDecoratorFunctie clientDecoratorFunctie = new ClientDecoratorFunctie(clientDecoratorAbstract,"10:30PM");
	        
	}

}
