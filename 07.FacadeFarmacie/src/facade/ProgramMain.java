package facade;

public class ProgramMain {

	public static void main(String[] args) {
Reteta reteta=new Reteta(120,75);
System.out.println(FacadeReteta.verificareReteta(reteta));
	}

}
