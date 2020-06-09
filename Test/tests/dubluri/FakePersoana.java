package tests.dubluri;

import clase.IPersoana;

public class FakePersoana implements IPersoana{
	
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
		// TODO Auto-generated method stub
		return valoareReturnataDeGetVarsta;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}

	

	
	
}
