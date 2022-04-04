import java.util.Scanner;

class Appliant 
 {
	 int age;
	 void acceptInput()
	 {
		 Scanner sn=new Scanner(System.in);
		 System.out.println(" enter the age ");
		 int age=sn.nextInt();
	 }
     void verify() throws Exception
     {
    	 if(age<18)
    	 {
    		 UnderAgeException1 uae=new UnderAgeException1();
    		 System.out.println(uae.getMessage());
    		 throw uae;
    	 }
    	 else if(age>60)
    	 {
    		 OverAgeException oae=new OverAgeException();
    		 System.out.println(oae.getMessage());
    		 throw oae;
    	 }
    	 else
    	 {
    		 System.out.println("collect your dl");
    	 }
     }
}
