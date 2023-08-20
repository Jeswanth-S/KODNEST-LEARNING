package ifelse;

import java.util.Scanner;

public class ifelsedemo {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println(" Enter Your Age");
		int age=  scan.nextInt();
		if (age >=18)
		{
			System.out.println("You Are Eligible To Vote");
		}
		else
		{
			System.out.println(" You Are Not Eligible To Vote");
		}
	}

}
