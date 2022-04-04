package com.tectoro.array;

class AgeNotValid extends Exception{
	
	public AgeNotValid(String str) {
		super(str);
	}
	
}





public class UserExceptiones {
	
	
	public void validation(int age) throws AgeNotValid{
		if(age<18) {
		
	 throw new AgeNotValid("Age not valid");
	}else {
		System.out.println("Welcome to vote");
		
		
		
	}
	}
		
	public static void main(String args[]) {
		try {
			UserExceptiones exceptiones=new UserExceptiones();
			exceptiones.validation(13);
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
		}
	
	
	
	
	
	

}
