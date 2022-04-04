package com.tectoro.bank;



public class Result 
{
	/*
	 * private static final String TYPE_SCROLL_SENSITIVE = null; static String
	 * url="jdbc:postgresql://localhost:5432/postgres?currentSchema="; static String
	 * un="root"; static String pwd="root";
	 */

	public static void main(String[] args) throws Exception
	{
    
		/*
		 * connection con=null; Statement stmt1=null; ResultSet res=null;
		 */

		/*
		 * try {
		 * 
		 * Class.forName("org.postgresql.Driver"); Connection con=
		 * DriverManager.getConnection(url,un,pwd);
		 * System.out.println("connection established");
		 * stmt1=con.createStatement(Result.TYPE_SCROLL_SENSITIVE,0); String
		 * query="select * from emp"; Result res=stmt1.executeQuery(query);
		 * System.out.println("Query executed");
		 * 
		 * while (res.next()==true) {
		 * System.out.println(res.getInt(1)+""+res.getString(2)+""+res.getString(3)+""+
		 * res.getInt(4)); } } catch(ClassNotFoundException e) { e.printStackTrace(); }
		 */
	}


	private int getString(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	private boolean next() {
		// TODO Auto-generated method stub
		return false;
	}


	private int getInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
