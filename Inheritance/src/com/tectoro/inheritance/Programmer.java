package com.tectoro.inheritance;

class programmer extends Employee
{
	int bonus=5000;
}
class Demo{
	
public static void main(String[] args)
{
programmer p=new programmer();
System.out.println(" salary is "+p.salary);
System.out.println(" salary is "+p.bonus);
}
}