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
			
			//cdoor = car door
			int cdoor = rand.nextInt(3) + 1;
			System.out.println("\ncdoor: " + cdoor);
			
			// Define the other two doors that have goats behind them
			int g1door = 0; 
			int g2door = 0;
			
			// Now that I know which door the car is behind, I need to set which doors the goats are behind
			if (cdoor == 1) 
			{
				g1door = 2;
				g2door = 3;
			}
			else if (cdoor == 2)
			{
				g1door = 1;
				g2door = 3;			
			}
			else 
			{
				g1door = 1;
				g2door = 2;
			}
			System.out.println("\ng1door: " + g1door);
			System.out.println("\ng2door: " + g2door);
			
	
	
	
			
			
			System.out.println("Please select one of the 3 doors");  // Name one of the doors that a goat is behind
			int choice = bread.nextInt();
			
			if (choice == cdoor)
			{
				// the choice was carDoor. Randomly print out one of the other two doors
				int coin = rand.nextInt(2) + 1;	
				
				if (coin == 1)
				{
					System.out.println("\nA goat is behind door number " + g1door);
				}
				else 
				{
					System.out.println("\nA goat is behind door number " + g2door);
				}
			}
			else 
			{
				// Name the only other door that a goat is behind
				if (choice == g1door)
				{ 
					System.out.println("\nA goat is behind door number " + g2door);
				}
				else 
				{ 
					System.out.println("\nA goat is behind door number " + g1door);
				}
			}
			
			
			System.out.println("\nWould  you like to look behind the door you chose or switch?");
			String finalA = bread.nextLine();
	
			
			// answer stuff		
		
			if(finalA.equals("yes"))
			{
				System.out.println("\nWhat door would you like to choose");
				
				int fchoice = bread.nextInt();
				
				if(fchoice == cdoor)
				{
					System.out.println("Congrats, you won the car!");	
				}
				else
				{
					System.out.println("There is a goat, the car was behind door " + cdoor);
				}
			}
			
			//yes above, no below		
			if(finalA.equals("no"))
			{
				if(choice == cdoor)
				{
					System.out.println("Congrats, you won the car!");	
				}
				else
				{
					System.out.println("There is a goat, the car was behind door " + cdoor);
				}
			}			
	}
}