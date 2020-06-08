package undo;

import java.util.Stack;

public class Operator {
Stack<Comanda> stivaComenzi=new Stack<>();
	
	public void invoca(Comanda comanda){
		comanda.executa();
		stivaComenzi.push(comanda);
	}
	
	public void undo(){
		if(!stivaComenzi.isEmpty()){
			stivaComenzi.pop().unexecute();
		}
	}
}
