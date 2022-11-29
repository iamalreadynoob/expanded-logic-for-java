package fundamentalMethods;

import situation.ExpandedLogicCase;
import situation.LogicCase;

public class Not {

	public boolean not(LogicCase situation)
	{
		if(situation.getFirst()) return false;
		else return true;
	}
	
	public boolean not(ExpandedLogicCase situation)
	{
		if(situation.getFirst() > situation.getReferencePoint()) return false;
		else return true;
	}
	
	public float specificNot(ExpandedLogicCase situation)
	{
		float difference = situation.getReferencePoint() - situation.getFirst();
		
		return situation.getReferencePoint() + difference;
	}
	
}
