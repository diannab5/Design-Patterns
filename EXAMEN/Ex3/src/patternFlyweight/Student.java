package patternFlyweight;

public class Student {
	private String student;
	private int an;
	
	public Student(String student, int an) {
		super();
		this.student = student;
		this.an = an;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	@Override
	public String toString() {
		return "Student [student=" + student + ", an=" + an + "]";
	}
}
