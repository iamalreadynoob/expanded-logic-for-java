package fundamentalMethods;

import situation.LogicCase;

public class And {
	
	public boolean and(LogicCase situation)
	{
		
		if(situation.getFirst() && situation.getSecond()) return true;
		else return false;
		
	}

}
