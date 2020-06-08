package program;

import ase.cts.s1.Cat;
import ase.cts.s1.Giraffe;
import ase.cts.s1.Monkey;
import ase.cts.s1.Pizza;
import ase.cts.s1.Zebra;
import ase.cts.s1.Zoo;

public class Program {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		zoo.addAnimal(new Giraffe("Girafa_1","frunze"));
        zoo.addAnimal(new Giraffe("Girafa_2","frunze"));
        zoo.addAnimal(new Zebra("Zebra_1","iarba"));
	    zoo.addAnimal(new Zebra("Zebra_2","iarba"));
	    zoo.addAnimal(new Cat("Cat 1","mancare de pisica"));
	    zoo.addAnimal(new Monkey("Maimuta_1",new Pizza(22,"rosii")));
	    zoo.hranesteAnimale();
	}

}
