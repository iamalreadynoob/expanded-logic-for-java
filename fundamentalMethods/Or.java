package fundamentalMethods;

import situation.ExpandedLogicCase;
import situation.LogicCase;

public class Or {
	
	public boolean or(LogicCase situation)
	{
		
		if(situation.getFirst() || situation.getSecond()) return true;
		else return false;
		
	}
	
	public boolean or(ExpandedLogicCase situation)
	{
		if(situation.getFirst() < situation.getReferencePoint() && situation.getSecond() < situation.getReferencePoint()) return false;
		else return true;
	}
	
	public float specificOr(ExpandedLogicCase situation)
	{
		double multiply = (double)(situation.getFirst() * situation.getSecond());
		return (float)Math.pow(multiply, 0.5);
		
		
	}

}
