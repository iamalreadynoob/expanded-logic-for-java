package derivedMethods;

import situation.LogicCase;

public class Xor {
	
	public boolean xor(LogicCase situation)
	{
		if((situation.getFirst() == true && situation.getSecond() == true) ||
			(situation.getFirst() == false && situation.getSecond() == false)) return false;
		else return true;
	}

}
