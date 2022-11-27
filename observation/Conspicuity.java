package observation;

public class Conspicuity {
	
	public boolean isTautology(boolean caseOne, boolean caseTwo, boolean caseThree, boolean caseFour)
	{
		if(caseOne && caseTwo && caseThree && caseFour) return true;
		else return false;
	}
	
	public boolean isContradiction(boolean caseOne, boolean caseTwo, boolean caseThree, boolean caseFour)
	{
		if(!caseOne && !caseTwo && !caseThree && !caseFour) return true;
		else return false;
	}

}
