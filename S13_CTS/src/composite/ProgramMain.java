package composite;

public class ProgramMain {

	public static void main(String[] args) {
       Departament departament1=new Departament("Financiar");
       Departament departament2=new Departament("HR");

       Sectie sectie1=new Sectie("Contabilitate");
       Sectie sectie2=new Sectie("Salarii");

	  departament1.adaugaNod(departament2);
	  departament1.adaugaNod(sectie1);
	  departament2.adaugaNod(sectie2);
	  
	  departament2.descriere();
	  departament1.descriere();
	  
	  InterfataComunaNoduri interfataComunaNoduri=departament1.getChild(0);
	 ((IComposite) interfataComunaNoduri).adaugaNod(sectie1);
	
	}

}
