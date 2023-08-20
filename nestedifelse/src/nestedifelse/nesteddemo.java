package nestedifelse;
import java.util.Scanner;
public class nesteddemo {
	 public static void main(String[] args)
	 {
		 try (Scanner scan = new Scanner(System.in)) {
			System.out.println(" Enter Your Age And Weight");
			 int age = scan.nextInt();
			 int weight = scan.nextInt();
			 if (age >= 18 && age <=65)
			 {
				 if(weight>=50)
				 {
					 System.out.println("You are eligible to donate blood");
				 }
				 else
				 {
					 System.out.println("You are not eligible to donate blood");
				 }
			 }
			else 
			{
				 System.out.println(" Age must be in between 18-65");
			}
		}
         
	}
	
}

