package composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IComposite {
   private String nume;
   private List<InterfataComunaNoduri> noduri;
   
   
	public Departament(String nume) {
	super();
	this.nume = nume;
	noduri=new ArrayList<InterfataComunaNoduri>();
}

	@Override
	public void descriere() {
		System.out.println("Departamentul: "+this.nume + " contine subdepartamentele: ");
		for(InterfataComunaNoduri nod:noduri) {
			nod.descriere();
		}
	}

	@Override
	public void adaugaNod(InterfataComunaNoduri nod) {
		noduri.add(nod);
	}

	@Override
	public void stergeNod(InterfataComunaNoduri nod) {
		noduri.remove(nod);
	}

	@Override
	public InterfataComunaNoduri getChild(int pozitie) {
		if(pozitie>=0 && pozitie<noduri.size()) {
			return noduri.get(pozitie);
		}else {
			return null;
		}
	}

}
