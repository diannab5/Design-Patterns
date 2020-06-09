package clase;

import java.util.ArrayList;

import state.IAfisareCos;
import state.StareCuProduse;
import state.StareFaraProduse;
import state.StareFoarteMulteProduse;

public class CosCumparaturi implements ICosCumparaturi {
	String user;
	ArrayList<String> produse;
	IAfisareCos stare;
	public CosCumparaturi(String user) {
		super();
		this.user = user;
		this.produse=new ArrayList<String>();
	}
	
	public void setStare(IAfisareCos stare) {
		this.stare = stare;
		
	}

	@Override
	public void adaugaProdus(String produs) {
		produse.add(produs);
		if(produse.size()<10) {
			this.stare=new StareCuProduse();
			this.stare.afisareMesajCos();
		}
		else if(produse.size()>10) {
			this.stare=new StareFoarteMulteProduse();
			this.stare.afisareMesajCos();
			
		}
		
	}
	@Override
	public void plata() {
		for(String produs:produse) {
		System.out.println("Plata pentru produsul "+produs);	
		}
		this.stare=new StareFaraProduse();
		this.stare.afisareMesajCos();
		
		
	}
	
	public void afisareMesajCosCreeat() {
		System.out.println("A fost creat cosul pentru user-ul "+this.user);
		
	}
	
	
}
