package adapter;

import java.util.ArrayList;

public class CosCumparaturiNou implements IShoppingCart{

	String user;
	ArrayList<String> produse;
	int numarProduse;
	
	public CosCumparaturiNou() {
		produse=new ArrayList<String>();
	}
	@Override
	public void addProduct(String produs) {
		produse.add(produs);
		
	}

	@Override
	public void pay(int numarPrduse) {
		this.numarProduse=numarPrduse;
		if(numarPrduse<produse.size()) {
			for(int i=0;i<numarPrduse;i++) {
			System.out.println("Produsul "+produse.get(i)+" a fost platit!");
		}
		}
		else {
			System.out.println("Nu aveti atatea produse!");
		}
		
		
	}

}
