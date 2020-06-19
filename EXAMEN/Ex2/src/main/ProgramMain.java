package main;

import patternState.BarieraInteligenta;
import proxy.Bariera;
import proxy.ProxyBariera;

public class ProgramMain {

	public static void main(String[] args) {
		BarieraInteligenta barieraInteligenta = new BarieraInteligenta();

		barieraInteligenta.coboaraBariera();
		System.out.println(barieraInteligenta.getStare());
		
		barieraInteligenta.ridicaBariera();
		System.out.println(barieraInteligenta.getStare());
		
		//patern2
		Bariera bariera=new Bariera(true);
		Bariera bariera2=new Bariera(false);
		ProxyBariera proxy=new ProxyBariera(bariera);
		proxy.verificareSuplimentara(bariera);
		proxy.verificareSuplimentara(bariera2);
		

	}

}
