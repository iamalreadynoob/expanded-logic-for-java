package derivedMethods;

import situation.LogicCase;

public class IfThen {

	public boolean ifThen(LogicCase situation)
	{
		
		if(situation.getFirst() == true && situation.getSecond() == false) return false;
		else return true;
		
	}
	
}
