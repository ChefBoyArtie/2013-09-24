import java.util.Scanner;

/**
 * @author	Art Bustillos
 *			Date: 9/24/2013
 *			Week 5 Lab 4 
 */
public class LabFour {

	public static void main(String[] args) { 
		Scanner inp = new Scanner( System.in );
		int UNumber; 
		int CNumber; 
		for (int round = 1; round < 4; round++) { 
			CNumber = 0 + (int) ( Math.random() * 10 ); 
			System.out.println ("Pick a number between 0 and 10"); 
			UNumber = inp.nextInt(); 
			System.out.printf ("The random number is %d\n", CNumber ); 
			if (UNumber > CNumber) { 
				System.out.println ("Your number is too big.");
			} 
			else if (UNumber < CNumber) { 
				System.out.println ("Your number is too low"); 
			} 
			else { 
				System.out.println ("It's a match");
			} 
		} 
		
	System.out.println("Bye for now. Thanks for playing");
	}
}
