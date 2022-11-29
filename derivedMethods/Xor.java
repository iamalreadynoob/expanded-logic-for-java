package derivedMethods;

import situation.ExpandedLogicCase;
import situation.LogicCase;

public class Xor {
	
	public boolean xor(LogicCase situation)
	{
		if((situation.getFirst() == true && situation.getSecond() == true) ||
			(situation.getFirst() == false && situation.getSecond() == false)) return false;
		else return true;
	}
	
	public boolean xor(ExpandedLogicCase situation)
	{
		if((situation.getFirst() > situation.getReferencePoint() && situation.getSecond() > situation.getReferencePoint()) || 
		  (situation.getFirst() < situation.getReferencePoint() && situation.getSecond() < situation.getReferencePoint()))
		{
			return false;
		}
		else return true;
		
	}
	
	public float specificXor(ExpandedLogicCase situation)
	{
		float first = (situation.getFirst() + situation.getSecond()) / 2;
		float difference = situation.getReferencePoint() - first;
		first += difference;
		
		double multiply = (double)(situation.getFirst() * situation.getSecond());
		float second = (float)Math.pow(multiply, 0.5);
		
		return (first + second) / 2;
	}

}
