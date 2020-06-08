package ase.cts.s1;

public class Zookeeper {
	public void feed(Animal a) throws MyException{
		if(a==null) {
			throw new MyException("Nu avem un animal");
		}else {
				System.out.println("Hranim animalul: "+a.getName()+" cu " + a.getTipHrana());
				
			}
		}
	}


