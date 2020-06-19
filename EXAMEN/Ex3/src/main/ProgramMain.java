package main;

import cts.Balan.Diana.gNr1075.patternStrategy.ExamenGrila;
import cts.Balan.Diana.gNr1075.patternStrategy.ExamenOral;
import cts.Balan.Diana.gNr1075.patternStrategy.ExamenPractic;
import cts.Balan.Diana.gNr1075.patternStrategy.Student;

public class ProgramMain {

	public static void main(String[] args) {

		// testare pattern2
		Student student = new Student("Alex", new ExamenGrila());
		student.setModSustinereExamen(new ExamenPractic());
		student.sustineExamen("Economie");

		student.setModSustinereExamen(new ExamenOral());
        student.sustineExamen("SO");
        
     

	}

}
