package prashanth;

import java.util.Scanner;

public class Sujatha {
	public static void main(String args[])
    {
            System.out.println("Hi");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String value1");
            StringBuilder sb = new StringBuilder(sc.nextLine());
           System.out.println(sb);
          //  s=sc.next();
            int c=sb.length();
            System.out.println("Enter String value2");
            String sd=sc.nextLine();
            System.out.println(sb.replace(0, c, sd));

}
}
