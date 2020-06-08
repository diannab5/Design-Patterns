package clase;

import java.util.ArrayList;
import java.util.List;

//clasa composite
public class Departament implements IComposite {
	private String nume;
	private List<InterfataComunaNoduri> lista;
	
	
	public Departament(String nume) {
		super();
		this.nume = nume;
		lista=new ArrayList<>();
	}

	@Override
	public void descriere() {
		System.out.println("Departament "+this.nume+" contine subdepartamentele: ");
		for(InterfataComunaNoduri nod:lista) {
			nod.descriere();
		}
		
	}

	@Override
	public void adaugaNod(InterfataComunaNoduri nod) {
		lista.add(nod);
		
	}

	@Override
	public void stergereNod(InterfataComunaNoduri nod) {
		lista.remove(nod);
		
	}

	@Override
	public InterfataComunaNoduri getChild(int pozitie) {
		if(pozitie>0 && pozitie<lista.size()) {
			return lista.get(pozitie);
		}else {
			return null;
		}
	}

}
