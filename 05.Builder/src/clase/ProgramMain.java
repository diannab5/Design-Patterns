package clase;

import builder_v2.BuilderRezervare;

public class ProgramMain {

	public static void main(String[] args) {
    Rezervare rezervare=new Rezervare(true,true,false,false,"clasica");
    System.out.println(rezervare.toString());
    
    Rezervare r2=new Rezervare();
    r2.setAsezareLaGeam(true);
    r2.setDecorareaMesei(true);
    r2.setGenMuzica("rock");
    System.out.println(r2.toString());
    
 // varianta 1
 		BuilderRezervare builderRezervare_v1 = new BuilderRezervare();
 		builderRezervare_v1.setAsezareLaGeam(true).setDecorareaMesei(false).setMuzicaPersonalizata(true).setGenMuzica("protomanele").setScauneErgonomice(true);
 		Rezervare rezervare1 = builderRezervare_v1.build();
 		System.out.println(rezervare1.toString());
 		
 		// varianta 2
 		builder_v2.BuilderRezervare builderRezervare_v2 = new builder_v2.BuilderRezervare();
 		builderRezervare_v2.setAsezareLaGeam(false).setDecorareaMesei(true).setMuzicaPersonalizata(true).setGenMuzica("tehno").setScauneErgonomice(true);
 		System.out.println(builderRezervare_v2.build().toString());
    
	}

}
