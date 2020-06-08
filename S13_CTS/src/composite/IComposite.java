package composite;

public interface IComposite extends InterfataComunaNoduri {
      
	public void adaugaNod(InterfataComunaNoduri nod);
	public void stergeNod(InterfataComunaNoduri nod);
	
	public InterfataComunaNoduri getChild(int pozitie);
	
	
}
