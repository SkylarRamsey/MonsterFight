package MonsterFitness;

import java.util.Scanner;

public class Exercises {

	String muscleGroup = null;
	
	boolean allSetsCompleted = false;
	
	int[] exerciseSets = new int[4];
	
	
	int[] exercise1Reps = new int[3];
	int[] exercise2Reps = new int[3];
	int[] exercise3Reps = new int[3];
	int[] exercise4Reps = new int[3];
	
	int exerciseDamage = 0;
	int vulnerableExercise = 0;
	
	
	Scanner userInput = new Scanner(System.in); // allows us to read user entered data
	
	
	public Exercises(String muscleGroup)
	{
		this.muscleGroup = muscleGroup;
	}
	
	//change musclegroup to weaponChoice

	//CREATE DAMAGE ALGORITHM FOR REPS DONE
	
	public int dealDamage()
	{
		return exerciseDamage;
	}
	
	public void showExercises() // Shows exercises choices based on chosen musclegroup
	{
		
	
				
		int entry = 0;
		int numberOfReps = 0;

		int exerciseWithLeastSets = 0;
		int tempLowest = exerciseSets[0];
		
		for(int i = 0; i < 4; i++)
		{
			if(exerciseSets[i] < tempLowest)
			{
				exerciseWithLeastSets = i;
				tempLowest = exerciseSets[i];
			}
		}
		
		if(this.muscleGroup == "SWORD")
		{
			
			int count = 0;
			boolean validEntry = false;
			
			while(validEntry == false)
			{

				System.out.println("### CHOOSE YOUR MOVE ###");
				System.out.println("### MAX 3 SETS PER EXERCISE ###");
				System.out.println("### EXERCISE 1: PUSHUPS/BENCH SETS:" + exerciseSets[0] +" ###");
				System.out.println("### EXERCISE 2: CURLS SETS:" + exerciseSets[1] + " ###");
				System.out.println("### EXERCISE 3: SHOULDER RAISES SETS:" + exerciseSets[2] +" ###");
				System.out.println("### EXERCISE 4: SHOULDER PRESS SETS:" + exerciseSets[3] +" ###");
			
			System.out.println("### EXERCISE " + (exerciseWithLeastSets + 1) + ": HITS A CRITICAL POINT! ###");
			vulnerableExercise = exerciseWithLeastSets + 1;
			
			try
			{
				entry = Integer.parseInt(userInput.nextLine());
				
				if( entry == 1 && exerciseSets[0] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 2 && exerciseSets[1] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 3 && exerciseSets[2] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 4 && exerciseSets[3] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else
				{
					validEntry = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("### MUST ENTER AN INTEGER ###");
			}		
			}
			
			
			do
			{
				switch(entry)
				{
					case 1:
						System.out.println("### ENTER NUMBER OF REPS ###");
						
						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[0]++;
							exercise1Reps[exerciseSets[0] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}

						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 2:
						System.out.println("### ENTER NUMBER OF REPS ###");
						
						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[1]++;
							exercise2Reps[exerciseSets[1] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 3:
						System.out.println("### ENTER NUMBER OF REPS ###");
						
						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[2]++;
							exercise3Reps[exerciseSets[2] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						

						if(numberOfReps <= 8)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 5;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 7;
						}
						else
						{
							exerciseDamage = 10;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 4:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[3]++;
							exercise4Reps[exerciseSets[3] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 5:
						break;
									
					default:
						break;
						
							
				}
			}
			while(numberOfReps == 0);
		}
		
		if(this.muscleGroup == "BOW")
		{
			int count = 0;
			boolean validEntry = false;
			
			while(validEntry == false)
			{
				System.out.println("### CHOOSE YOUR MOVE ###");
				System.out.println("### EXERCISE 1: PULL-UPS SETS:" + exerciseSets[0] +" ###");
				System.out.println("### EXERCISE 2: ROWS SETS:" + exerciseSets[1] + " ###");
				System.out.println("### EXERCISE 3: DEADLIFT SETS:" + exerciseSets[2] +" ###");
				System.out.println("### EXERCISE 4: PULL-UP HOLD SETS:" + exerciseSets[3] +" ###");
			
			System.out.println("### EXERCISE " + (exerciseWithLeastSets + 1) + ": HITS A CRITICAL POINT! ###");
			vulnerableExercise = exerciseWithLeastSets + 1;
			
			try
			{
				entry = Integer.parseInt(userInput.nextLine());
				
				if( entry == 1 && exerciseSets[0] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 2 && exerciseSets[1] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 3 && exerciseSets[2] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 4 && exerciseSets[3] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else
				{
					validEntry = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("### MUST ENTER AN INTEGER ###");
			}		
			}
			
			do
			{
				switch(entry)
				{
					case 1:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[0]++;
							exercise1Reps[exerciseSets[0] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 5;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 10;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 15;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 20;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 2:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[1]++;
							exercise2Reps[exerciseSets[1] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 3:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[2]++;
							exercise3Reps[exerciseSets[2] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 10;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 12;
						}
						else
						{
							exerciseDamage = 15;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 4:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[3]++;
							exercise4Reps[exerciseSets[3] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 10)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 10;
						}
						else if(numberOfReps <= 45)
						{
							exerciseDamage = 12;
						}
						else
						{
							exerciseDamage = 15;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 5:
						break;
									
					default:
						break;
						
							
				}
			}
			while(numberOfReps == 0);
		}
		
		if(this.muscleGroup == "POWER-SUIT")
		{
			int count = 0;
			boolean validEntry = false;
			
			while(validEntry == false)
			{
				System.out.println("### CHOOSE YOUR MOVE ###");
				System.out.println("### EXERCISE 1: LEG RAISES SETS:" + exerciseSets[0] +" ###");
				System.out.println("### EXERCISE 2: PLANK SETS:" + exerciseSets[1] + " ###");
				System.out.println("### EXERCISE 3: TWISTS SETS:" + exerciseSets[2] +" ###");
				System.out.println("### EXERCISE 4: SIDE CRUNCHES SETS:" + exerciseSets[3] +" ###");
			
			System.out.println("### EXERCISE " + (exerciseWithLeastSets + 1) + ": HITS A CRITICAL POINT! ###");
			vulnerableExercise = exerciseWithLeastSets + 1;
			
			try
			{
				entry = Integer.parseInt(userInput.nextLine());

				if( entry == 1 && exerciseSets[0] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 2 && exerciseSets[1] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 3 && exerciseSets[2] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 4 && exerciseSets[3] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else
				{
					validEntry = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("### MUST ENTER AN INTEGER ###");
			}		
			}
			
			
			do
			{
				switch(entry)
				{
					case 1:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[0]++;
							exercise1Reps[exerciseSets[0] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 5;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 7;
						}
						else
						{
							exerciseDamage = 8;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 2:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[1]++;
							exercise2Reps[exerciseSets[1] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 10)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 45)
						{
							exerciseDamage = 6;
						}
						else
						{
							exerciseDamage = 8;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 3:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[2]++;
							exercise3Reps[exerciseSets[2] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 5;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 7;
						}
						else
						{
							exerciseDamage = 8;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 4:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[3]++;
							exercise4Reps[exerciseSets[3] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
											
					default:
						break;
						
							
				}
			}
			while(numberOfReps == 0);
		}
		
		if(this.muscleGroup == "ENERGY")
		{
			int count = 0;
			boolean validEntry = false;
			
			while(validEntry == false)
			{
				System.out.println("### CHOOSE YOUR MOVE ###");
				System.out.println("### EXERCISE 1: FRONT SPLIT SETS:" + exerciseSets[0] +" ###");
				System.out.println("### EXERCISE 2: SIDE SPLIT SETS:" + exerciseSets[1] + " ###");
				System.out.println("### EXERCISE 3: TOE TOUCH SETS:" + exerciseSets[2] +" ###");
				System.out.println("### EXERCISE 4: DEEP SQUAT SETS:" + exerciseSets[3] +" ###");
				
			System.out.println("### EXERCISE " + (exerciseWithLeastSets + 1) + ": HITS A CRITICAL POINT! ###");
			vulnerableExercise = exerciseWithLeastSets + 1;
			
			try
			{
				entry = Integer.parseInt(userInput.nextLine());

				if( entry == 1 && exerciseSets[0] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 2 && exerciseSets[1] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 3 && exerciseSets[2] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 4 && exerciseSets[3] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else
				{
					validEntry = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("### MUST ENTER AN INTEGER ###");
			}		
			}
			
			
			do
			{
				switch(entry)
				{
					case 1:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[0]++;
							exercise1Reps[exerciseSets[0] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 5)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 10)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 8;
						}
						else
						{
							exerciseDamage = 10;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 2:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[1]++;
							exercise2Reps[exerciseSets[1] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 5)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 10)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 8;
						}
						else
						{
							exerciseDamage = 10;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 3:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[2]++;
							exercise3Reps[exerciseSets[2] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						
						if(numberOfReps <= 5)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 10)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 8;
						}
						else
						{
							exerciseDamage = 10;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 4:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[3]++;
							exercise4Reps[exerciseSets[3] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 5)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 10)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 8;
						}
						else
						{
							exerciseDamage = 10;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(numberOfReps == 0);

		}
		
		if(this.muscleGroup == "TAE-KWON-DO")
		{
			int count = 0;
			boolean validEntry = false;
			
			while(validEntry == false)
			{
				System.out.println("### CHOOSE YOUR MOVE ###");
				System.out.println("### EXERCISE 1: SQUAT SETS:" + exerciseSets[0] +" ###");
				System.out.println("### EXERCISE 2: LUNGE SETS:" + exerciseSets[1] + " ###");
				System.out.println("### EXERCISE 3: WALL SIT SETS:" + exerciseSets[2] +" ###");
				System.out.println("### EXERCISE 4: CALF RAISES SETS:" + exerciseSets[3] +" ###");
				
			System.out.println("### EXERCISE " + (exerciseWithLeastSets + 1) + ": HITS A CRITICAL POINT! ###");
			vulnerableExercise = exerciseWithLeastSets + 1;
			
			try
			{
				entry = Integer.parseInt(userInput.nextLine());

				if( entry == 1 && exerciseSets[0] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 2 && exerciseSets[1] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 3 && exerciseSets[2] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 4 && exerciseSets[3] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else
				{
					validEntry = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("### MUST ENTER AN INTEGER ###");
			}		
			}
			
			do
			{
				switch(entry)
				{
					case 1:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[0]++;
							exercise1Reps[exerciseSets[0] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 5)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 8)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 10)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 2:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[1]++;
							exercise2Reps[exerciseSets[1] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 5)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 8)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 10)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 3:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[2]++;
							exercise3Reps[exerciseSets[2] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						
						if(numberOfReps <= 10)
						{
							exerciseDamage = 1;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 45)
						{
							exerciseDamage = 8;
						}
						else
						{
							exerciseDamage = 10;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 4:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[3]++;
							exercise4Reps[exerciseSets[3] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 5:
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(numberOfReps == 0);
		}
		
		if(this.muscleGroup == "HORSE")
		{
			int count = 0;
			boolean validEntry = false;
			
			while(validEntry == false)
			{
			System.out.println("### CHOOSE YOUR MOVE ###");
			System.out.println("### EXERCISE 1: BURPEES SETS:" + exerciseSets[0] +" ###");
			System.out.println("### EXERCISE 2: HIGH KNEES SETS:" + exerciseSets[1] + " ###");
			System.out.println("### EXERCISE 3: MOUNTAIN CLIMBERS SETS:" + exerciseSets[2] +" ###");
			System.out.println("### EXERCISE 4: JUMPING JACKS SETS:" + exerciseSets[3] +" ###");
			
			System.out.println("### EXERCISE " + (exerciseWithLeastSets + 1) + ": HITS A CRITICAL POINT! ###");
			
			try
			{
				entry = Integer.parseInt(userInput.nextLine());

				if( entry == 1 && exerciseSets[0] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 2 && exerciseSets[1] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 3 && exerciseSets[2] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else if( entry == 4 && exerciseSets[3] == 3)
				{
					System.out.println("### YOU HAVE COMPLETED THIS EXERCISE ###");
					validEntry = false;
				}
				else
				{
					validEntry = true;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("### MUST ENTER AN INTEGER ###");
			}		
			}
			
			do
			{
				switch(entry)
				{
					case 1:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[0]++;
							exercise1Reps[exerciseSets[0] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 8)
						{
							exerciseDamage = 3;
						}
						else if(numberOfReps <= 12)
						{
							exerciseDamage = 5;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 10;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 12;
						}
						else
						{
							exerciseDamage = 15;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 2:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[1]++;
							exercise2Reps[exerciseSets[1] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 10)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 3:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[2]++;
							exercise3Reps[exerciseSets[2] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						
						if(numberOfReps <= 10)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
					case 4:
						System.out.println("### ENTER NUMBER OF REPS ###");

						try
						{
							numberOfReps = Integer.parseInt(userInput.nextLine());
							exerciseSets[3]++;
							exercise4Reps[exerciseSets[3] -1] = numberOfReps;
						}
						catch(NumberFormatException e)
						{
							System.out.println("### MUST ENTER AN INTEGER ###");
						}
						
						if(numberOfReps <= 10)
						{
							exerciseDamage = 2;
						}
						else if(numberOfReps <= 15)
						{
							exerciseDamage = 4;
						}
						else if(numberOfReps <= 20)
						{
							exerciseDamage = 6;
						}
						else if(numberOfReps <= 25)
						{
							exerciseDamage = 8;
						}
						else if(numberOfReps <= 30)
						{
							exerciseDamage = 10;
						}
						else
						{
							exerciseDamage = 12;
						}
						
						if(vulnerableExercise == 1)
						{
							exerciseDamage = (int)(exerciseDamage * 1.5);
						}
						
						count = 0;
						for(int i = 0; i < 4; i++)
						{
							if(exerciseSets[i] == 3)
							{
								count++;
							}
						}
						
						if(count == 4)
						{
							System.out.println("### THE MONSTER HAS FALLEN ###");
							allSetsCompleted = true;
						}
						
						break;
						
									
					default:
						break;
						
							
				}
			}
			while(numberOfReps == 0);
		}
		
		//userInput.close();
	}

	public boolean allSetsCompleted()
	{
		return allSetsCompleted;

	}
	

}
