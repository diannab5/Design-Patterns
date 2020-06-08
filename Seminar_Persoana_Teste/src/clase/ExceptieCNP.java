package clase;

//cu IllegalArgument nu mai trebuie sa te duci in celelalte clase si sa modifici
public class ExceptieCNP extends IllegalArgumentException {
   public String mesaj;

   
public ExceptieCNP(String mesaj) {
	super();
	this.mesaj = mesaj;
}


public String getMesaj() {
	return mesaj;
}
   
   
}
