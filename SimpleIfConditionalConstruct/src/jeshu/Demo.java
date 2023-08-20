package jeshu;

	import java.util.Scanner;
	public class Demo {

	

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the marks ");
			int marks= scan.nextInt();
			System.out.println("Welcome To Kodnest");
			simple(marks);

		}
	       public static void simple(int marks)
	       {
	    	   if (marks>= 90)
	    	   {
	    		   System.out.println("Welcomr To Tech Club");
	    	   }
	       }
	}