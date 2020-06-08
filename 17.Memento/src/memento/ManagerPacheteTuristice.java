package memento;

import java.util.ArrayList;
import java.util.List;

//gestioneaza o lista de mementopacheturistic
public class ManagerPacheteTuristice {
private List<MementoPachetTuristic> listaPachete = new ArrayList<MementoPachetTuristic>();
	
	public void adaugaMemento(MementoPachetTuristic memento) {
		listaPachete.add(memento);
	}
	
	public MementoPachetTuristic getMemento(int index) {
		return listaPachete.get(index);
	}
	
	//ultimul care a fost creat
	public MementoPachetTuristic getLastMemento() throws Exception{
		if(listaPachete.size()!=0){
			MementoPachetTuristic memento = listaPachete.get(listaPachete.size()-1);//extrag ultima stare
			listaPachete.remove(listaPachete.size()-1);//sterg ultima stare din istoric
			return memento;			
		} else {
			throw new Exception("Nu exista stari salvate");
		}
	}
}
