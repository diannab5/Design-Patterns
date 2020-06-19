package patternFlyweight;

public class Examen implements IExamen {
	private int nrCredite;
	private String denumireMaterie;

	public Examen(int nrCredite, String denumireMaterie) {
		super();
		this.nrCredite = nrCredite;
		this.denumireMaterie = denumireMaterie;
	}
	

	@Override
	public String toString() {
		return "Examen [nrCredite=" + nrCredite + ", denumireMaterie=" + denumireMaterie + "]";
	}
	@Override
	public void sustineExamen(Student student) {
		System.out.println("Studentul"+student.toString()+"va sustine examenul la materia "+this.toString());
		
	}

}
