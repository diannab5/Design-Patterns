package ase.cts.s1;

public class MyException extends Exception {
	private String message;
	private static final long serialVersionUID=6904441348313250716L;
	
	MyException(String message){
		this.setMessage(message);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message=message;
	}

}
