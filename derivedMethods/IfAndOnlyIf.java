package derivedMethods;

import situation.ExpandedLogicCase;
import situation.LogicCase;

public class IfAndOnlyIf {

	public boolean ifAndOnlyIf(LogicCase situation)
	{
		
		if((situation.getFirst() == true && situation.getSecond() == true) || 
		   (situation.getFirst() == false && situation.getSecond() == false)) return true;
		else return false;
		
	}
	
	public boolean ifAndOnlyIf(ExpandedLogicCase situation)
	{
		if((situation.getFirst() > situation.getReferencePoint() && situation.getSecond() > situation.getReferencePoint()) || 
		   (situation.getFirst() < situation.getReferencePoint() && situation.getSecond() < situation.getReferencePoint()))
		{
			return true;
		}
		else return false;
	}
	
	public float specificIfAndOnlyIf(ExpandedLogicCase situation)
	{
		float difference = situation.getReferencePoint() - situation.getFirst();
		
		float notFirst = situation.getReferencePoint() + difference;
		
		difference = situation.getReferencePoint() - situation.getSecond();
		float notSecond = situation.getReferencePoint() + difference;
		
		double multiply = (double)(notFirst * situation.getSecond());
		
		float valueFirst = (float)Math.pow(multiply, 0.5);
		
		multiply = (double)(situation.getFirst() * notSecond);
		float valueSecond = (float)Math.pow(multiply, 0.5);
		
		return (valueFirst + valueSecond) / 2;
	}
	
}
