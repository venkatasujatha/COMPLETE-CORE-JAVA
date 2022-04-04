package com.tectoro.array;

public class AgeInfo extends UserExceptiones {
	
	public void naresh(int a) throws AgeNotValid{
		if(a<18) {
			throw new AgeNotValid("Its not correct");
		}
	}
	
	public static void main(String args[]) {
		try {
			AgeInfo info=new AgeInfo();
			info.naresh(12);
		} catch (AgeNotValid e) {
			System.out.println(e);
		}
	}

}
