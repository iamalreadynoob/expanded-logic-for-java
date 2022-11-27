package fundamentalMethods;

import situation.LogicCase;

public class Not {

	public boolean not(LogicCase situation)
	{
		if(situation.getFirst()) return false;
		else return true;
	}
	
}
