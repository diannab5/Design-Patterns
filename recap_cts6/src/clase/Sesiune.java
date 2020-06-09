package clase;

public class Sesiune {
	User user;
	ConexiuneBD conexiune;
	public Sesiune(User user, ConexiuneBD conexiune) {
		super();
		this.user = user;
		this.conexiune = conexiune;
	}
	
	CosCumparaturi genereazaCos() {
		return new CosCumparaturi(user.username);
	}
	
	public void deschideSesiune() {
		System.out.println("Creare sesiune");
	}
}
