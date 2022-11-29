package derivedMethods;

import situation.ExpandedLogicCase;
import situation.LogicCase;

public class IfThen {

	public boolean ifThen(LogicCase situation)
	{
		
		if(situation.getFirst() == true && situation.getSecond() == false) return false;
		else return true;
		
	}
	
	public boolean ifThen(ExpandedLogicCase situation)
	{
		
		if(situation.getFirst() > situation.getReferencePoint() && situation.getSecond() < situation.getReferencePoint()) return false;
		else return true;
		
	}
	
	public float specificIfThen(ExpandedLogicCase situation)
	{
		float difference = situation.getReferencePoint() - situation.getFirst();
		float first = situation.getReferencePoint() + difference;
		
		double multiply = (double)(first * situation.getSecond());
		return (float)Math.pow(multiply, 0.5);
		
	}
	
}
