package strategy;

public class PlataCash implements ModPlata{

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Suma de "+suma+" a fost platita cash");
		
	}

}
