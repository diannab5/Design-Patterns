package compositebanca;

public class ProgramMain {

	public static void main(String[] args) {
		Agentie agentie = new Agentie("BRD");
        Filiala filiala = new Filiala("Bucuresti");
        Agentie agentie2 = new Agentie("Transilvania");
        Filiala filiala2 = new Filiala("Timisoara");

        System.out.println("Descriere 1");
        agentie.adaugaSucursala(filiala);
        agentie.adaugaSucursala(agentie2);
        agentie2.adaugaSucursala(filiala2);

        agentie.descriereSucursala();

        System.out.println("Descriere2");
        agentie2.stergeSucursala(filiala2);
        agentie.adaugaSucursala(filiala2);

        agentie.descriereSucursala();
	}

}
