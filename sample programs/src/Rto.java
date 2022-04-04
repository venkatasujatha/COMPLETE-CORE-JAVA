import java.util.*;
class Rto 
{
  void initiate() 
  {
	  Appliant a=new Appliant();
	  try
	  {
		  a.acceptInput();
		  a.verify();
	  }
	  catch(Exception e)
	  {
		  System.out.println("you are not eligible for license");
	  }
  }
}
