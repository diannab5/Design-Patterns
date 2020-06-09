package clase;

public class Facade {
	
	public static CosCumparaturi generareCos(Sesiune sesiune, ConexiuneBD conexiune) {
		conexiune.deschideConexiune();
		sesiune.deschideSesiune();
		return sesiune.genereazaCos();
	}

}
