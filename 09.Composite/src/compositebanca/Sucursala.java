package compositebanca;

public abstract class Sucursala {
	private String numeManager;
	public Sucursala(String numeManager) {
        this.numeManager = numeManager;
    }
    public String getNumeManager() {
        return numeManager;
    }
    public abstract void adaugaSucursala(Sucursala sucursala) throws Exception;
    public abstract void stergeSucursala(Sucursala sucursala) throws Exception;
    public abstract Sucursala getSucursala(int pozitie) throws Exception;

    public abstract void descriereSucursala();
}
