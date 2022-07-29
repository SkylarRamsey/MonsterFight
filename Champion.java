package MonsterFitness;

import java.time.LocalDate;
public class Champion {

	String championName = null;
	String weaponChoice = null;
	int monstersDefeated = 0;
	LocalDate fightDate = null;
	// make variable for each monster to track number defeated

	Champion(String name, String weaponChoice, LocalDate currentDate)
	{
		setChampionName(name);
		setWeaponChoice(weaponChoice);
		setFightDate(currentDate);
	}

	public String getChampionName() {
		return championName;
	}

	public void setChampionName(String championName) {
		this.championName = championName;
	}
	
	
	public String getWeaponChoice() {
		return weaponChoice;
	}

	public void setWeaponChoice(String weaponChoice) {
		this.weaponChoice = weaponChoice;
	}

	public LocalDate getFightDate() {
		return fightDate;
	}

	public void setFightDate(LocalDate fightDate) {
		this.fightDate = fightDate;
	}
	
	
}
