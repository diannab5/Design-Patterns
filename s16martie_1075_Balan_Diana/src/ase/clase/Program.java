package ase.clase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Matematica m = new Matematica();
   int rezultat=m.suma(5, 8);
   if(rezultat==13) {
	   System.out.println("Corect");
	   
   }
   else
   {
	   System.out.println("Incorect");
   }
   
   double rezultatRaport=m.raport(8, 2);
   if(rezultatRaport==4) {
	   System.out.println("Metoda este corecta");
	   
   }
   else
   {
	   System.out.println("Metoda nu este corecta");
   }
	}
	

}
