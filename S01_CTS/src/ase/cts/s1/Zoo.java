package ase.cts.s1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
      private Zookeeper zookeeper;
      private List<Animal> animale;
      
      public Zoo() {
    	  zookeeper=new Zookeeper();
    	  animale=new ArrayList<Animal>();
      }
      public void addAnimal(Animal a) {
    	  animale.add(a);
      }
      
      public void hranesteAnimale() {
    	  for(Animal animal:animale){
    		  try {
    			  zookeeper.feed(animal);
    		  }catch(MyException e) {
    			  System.out.println(e.getMessage());
    			  e.printStackTrace();
    		  }
    	  }
      }
}
