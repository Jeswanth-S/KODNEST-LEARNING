package nestedifdemo;

import java.util.Scanner;

public class nestediddemo {
public static void main(String[] args)
{
	Scanner scan= new Scanner(System.in);
	System.out.println(" Enter marks");
	int marks= scan.nextInt();
	if (marks >=35)
	{
		System.out.println("PASS");
		if ( marks>=75)
		{
			System.out.println("DISTINCTION");
		}
	}
}
}
