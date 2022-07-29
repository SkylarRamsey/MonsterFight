package MonsterFitness;

import java.util.Scanner;
import java.time.LocalDate;

public class FightMonsters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("### WELCOME TO MONSTER FITNESS ###");
		System.out.println("### READY TO FIGHT? ### \n   (Enter Y/N)");
		
		String userEntry = userInput.nextLine();
		
		if(!(userEntry.toUpperCase().equals("Y")))
			{
			System.out.println("### FIGHT AGAIN SOON ###");
				System.exit(0);
			}
		else
		{
			
			System.out.println("### CHAMPION NAME? ###\n    (enter name)");
			String championName = userInput.nextLine();
			
			System.out.println("### WEAPON FOR TODAY? ###\n    (Chooses muscle group)");
			
			System.out.println("### 1: SWORD ### \n    (Arms)");
			System.out.println("### 2: BOW ### \n    (Back)");
			System.out.println("### 3: TAE-KWON-DO ### \n    (Legs)");
			System.out.println("### 4: POWER-SUIT ### \n    (Core)");
			System.out.println("### 5: ENERGY ### \n    (Mobility)");
			System.out.println("### 6: HORSE ### \n    (Cardio)");
			
			System.out.println("### ENTER WEAPON CHOICE ### \n   (Enter the number)");
			
			int weaponChoice = Integer.parseInt(userInput.nextLine());
			//create error handling
			String chosenWeapon = null;
			
			if(weaponChoice == 1)
			{
				chosenWeapon = "SWORD";
			}
			else if(weaponChoice == 2)
			{
				chosenWeapon = "BOW";
			}
			else if(weaponChoice == 3)
			{
				chosenWeapon = "TAE-KWON-DO";
			}
			else if(weaponChoice == 4)
			{
				chosenWeapon = "POWER-SUIT";
			}
			else if(weaponChoice == 5)
			{
				chosenWeapon = "ENERGY";
			}
			else if(weaponChoice == 6)
			{
				chosenWeapon = "HORSE";
			}
			else
			{
				System.out.println("### ENTER NUMBER 1-6 ###"); //create valid entry loop to make sure we get it
			}
			
			Champion currentChampion = new Champion(championName.toUpperCase(), chosenWeapon, LocalDate.now());
			
			System.out.println("### " + championName.toUpperCase() + "HAS CHOSEN" + chosenWeapon + " ###\n");
			
			System.out.println("### GET READY TO RUMBLE ###");
			
			Monster.generateFight();
			//ADD IN MONSTER TO FIGHT
			//ADD STATS TO FILE AFTER EACH FIGHT
		
		int entry = 0;
		
		
		if(currentChampion.getWeaponChoice().equals("SWORD"))
		{
			do
			{
				switch(entry)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(entry != 5);
		}
		else if(currentChampion.getWeaponChoice().equals("BOW"))
		{
			do
			{
				switch(entry)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(entry != 5);
		}
		else if(currentChampion.getWeaponChoice().equals("TAE-KWON-DO"))
		{
			do
			{
				switch(entry)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(entry != 5);
		}
		else if(currentChampion.getWeaponChoice().equals("POWER-SUIT"))
		{
			do
			{
				switch(entry)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(entry != 5);
		}
		else if(currentChampion.getWeaponChoice().equals("ENERGY"))
		{
			do
			{
				switch(entry)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(entry != 5);
		}
		else if(currentChampion.getWeaponChoice().equals("HORSE"))
		{
			do
			{
				switch(entry)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(entry != 5);
		}

		
		userInput.close();
	}
	

}
