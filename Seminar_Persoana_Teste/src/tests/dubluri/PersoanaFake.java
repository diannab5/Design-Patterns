package tests.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana{

	private int valoareReturnataDeGetVarsta;
	
	
	public void setValoareReturnataDeGetVarsta(int valoareReturnataDeGetVarsta) {
		this.valoareReturnataDeGetVarsta = valoareReturnataDeGetVarsta;
	}

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVarsta() {
		return valoareReturnataDeGetVarsta;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}

}
