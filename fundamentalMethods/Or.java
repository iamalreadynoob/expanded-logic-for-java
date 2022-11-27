package fundamentalMethods;

import situation.LogicCase;

public class Or {
	
	public boolean or(LogicCase situation)
	{
		
		if(situation.getFirst() || situation.getSecond()) return true;
		else return false;
		
	}

}
