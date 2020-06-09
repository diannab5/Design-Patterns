package testare;

import java.util.ArrayList;

public class Produs {
	String denumire;	//minim 3 caractere, maxim 30
	int stoc;		//valori intre [1, 1000]
	float pret;		//valori pozitive
	ArrayList<Integer> vanzariZilnice;
	
	public Produs(String denumire, int stoc, float pret) {
		this.denumire = denumire;
		this.stoc = stoc;
		this.pret = pret;
	}

	public float getPret() {
		return pret;
	}
	
	public String getDenumire() {
		return this.denumire;
	}

	
	public int getStoc() {
		return stoc;
	}

	public void setPret(float pret) {
		if(pret>0)
		{this.pret = pret;}
		else throw new ExceptiePretZeroSauNegativ("Pretul trebuie sa fie mai mare decat 0!");
	}

	public void setVanzariZilnice(ArrayList<Integer> vanzariZilnice) {
		this.vanzariZilnice = vanzariZilnice;
	}


	//determina numarul maxim de produse vandute
	public int getVanzareMaxima() {
		if(vanzariZilnice!=null) {
			int maxim  = 0;
		for(int valoare : vanzariZilnice)
			{if(valoare > maxim) {
				maxim=valoare;
				}
			}
		return maxim;
		}
		else {
			throw new MaxException("Nu exista elemente in lista!");
		}
	}
	
	//actualizeaza stocul prin comanda furnizor - la stocul existent se adauga cantitatea comandata
	//daca furnizorul nu are produse pe stoc atunci se arunca exceptie de tip UnsupportedOperationException
	
	public void comandaFurnizor(int cantitate, IFurnizor furnizor) {
		if(furnizor.verificaStocFurnizor(cantitate))
			this.stoc = this.getStoc() + cantitate;
		else
			throw new UnsupportedOperationException();
			
	}
}
