package proxyhotel;

public class ProgramMain {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(2,3);
		//rezervare.anulareRezervare();
		ProxyRezervare proxyRezervare=new ProxyRezervare(rezervare);
		proxyRezervare.anulareRezervare();
	}

}
