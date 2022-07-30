package MonsterFitness;

import java.util.Scanner;
import java.time.LocalDate;

public class FightMonsters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in); // allows us to read user entered data
		
		System.out.println("### WELCOME TO MONSTER FITNESS ###");
		System.out.println("### READY TO FIGHT? ### \n   (Enter Y/N)");
		
		String userEntry = userInput.nextLine(); //saves user entry as variable
		
		if(!(userEntry.toUpperCase().equals("N")))
			{
			System.out.println("### FIGHT AGAIN SOON ###");
				System.exit(0); // closes program
			}
		else
		{
			
			System.out.println("### CHAMPION NAME? ###\n    (enter name)"); //gets user name
			String championName = userInput.nextLine();
			
			System.out.println("### WEAPON FOR TODAY? ###\n    (Chooses muscle group)"); //gets muscle group selection
			
			System.out.println("### 1: SWORD ### \n    (Arms)");
			System.out.println("### 2: BOW ### \n    (Back)");
			System.out.println("### 3: TAE-KWON-DO ### \n    (Legs)");
			System.out.println("### 4: POWER-SUIT ### \n    (Core)");
			System.out.println("### 5: ENERGY ### \n    (Mobility)");
			System.out.println("### 6: HORSE ### \n    (Cardio)");
			
			boolean validEntry = false;
			
			while(validEntry == false)
			{
				System.out.println("### ENTER WEAPON CHOICE ### \n   (Enter the number)");
				
				int weaponChoice = Integer.parseInt(userInput.nextLine());
				//create error handling
				String chosenWeapon = null;
				
				if(weaponChoice == 1)
				{
					chosenWeapon = "SWORD";
					validEntry = true;
				}
				else if(weaponChoice == 2)
				{
					chosenWeapon = "BOW";
					validEntry = true;
				}
				else if(weaponChoice == 3)
				{
					chosenWeapon = "TAE-KWON-DO";
					validEntry = true;
				}
				else if(weaponChoice == 4)
				{
					chosenWeapon = "POWER-SUIT";
					validEntry = true;
				}
				else if(weaponChoice == 5)
				{
					chosenWeapon = "ENERGY";
					validEntry = true;
				}
				else if(weaponChoice == 6)
				{
					chosenWeapon = "HORSE";
					validEntry = true;
				}
				else
				{
					System.out.println("### ENTER NUMBER 1-6 ###");
					validEntry = false;			//test valid entry loop to make sure we get it without restarting
				}
			}
			
			Champion currentChampion = new Champion(championName.toUpperCase(), chosenWeapon, LocalDate.now());
			//creates champion to track and save values
			
			System.out.println("### " + championName.toUpperCase() + "HAS CHOSEN" + chosenWeapon + " ###\n");
			
			System.out.println("### GET READY TO RUMBLE ###");
			
			Monster.generateFight();
			//ADD IN MONSTER TO FIGHT
			// MAKE EXERCISE CLASS TO SHOW THEM ALL THEN TAKE IN USER ENTRY FOR EXERCISE SELECTION
			// ASK FOR REPS
			//ADD STATS TO FILE AFTER EACH FIGHT
		
		userInput.close();
	}
	

}
