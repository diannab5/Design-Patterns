package tests.dubluri;

import acs.ase.clase.IPersoana;

public class FakePersoana implements IPersoana {
 private int valoareReturnataGetVarsta;
	
 public void setValoareReturnataGetVarsta(int valoareReturnataGetVarsta) {
		this.valoareReturnataGetVarsta = valoareReturnataGetVarsta;
	}
 @Override
	public String getSex() {
		return null;
	}

	@Override
	public int getVarsta() {
		return valoareReturnataGetVarsta;
	}

	@Override
	public boolean checkCNP() {
		return false;
	}

	



}
