package prashanth;

public class Swapping 
{
	public static void main(String argd[])
	{
		B b = new B();
		b.swap();
		
		C c = new C();
		c.swap();				
	}
}
class A
{
	int a=10;
	int b=20;
	
}
class B extends A
{
	public void swap()
	{
		System.out.println("Before Swapping  "+a + " " + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping  "+a+ " "+b);
	}
}
class C extends A
{
	public void swap()
	{
		System.out.println("Before Swapping  "+ a +" "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping  "+a+ " "+b);
	}
}