package derivedMethods;

import situation.LogicCase;

public class IfAndOnlyIf {

	public boolean ifAndOnlyIf(LogicCase situation)
	{
		
		if((situation.getFirst() == true && situation.getSecond() == true) || 
		   (situation.getFirst() == false && situation.getSecond() == false)) return true;
		else return false;
		
	}
	
}
