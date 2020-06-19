package patternFlyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private static HashMap<Integer, IExamen> examene=new HashMap<Integer, IExamen>();
	public static IExamen getExamen(int nrCredite,String denumire) {
		IExamen examen=examene.get(nrCredite);
		if(examen==null) {
			examen=new Examen(nrCredite, denumire);
			examene.put(nrCredite,examen);
		}
		return examen;
	}
	public static int getSize() {
		return examene.size();
	}
}
