package clase;

import adapter.AdapterCosCumparaturi;

public class Program {

	public static void main(String[] args) {
		//simulare creare cos
				User user = new User("Gigel");
				ConexiuneBD conexiune = new ConexiuneBD("127.0.0.1");
				Sesiune sesiune = new Sesiune(user, conexiune);
				conexiune.deschideConexiune();
				sesiune.deschideSesiune();
				
				CosCumparaturi cos = sesiune.genereazaCos();
				
		//creare cos cu Facade
				CosCumparaturi cosFacade=Facade.generareCos(sesiune, conexiune);
				cosFacade.afisareMesajCosCreeat();
		//adapter
				AdapterCosCumparaturi adapter=new AdapterCosCumparaturi();
				adapter.addProduct("Mere");
				adapter.addProduct("Pere");
				adapter.pay(3);

		//State
				cos.adaugaProdus("Mere");
				cos.adaugaProdus("Apa");
				cos.plata();
	}

}
