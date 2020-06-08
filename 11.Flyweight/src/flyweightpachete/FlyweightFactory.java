package flyweightpachete;

import java.util.HashMap;

public class FlyweightFactory {
	//cheia e codul 
    private HashMap<Integer,IPachetTuristic> pacheteTuristice;

	public FlyweightFactory() {
		pacheteTuristice=new HashMap<Integer,IPachetTuristic>();
	}
    
    public int getNrPachete() {
    	return pacheteTuristice.size();
    }
    
    public IPachetTuristic getPachetTuristic(int codPachet) {
    	IPachetTuristic pachet=pacheteTuristice.get(codPachet);
    	if(pachet==null) {
    		pachet = new PachetTuristic(codPachet, "Hotel", "OrasTuristic", true);
			pacheteTuristice.put(codPachet, pachet);
    	}
    	return pachet;
    }
}
