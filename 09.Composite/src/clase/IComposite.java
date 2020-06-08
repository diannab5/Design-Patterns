package clase;

//metode specifice nodurilor composite
public interface IComposite extends InterfataComunaNoduri{
   public void adaugaNod(InterfataComunaNoduri nod); //poate sa fie si sectie si dep
   public void stergereNod(InterfataComunaNoduri nod);
   public InterfataComunaNoduri getChild(int pozitie);
}
