
class UnderAgeException1 extends Exception
{
	
	public String getMessage()
	{
		return "you are too young";
	}
}
class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "you are too old";
	}
}