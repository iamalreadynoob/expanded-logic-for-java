package situation;

public class LogicCase {
	
	Boolean first, second;
	
	public LogicCase(Boolean first, Boolean second)
	{
		this.first = first;
		this.second = second;
	}
	
	public boolean getFirst()
	{
		return first;
	}
	
	public boolean getSecond()
	{
		return second;
	}
	
	public void setFirst(boolean first)
	{
		this.first = first;
	}
	
	public void setSecond(boolean second)
	{
		this.second = second;
	}

}
