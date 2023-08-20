package grading;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter Your Score");
      int score= scan.nextInt();
      grade S1= new grade();
      S1.grading(score);
      scan.close();
      
	}

}
