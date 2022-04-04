package inheretance;

public class animal
{
  public void eat() {
	  System.out.println(" eating... ");
  }
  protected void dance()
	{
		System.out.println("dancing");
	}
}
class dog1 extends animal
{
	public void move() {
		System.out.println(" moving.... ");
	}
	
}