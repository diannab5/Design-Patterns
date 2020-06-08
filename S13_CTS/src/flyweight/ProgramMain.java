package flyweight;

public class ProgramMain {

	public static void main(String[] args) {
      FlyweightFactory fabrica=new FlyweightFactory();
      IPacient p1=fabrica.getPacient("Popescu", "0758688720", "Str.fizicienlor");
      IPacient p2=fabrica.getPacient("Iancu", "0758688720", "Str.fizicienlor");
      IPacient p3=fabrica.getPacient("Popescu", "0758688720", "Adresa noua");

      Spitalizare s1=new Spitalizare(2,19,10);
      Spitalizare s2=new Spitalizare(3,10,12);

      p1.printarePacient(s1);
      p3.printarePacient(s2);
      
      p2.printarePacient(s2);
      
      
      System.out.println(fabrica.getNrPacienti());
	}

}
