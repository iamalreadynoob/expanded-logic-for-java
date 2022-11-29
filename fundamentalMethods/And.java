package fundamentalMethods;

import situation.ExpandedLogicCase;
import situation.LogicCase;

public class And {
	
	public boolean and(LogicCase situation)
	{
		
		if(situation.getFirst() && situation.getSecond()) return true;
		else return false;
		
	}
	
	public boolean and(ExpandedLogicCase situation)
	{
		if(situation.getFirst() > situation.getReferencePoint() && situation.getSecond() > situation.getReferencePoint()) return true;
		else return false;
	}
	
	public float specificAnd(ExpandedLogicCase situation)
	{
		float mean = (situation.getFirst() + situation.getSecond()) / 2;
		
		return mean;
		
	}

}
