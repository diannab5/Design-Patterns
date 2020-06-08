package clase;

public class ProgramMain {

	public static void main(String[] args) {
	  CasaDeMarcat casaDeMarcat=CasaDeMarcat.getInstance();
	  casaDeMarcat.incaseazaNota(400);
	  System.out.println("suma " + casaDeMarcat.getSuma());
	  
	  CasaDeMarcat casaDeMarcat1=CasaDeMarcat.getInstance();
	  casaDeMarcat1.incaseazaNota(230.4);
	  System.out.println("suma totala " + casaDeMarcat.getSuma());
	  
	  CasaDeMarcatLazy casaLazy=CasaDeMarcatLazy.getInstance(180.45);//asa ramane
	  casaLazy.incaseazaNota(100);
	  System.out.println("suma: " + casaLazy.getSuma());
	  
	  CasaDeMarcatLazy casaLazy1=CasaDeMarcatLazy.getInstance(400);
	  casaLazy.incaseazaNota(100);
	  System.out.println("suma: " + casaLazy1.getSuma());
	  

	}

}
