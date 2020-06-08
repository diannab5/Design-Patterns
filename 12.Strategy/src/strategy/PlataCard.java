package strategy;

public class PlataCard implements ModPlata {

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Suma de "+suma+" a fost platita cu cardul");
		
	}

}
