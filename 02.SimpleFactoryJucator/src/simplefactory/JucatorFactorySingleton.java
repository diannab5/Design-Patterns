package simplefactory;

public class JucatorFactorySingleton {
	private static JucatorFactorySingleton instanta=null;

	private JucatorFactorySingleton() {
		
	}
	//lazy
	public static synchronized JucatorFactorySingleton instanta() {
		if(instanta==null) {
			instanta=new JucatorFactorySingleton();
		}
		return instanta;
	}
	public Jucator creareJucator(TipJucator tip,String nume) {
  	  switch(tip) {
  	  case PORTAR:{
  		  Portar portar=new Portar(nume);
  		  return portar;
  	  
  	  }
  	  case FUNDAS:{
  		  return new Fundas(nume);
  	  }
  	  case ATACANT:{
  		  return new Atacant(nume);
  	  }
  	  default:return null;
    }
}
	}
