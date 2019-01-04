import java.util.Scanner;

import java.util.Random;

public class Monty_hall_complete
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
			
			int score = 0;
			
			System.out.println("How many times would you like to run the simulation");
		
			System.out.println("Please enter a number between 10 to 10000");
			int runs = bread.nextInt();
			bread.nextLine();
		
			
			
			while ( runs < 10 || runs > 10000 )
			{	
				System.out.println("Please enter a number between 10 to 10000");
				runs = bread.nextInt();
			}
			
			// /\ # of runs of simulation
			
			System.out.println("Would you like to switch doors on each run?,");
			System.out.println("Please enter switch if yes and stay if no");
			String sors = bread.next();
			
				while (sors.equals("switch") || sors.equals("stay"))
				{
					System.out.println("Please enter switch if yes and stay if no");
					sors = bread.next();
				}
					
			for (int i  = 1; i <= runs;   i++)
			{
			
			
			//cdoor = car door
			int cdoor = rand.nextInt(3) + 1;
			//System.out.println("\ncdoor: " + cdoor);		debug line
			
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
			//System.out.println("\ng1door: " + g1door);	debug line
			//System.out.println("\ng2door: " + g2door);	debug line
			
	
	// Non switch stuff below ... Switch stuff above, same code but stay has a few
	
			
			
			if(sors.equals("stay"))
		{	
			int choice = rand.nextInt(3) + 1;
			
			if (choice == cdoor)
			{
				score++;
			}			
			
		}	
			
			
			if(sors.equals("switch"))
			{	
				int choice = rand.nextInt(3) + 1;  // choosing random door
				
				if (choice == cdoor)
				{
					// the choice was carDoor. Randomly print out one of the other two doors
					
					int aiChoice = rand.nextInt(3) + 1;
					
					if (aiChoice == 1)
					{
						if (g1door == 2)
						{
							aiChoice = 3;
						}
					}
					
					if (aiChoice == 1)
					{
						if (g1door == 1)
						{
							int coin = rand.nextInt(2) + 1;
							
							if (coin == 1)
							{
								aiChoice = 2;
							}
							else
							{
								aiChoice = 3;
							}
						}
					}
				
					
					if (aiChoice == 1)
					{
						if (g1door == 3)
						{
							aiChoice = 2;
						}
					}
					
					//Chooses 1
					
					if (aiChoice == 2)
					{
						if (g1door == 1)
						{
							aiChoice = 3;
						}
					}
					
					
					if (aiChoice == 2)
					{
						if (g1door == 2)
						{
							int coin = rand.nextInt(2) + 1;
							
							if (coin == 1)
							{
								aiChoice = 3;
							}
							else
							{
								aiChoice = 2;
							}
						}
					}
					
					if (aiChoice == 2)
					{
						if (g1door == 3)
						{
							aiChoice = 1;
						}
					}
				
					
				//Chooses 2
					
					
					if (aiChoice == 3)
					{
						if (g1door == 1)
						{
							aiChoice = 2;
						}
					}
					
					if (aiChoice == 3)
					{
						if (g1door == 3)
						{
							int coin = rand.nextInt(2) + 1;
							
							if (coin == 1)
							{
								aiChoice = 2;
							}
							else
							{
								aiChoice = 1;
							}
						}
					}
					
					if (aiChoice == 3)
					{
						if (g1door == 2)
						{
							aiChoice = 1;
						}
					}
					
					//Chooses 3
					
					if(aiChoice == cdoor)
					{
						score++;
					}
						
					
				}	
					
			}
			
		
			}	
			//end of switch or stay			
			
			
			
			double persent = (double) score / runs;
			
			double winper = (persent * 100);
			
			System.out.println("\nYou won " + score + "/" + runs + " games" );
			System.out.println("You're win percentage was " + winper + "%");
				
			
	
			
		}
}