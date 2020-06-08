package clase;

public class Program {

	public static void main(String[] args) {
		CasaDeMarcat casaDeMarcat = CasaDeMarcat.getInstance();
		casaDeMarcat.incaseazaNota(10.14);
		System.out.println("Suma: " + casaDeMarcat.getSuma());
	
		CasaDeMarcat casaDeMarcat2=CasaDeMarcat.getInstance();
		casaDeMarcat2.incaseazaNota(100.12);
		System.out.println("Suma totala: " + casaDeMarcat.getSuma());
	
		
		CasaDeMarcatLazy casaDeMarcatLazy =CasaDeMarcatLazy.getInstance(150.12);
		casaDeMarcatLazy.incaseazaNota(100.12);
		System.out.println("Suma: " + casaDeMarcatLazy.getSuma());
		
		CasaDeMarcatLazy casaDeMarcatLazy2 =CasaDeMarcatLazy.getInstance(1000.12);
		casaDeMarcatLazy2.incaseazaNota(50.12);
		System.out.println("Suma: " + casaDeMarcatLazy.getSuma());
	}

}
