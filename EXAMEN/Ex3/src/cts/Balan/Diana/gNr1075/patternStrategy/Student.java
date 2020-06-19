package cts.Balan.Diana.gNr1075.patternStrategy;

import cts.Balan.Diana.gNr1075.patternStrategy.IStudent;

public class Student {
	private String nume;
	
	private IStudent modSustinereExamen;
	
	
	public Student(String nume, IStudent modSustinereExamen) {
		super();
		this.nume = nume;
		this.modSustinereExamen = modSustinereExamen;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setModSustinereExamen(IStudent modSustinereExamen) {
		this.modSustinereExamen = modSustinereExamen;
	}
	
	
	//METODA DIN INTERFATA
	public void sustineExamen(String disciplina) {
		this.modSustinereExamen.sustineExamen(disciplina);
	}
	
	
	
}
