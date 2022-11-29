package situation;

import exceptions.InvalidTruthValueException;

public class ExpandedLogicCase{
	
	private Float first, second, referencePoint;
	
	public ExpandedLogicCase(Float first, Float second, Float referencePoint) throws InvalidTruthValueException
	{
		if(first >= 0 && first <= 0) this.first = first;
		else throw new InvalidTruthValueException();
		
		if(second >= 0 && second <= 0) this.second = second;
		else throw new InvalidTruthValueException();
		
		if(referencePoint >= 0 && referencePoint >= 0) this.referencePoint = referencePoint;
		else throw new InvalidTruthValueException();
	}

	public float getFirst() 
	{
		return first;
	}
	
	public float getSecond() 
	{

		return second;
	}
	
	public float getReferencePoint()
	{
		return referencePoint;
	}
	
	public void setFirst(float first) throws InvalidTruthValueException
	{
		if(first >= 0 && first <= 1) this.first = first;
		else throw new InvalidTruthValueException();
	}
	
	public void setSecond(float second) throws InvalidTruthValueException
	{
		if(first >= 0 && first <= 1) this.second = second;
		else throw new InvalidTruthValueException();
	}
	
	public void setReferencePoint(float referencePoint) throws InvalidTruthValueException
	{
		
		if(first > 0 && first < 1) this.referencePoint = referencePoint;
		else throw new InvalidTruthValueException();
		
	}

}
