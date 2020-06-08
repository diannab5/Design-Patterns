package factory;

public class Portar implements Jucator {
private String name;
	
	public Portar(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getNamePlayer() {
		return getName();
	}

	@Override
	public String getPosition() {
		return "Portar";
	}
}
