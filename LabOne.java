
import java.util.Scanner;

/**
 * @author	Art Bustillos
 *			Date: 9/24/2013
 *			Week 5 Lab 1 
 */
public class LabOne
{

	public static void main( String[] args ){
		Scanner inp = new Scanner( System.in );
		int UNumber;
		int CNumber;
		
		CNumber = 0 + (int)(Math.random()*10);
		System.out.println ("Guess a number between 0 and 10");
		UNumber = inp.nextInt();
		System.out.printf("The number was %s\n", CNumber );
		if (UNumber == CNumber)
				System.out.println ("It's a match");
		if (UNumber > CNumber);
			System.out.println ("Your number is too big");
		if (UNumber < CNumber)
			System.out.println ("Your number is too small");
		
		System.out.println("Bye for now.");
	}
}
