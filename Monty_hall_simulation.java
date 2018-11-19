import java.util.Scanner;

import java.util.Random;

public class Monty_hall_simulation
{


	/**
	*
	*	@ Sam Bauer 22
	*	
	**/	
		
	
	
	
		public static void main(String[] args) 
		{
		
			
		Scanner bread = new Scanner (System.in);
			
		Random rand = new Random();	
			
		int cdoor = rand.nextInt(3) + 1;
		

		System.out.println("Please select one of the 3 doors");
		int choice = bread.nextInt();
		


		int gdoor = rand.nextInt(2) + 1;
		
		System.out.println("\nThere is a goat behind door " + gdoor);
		
		System.out.println("\nWould  you like to look behind the door you chose or switch?");
		String finalA = bread.nextLine();
		
// awnser stuff		
	
		if(finalA.equals("yes"))
		{
		System.out.println("\nWhat door would you like to choose");
		}
		
		int fchoice = bread.nextInt();
		
		if(fchoice == cdoor)
		{
		System.out.println("Congrats, you won the car!");	
		}
		else if (fchoice > cdoor)
		System.out.println("There is a goat, the car was behind door " + cdoor);
		{
		
//yes above, no below		
		
		if(finalA.equals("no"))
		
		if(fchoice == cdoor)
		{
		System.out.println("Congrats, you won the car!");	
		}
		else if (choice > cdoor)
		System.out.println("There is a goat, the car was behind door " + cdoor);
		}
		else (choice < cdoor)
		System.out.println("There is a goat, the car was behind door " + cdoor);
		}

	
		

	}

}
