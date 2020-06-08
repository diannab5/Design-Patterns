package simplefactory;

public class JucatorFactory {
      public Jucator creareJucator(TipJucator tip,String nume) {
    	  switch(tip) {
    	  case PORTAR:{
    		  return new Portar(nume);
    	  
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