package MonsterFitness;

import java.util.Random;
public class Monster {

	int maxHP = 0;
	int currentHP = 0;
	String type = null;
	
	boolean monsterDefeated = false;
	
	Random rnd = new Random();
	
	public Monster()
	{
		
	}

	public void generateFight()
	{
		Random rnd = new Random();
		int randomType = rnd.nextInt(16); // selects random integer out of 1-16, check if 0 counts, will have to fix that
		int randomHP = 0;					// random integer is used to select the monster
											//may need to balance hp values more
		String monsterType = null;
		
		if(randomType == 1)
		{
			monsterType = "BAT";
			randomHP = 10;
		}
		else if(randomType == 2)
		{
			monsterType = "CHILL COW";
			randomHP = 25;
			
		}
		else if(randomType == 3)
		{
			monsterType = "DAWGS";
			randomHP = 20;
			
		}
		else if(randomType == 4 )
		{
			monsterType = "GOOSE";
			randomHP = 30;
			
		}
		else if(randomType == 5 )
		{
			monsterType = "FRAWG WIZARD";
			randomHP = 35;
		}
		else if(randomType == 6 )
		{
			monsterType = "DINO";
			randomHP = 30;
			
		}
		else if(randomType == 7 )
		{
			monsterType = "DEMON LAWD";
			randomHP = 50;
			
		}
		else if(randomType == 8 )
		{
			monsterType = "DEMON GENERAL";
			randomHP = 40;
			
		}
		else if(randomType == 9 )
		{
			monsterType = "ANGEL OF DEATH";
			randomHP = 55;
			
		}
		else if(randomType == 10 )
		{
			monsterType = "REAPER";
			randomHP = 45;
			
		}
		else if(randomType == 11)
		{
			monsterType = "VIKING SKELLIE";
			randomHP = 30;
			
		}
		else if(randomType == 12)
		{
			monsterType = "GRIPPER ALIEN";
			randomHP = 35;
			
		}
		else if(randomType == 13)
		{
			monsterType = "COWBOY CACTUS";
			randomHP = 25;
			
		}
		else if(randomType == 14)
		{
			monsterType = "MUSHROOM HOUSE";
			randomHP = 15;
			
		}
		else if(randomType == 15)
		{
			monsterType = "MUSHROOM";
			randomHP = 30;
			
		}
		else if(randomType == 16)
		{
			monsterType = "COWBOY";
			randomHP = 40;
			
		}
		else if(randomType == 17)
		{
			monsterType = "OSTRICH KNIGHT";
			randomHP = 55;
		}
		
		
		setMaxHP(randomHP);
		setcurrentHP(randomHP);
		setType(monsterType);
		
		//GOAL IS TO GET EACH EXERCISE TO GET 3 SETS
		
	}

	public int getMaxHP() {
		return maxHP;
	}


	public void setMaxHP(int hP) {
		maxHP = hP;
	}
	
	public int getcurrentHP() {
		return currentHP;
	}


	public void setcurrentHP(int hP) {
		currentHP = hP;
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() // Outputs monster image, stats, title and, a message
	{
		if(this.type.equals("BAT"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
			"   =/\\                 /\\=\r\n"
			+ "    / \\'._   (\\_/)   _.'/ \\\r\n"
			+ "   / .''._'--(o.o)--'_.''. \\\r\n"
			+ "  /.' _/ |`'=/ \" \\='`| \\_ `.\\\r\n"
			+ " /` .' `\\;-,'\\___/',-;/` '. '\\\r\n"
			+ "/.-'       `\\(-V-)/`       `-.\\\r\n"
			+ "`            \"   \"   "	
			+ "\n ### ITS BATMAN!! GROSS, HIS WEE-WEE IS OUT! BLEGH! ###";
				
		}
		else if(this.type.equals("CHILL COW"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
				"\r\n"
				+ "            /)  (\\\r\n"
				+ "        .-._((,~~.))_.-,\r\n"
				+ "         `=.   99   ,='\r\n"
				+ "           / ,o~~o. \\\r\n"
				+ "          { { .__. } }\r\n"
				+ "           ) `~~~\\' (\r\n"
				+ "          /`-._  _\\.-\\\r\n"
				+ "         /         )  \\\r\n"
				+ "       ,-X        #   X-.\r\n"
				+ "      /   \\          /   \\\r\n"
				+ "     (     )| |  | |(     )\r\n"
				+ "      \\   / | |  | | \\   /\r\n"
				+ "       \\_(.-( )--( )-.)_/\r\n"
				+ "       /_,\\ ) /  \\ ( /._\\\r\n"
				+ "           /_,\\  /._\\"	 
				+ "\n ### SHE'S JUST CHILLING THERE, MENACINGLY!! ###";
		}
		else if(this.type.equals("DAWGS"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
					"            /)-_-(\\        /)-_-(\\\r\n"
					+ "             (o o)          (o o)\r\n"
					+ "     .-----__/\\o/            \\o/\\__-----.\r\n"
					+ "    /  __      /              \\      __  \\\r\n"
					+ "\\__/\\ /  \\_\\ |/                \\| /_/  \\ /\\__/\r\n"
					+ "     \\\\     ||                  ||      \\\\\r\n"
					+ "     //     ||                  ||      //\r\n"
					+ "     |\\     |\\                  /|     /|"
					+ "\n ### WHY DO THEY LOOK LIKE THAT?? ARE THEY OKAY?? ###";
		}
		else if(this.type.equals("GOOSE"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
			"      _.-.\r\n"
			+ " __.-' ,  \\\r\n"
			+ "'--'-'._   \\\r\n"
			+ "        '.  \\\r\n"
			+ "         )-- \\ __.--._\r\n"
			+ "        /   .'        '--.\r\n"
			+ "       .               _/-._\r\n"
			+ "       :       ____._/   _-'\r\n"
			+ "        '._          _.'-'\r\n"
			+ "           '-._    _.'\r\n"
			+ "               \\_|/\r\n"
			+ "              __|||\r\n"
			+ "              >__/'"		
			+ "\n ### I REALLY WOULD NOT MESS WITH THIS GOOSE HE IS GONNA MESS YOU UP ###";
		}
		else if(this.type.equals("FRAWG WIZARD"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
					"                            .-----.\r\n"
					+ "                            /7  .  (\r\n"
					+ "                           /   .-.  \\\r\n"
					+ "                          /   /   \\  \\\r\n"
					+ "                         / `  )   (   )\r\n"
					+ "                        / `   )   ).  \\\r\n"
					+ "                      .'  _.   \\_/  . |\r\n"
					+ "     .--.           .' _.' )`.        |\r\n"
					+ "    (    `---...._.'   `---.'_)    ..  \\\r\n"
					+ "     \\            `----....___    `. \\  |\r\n"
					+ "      `.           _ ----- _   `._  )/  |\r\n"
					+ "        `.       /\"  \\   /\"  \\`.  `._   |\r\n"
					+ "          `.    ((O)` ) ((O)` ) `.   `._\\\r\n"
					+ "            `-- '`---'   `---' )  `.    `-.\r\n"
					+ "               /                  ` \\      `-.\r\n"
					+ "             .'                      `.       `.\r\n"
					+ "            /                     `  ` `.       `-.\r\n"
					+ "     .--.   \\ ===._____.======. `    `   `. .___.--`     .''''.\r\n"
					+ "    ' .` `-. `.                )`. `   ` ` \\          .' . '  8)\r\n"
					+ "   (8  .  ` `-.`.               ( .  ` `  .`\\      .'  '    ' /\r\n"
					+ "    \\  `. `    `-.               ) ` .   ` ` \\  .'   ' .  '  /\r\n"
					+ "     \\ ` `.  ` . \\`.    .--.     |  ` ) `   .``/   '  // .  /\r\n"
					+ "      `.  ``. .   \\ \\   .-- `.  (  ` /_   ` . / ' .  '/   .'\r\n"
					+ "        `. ` \\  `  \\ \\  '-.   `-'  .'  `-.  `   .  .'/  .'\r\n"
					+ "          \\ `.`.  ` \\ \\    ) /`._.`       `.  ` .  .'  /\r\n"
					+ "           |  `.`. . \\ \\  (.'               `.   .'  .'\r\n"
					+ "        __/  .. \\ \\ ` ) \\                     \\.' .. \\__\r\n"
					+ " .-._.-'     '\"  ) .-'   `.                   (  '\"     `-._.--.\r\n"
					+ "(_________.-====' / .' /\\_)`--..__________..-- `====-. _________)\r\n"
					+ "                 (.'(.'\r\n"
					+ "\n ### HOW DID HE LEARN TO DO MAGIC?? WHO GAVE HIM THAT SICK HAT??? ###";
		}
		else if(this.type.equals("DINO"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
					"                                             ____\r\n"
					+ "  ___                                      .-~. /_\"-._\r\n"
					+ "`-._~-.                                  / /_ \"~o\\  :Y\r\n"
					+ "      \\  \\                                / : \\~x.  ` ')\r\n"
					+ "      ]  Y                              /  |  Y< ~-.__j\r\n"
					+ "     /   !                        _.--~T : l  l<  /.-~\r\n"
					+ "    /   /                 ____.--~ .   ` l /~\\ \\<|Y\r\n"
					+ "   /   /             .-~~\"        /| .    ',-~\\ \\L|\r\n"
					+ "  /   /             /     .^   \\ Y~Y \\.^>/l_   \"--'\r\n"
					+ " /   Y           .-\"(  .  l__  j_j l_/ /~_.-~    .\r\n"
					+ "Y    l          /    \\  )    ~~~.\" / `/\"~ / \\.__/l_\r\n"
					+ "|     \\     _.-\"      ~-{__     l  :  l._Z~-.___.--~\r\n"
					+ "|      ~---~           /   ~~\"---\\_  ' __[>\r\n"
					+ "l  .                _.^   ___     _>-y~\r\n"
					+ " \\  \\     .      .-~   .-~   ~>--\"  /\r\n"
					+ "  \\  ~---\"            /     ./  _.-'\r\n"
					+ "   \"-.,_____.,_  _.--~\\     _.-~\r\n"
					+ "               ~~     (   _}       \r\n"
					+ "                      `. ~(\r\n"
					+ "                        )  \\\r\n"
					+ "                  /,`--'~\\--'~\\\r\n"
					+ "                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n"
					+ "\n ### I SWEAR I CLOSED THE PARK GATE HOW DID SHE GET OUT HERE?? ###"; 
		}
		else if(this.type.equals("DEMON LAWD"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
					"                         ==(W{==========-      /===-                        \r\n"
					+ "                              ||  (.--.)         /===-_---~~~~~~~~~------____  \r\n"
					+ "                              | \\_,|**|,__      |===-~___                _,-' `\r\n"
					+ "                 -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~      \r\n"
					+ "             ______-==|        /`\\_. .__/\\ \\    | |  \\\\           _-~`         \r\n"
					+ "       __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'             \r\n"
					+ "    _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /               \r\n"
					+ "  .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'                \r\n"
					+ " /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'                  \r\n"
					+ "/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`                   \r\n"
					+ "                  \\_|      /        _) | ;  ),   __--~~                        \r\n"
					+ "                    '~~--_/      _-~/- |/ \\   '-~ \\                            \r\n"
					+ "                   {\\__--_/}    / \\\\_>-|)<__\\      \\                           \r\n"
					+ "                   /'   (_/  _-~  | |__>--<__|      |                          \r\n"
					+ "                  |   _/) )-~     | |__>--<__|      |                          \r\n"
					+ "                  / /~ ,_/       / /__>---<__/      |                          \r\n"
					+ "                 o-o _//        /-~_>---<__-~      /                           \r\n"
					+ "                 (^(~          /~_>---<__-      _-~                            \r\n"
					+ "                ,/|           /__>--<__/     _-~                               \r\n"
					+ "             ,//('(          |__>--<__|     /    .----_          \r\n"
					+ "            ( ( '))          |__>--<__|    |                 /' _---_~\\        \r\n"
					+ "         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\      \r\n"
					+ "        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||      \r\n"
					+ "      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'       \r\n"
					+ "    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/                  \r\n"
					+ "  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~                    \r\n"
					+ "   ;'( ')/ ,)(                              ~~~~~~~~~~                         \r\n"
					+ "  ' ') '( (/                                                                   \r\n"
					+ "    '   '  `"
					+ "\n ### THE DRAGON SAID HE HATES THIS GUY, GET HIM!!! ### ";
		}
		else if(this.type.equals("DEMON GENERAL"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
			"     .      .\r\n"
			+ "     |\\____/|\r\n"
			+ "    (\\|----|/)\r\n"
			+ "     \\ 0  0 /\r\n"
			+ "      |    |\r\n"
			+ "   ___/\\../\\____\r\n"
			+ "  /     --       \\\r\n"
			+ " /  \\         /   \\\r\n"
			+ "|    \\___/___/(   |\r\n"
			+ "\\   /|  }{   | \\  )\r\n"
			+ " \\  ||__}{__|  |  |\r\n"
			+ "  \\  |;;;;;;;\\  \\ / \\_______\r\n"
			+ "   \\ /;;;;;;;;| [,,[|======'\r\n"
			+ "     |;;;;;;/ |     /\r\n"
			+ "     ||;;|\\   |\r\n"
			+ "     ||;;/|   /\r\n"
			+ "     \\_|:||__|\r\n"
			+ "      \\ ;||  /\r\n"
			+ "      |= || =|\r\n"
			+ "      |= /\\ =|\r\n"
			+ "      /_/  \\_\\"	
			+ "\n ### PRETTY BUFF DUDE, ASK FOR SOME GYM POINTERS LATER ###";
		}
		else if(this.type.equals("ANGEL OF DEATH"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
				"                 /\\\r\n"
				+ "                 ||\r\n"
				+ "   ____ (((+))) _||_\r\n"
				+ "  /.--.\\  .-.  /.||.\\\r\n"
				+ " /.,   \\\\(0.0)// || \\\\\r\n"
				+ "/;`\";/\\ \\\\|m|//  ||  ;\\\r\n"
				+ "|:   \\ \\__`:`____||__:|\r\n"
				+ "|:    \\__ \\T/ (@~)(~@)|\r\n"
				+ "|:    _/|     |\\_\\/  :|\r\n"
				+ "|:   /  |     |  \\   :|\r\n"
				+ "|'  /   |     |   \\  '|\r\n"
				+ " \\_/    |     |    \\_/\r\n"
				+ "        |     |\r\n"
				+ "        |_____|\r\n"
				+ "        |_____|"	
				+ "\n I HAVE NO IDEA WHO THIS GUY IS, HE JUST SHOWED UP ONE DAY";
		}
		else if(this.type.equals("REAPER"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
			"                                       .\"\"--..__\r\n"
			+ "                     _                     []       ``-.._\r\n"
			+ "                  .'` `'.                  ||__           `-._\r\n"
			+ "                 /    ,-.\\                 ||_ ```---..__     `-.\r\n"
			+ "                /    /:::\\\\               /|//}          ``--._  `.\r\n"
			+ "                |    |:::||              |////}                `-. \\\r\n"
			+ "                |    |:::||             //'///                    `.\\\r\n"
			+ "                |    |:::||            //  ||'                      `|\r\n"
			+ "                /    |:::|/        _,-//\\  ||\r\n"
			+ "               /`    |:::|`-,__,-'`  |/  \\ ||\r\n"
			+ "             /`  |   |'' ||           \\   |||\r\n"
			+ "           /`    \\   |   ||            |  /||\r\n"
			+ "         |`       |  |   |)            \\ | ||\r\n"
			+ "        |          \\ |   /      ,.__    \\| ||\r\n"
			+ "        /           `         /`    `\\   | ||\r\n"
			+ "       |                     /        \\  / ||\r\n"
			+ "       |                     |        | /  ||\r\n"
			+ "       /         /           |        `(   ||\r\n"
			+ "      /          .           /          )  ||\r\n"
			+ "     |            \\          |     ________||\r\n"
			+ "    /             |          /     `-------.|\r\n"
			+ "   |\\            /          |              ||\r\n"
			+ "   \\/`-._       |           /              ||\r\n"
			+ "    //   `.    /`           |              ||\r\n"
			+ "   //`.    `. |             \\              ||\r\n"
			+ "  ///\\ `-._  )/             |              ||\r\n"
			+ " //// )   .(/               |              ||\r\n"
			+ " ||||   ,'` )               /              //\r\n"
			+ " ||||  /                    /             || \r\n"
			+ " `\\\\` /`                    |             // \r\n"
			+ "     |`                     \\            ||  \r\n"
			+ "    /                        |           //  \r\n"
			+ "  /`                          \\         //   \r\n"
			+ "/`                            |        ||    \r\n"
			+ "`-.___,-.      .-.        ___,'        (/    \r\n"
			+ "         `---'`   `'----'`"		
			+ "\n ### I GUESS ITS YOUR TIME DUDE, UNLESS YOU CAN WORKOUT HARD ENOUGH TO ESCAPE DEATH! ###";
		}
		else if(this.type.equals("VIKING SKELLIE"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
				"                             _.--\"\"-._\r\n"
				+ "  .                         .\"         \".\r\n"
				+ " / \\    ,^.         /(     Y             |      )\\\r\n"
				+ "/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )\r\n"
				+ "|        :|    `>   '.     l_..-------.._l      .'\r\n"
				+ "|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"\r\n"
				+ " \\  .-' | |  `              l._       _.'\r\n"
				+ "  \\/    | |                   l`^^'^^'j\r\n"
				+ "        | |                _   \\_____/     _\r\n"
				+ "        j |               l `--__)-'(__.--' |\r\n"
				+ "        | |               | /`---``-----'\"1 |  ,-----.\r\n"
				+ "        | |               )/  `--' '---'   \\'-'  ___  `-.\r\n"
				+ "        | |              //  `-'  '`----'  /  ,-'   I`.  \\\r\n"
				+ "      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\\r\n"
				+ "     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :\r\n"
				+ "      `._;/7(-.......'  /        ) (     |  |            | |\r\n"
				+ "      `._;l _'--------_/        )-'/     :  |___.    _._./ ;\r\n"
				+ "        | |                 .__ )-'\\  __  \\  \\  I   1   / /\r\n"
				+ "        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /\r\n"
				+ "                           \\__  `-'    __/  `-. `---'',-'\r\n"
				+ "                              )-._.-- (        `-----'\r\n"
				+ "                             )(  l\\ o ('..-.\r\n"
				+ "                       _..--' _'-' '--'.-. |\r\n"
				+ "                __,,-'' _,,-''            \\ \\\r\n"
				+ "               f'. _,,-'                   \\ \\\r\n"
				+ "              ()--  |                       \\ \\\r\n"
				+ "                \\.  |                       /  \\\r\n"
				+ "                  \\ \\                      |._  |\r\n"
				+ "                   \\ \\                     |  ()|\r\n"
				+ "                    \\ \\                     \\  /\r\n"
				+ "                     ) `-.                   | |\r\n"
				+ "                    // .__)                  | |\r\n"
				+ "                 _.//7'                      | |\r\n"
				+ "               '---'                         j_| `\r\n"
				+ "                                            (| |\r\n"
				+ "                                             |  \\\r\n"
				+ "                                             |lllj\r\n"
				+ "                                             |||||  "	
				+ "\n ### GOTTA HAVE A SKELINGTON IN YOUR GAME ### ";
		}
		else if(this.type.equals("GRIPPER ALIEN"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
					"     .;;;.   .;;;.\r\n"
					+ "              .;;;.  `:::'  .;;;.\r\n"
					+ "            .;',:.`;.`;;;'.;'.:.`;.\r\n"
					+ "          .;' .:|:. `;;.;;' .:|:. `;.\r\n"
					+ "         .;'  `:|:'  .;;;.  `:|:'  `;.\r\n"
					+ "         ;;    `:' .;;o o;;. `:'    ;;\r\n"
					+ "         `;;     .;;'_.-._`;;.     ;;'\r\n"
					+ "           `;;..;':. '.-.' .:`;..;;'\r\n"
					+ "              `'   `:.   .:'   `'\r\n"
					+ "                     `;\";'\r\n"
					+ "               .;;;..;: :;..;;;.\r\n"
					+ "             .;'               `;.\r\n"
					+ "            .;'  .;.       .;.  `;.\r\n"
					+ " .;`;.     .;'  .;' `;   ;' `;.  `;.     .;';.\r\n"
					+ " ;  ;`;. .;' .;'    .;   ;.    `;. `;. .;';  ;\r\n"
					+ "  `'`; `;..;'       ;;   ;;       `;..;' ;'`'\r\n"
					+ "   .;'   `;         ;;. .;;         ;'   `;.\r\n"
					+ " .;' ;'.; `;.       ;;;;;;;       .;' ;.`; `;.\r\n"
					+ ";' .-.   `. `;     .;;' ';;.     ;' .'   .-. `;\r\n"
					+ "`:_).'    ( :'    ;;;'   `:::    `: )    `.(_:'\r\n"
					+ "                  `;;     ;;'\r\n"
					+ "                   (;     ;)\r\n"
					+ "                   ;;.    ;;\r\n"
					+ "                   ;;;   ;;;\r\n"
					+ "                   ;;'   `;;\r\n"
					+ "                   ;'     `;\r\n"
					+ "             _____.;       ;._____\r\n"
					+ "             )_.-' /       \\ `-._(\r\n"
					+ "               ).-'         `-.("
					+ "\n ### HE KEEPS TRYING TO GRAB PEOPLE, ITS WEIRD! ###";
		}
		else if(this.type.equals("COWBOY CACTUS"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
			"              _   _\r\n"
			+ "             / '-' \\\r\n"
			+ "            ;       ;\r\n"
			+ "         /'-|       |-'\\\r\n"
			+ "        |   |_______K   |\r\n"
			+ "        \\   '-------'   /\r\n"
			+ "         '.___.....___.'\r\n"
			+ "            | ;  : ;|\r\n"
			+ "           _|;__;__.|_\r\n"
			+ "          |     Y     |    .--.\r\n"
			+ " .--.      \\__.'^'.__/    /;   \\\r\n"
			+ "/   ;\\      |_  ;  _|     |  ' |\r\n"
			+ "| ;  |      { `\"\"\"` }     |;   |\r\n"
			+ "|'   |      {       }     | ;  |\r\n"
			+ "|  ; |      {       }     |    |\r\n"
			+ "|;   |      ;`-.__.'|     |:  ;|\r\n"
			+ "| ;  \\      |;  ;   |_____/ ;  |\r\n"
			+ "|   '.'-----'      ' -_   .'   /\r\n"
			+ "\\  '.   - _  ' ;  ;  _  -    .'\r\n"
			+ " '.   -     - ;  ;   .------`\r\n"
			+ "   `--------.      ;|\r\n"
			+ "            |;  ,   |\r\n"
			+ "            |     ; |\r\n"
			+ "            |. ;    |\r\n"
			+ "            | :    :|\r\n"
			+ "            |   .   |\r\n"
			+ "            |;   ;  |\r\n"
			+ "            |;  ,   |\r\n"
			+ "            |     ; |\r\n"
			+ "            |. ;    |\r\n"
			+ "            | :    :|\r\n"
			+ "            |   .   |\r\n"
			+ "            |;   ;  |\r\n"
			+ "            |;  ,   |\r\n"
			+ "            |     ; |\r\n"
			+ "            |     ; |\r\n"
			+ "            |. ;    |\r\n"
			+ "            | :    :|\r\n"
			+ "            |   .   |\r\n"
			+ "            |;   ;  |\r\n"
			+ "            `\"-----\"`"		
			+ "\n ### ACTUALLY A SUPER SICK GUY, DOESN'T TALK MUCH THOUGH ###";
		}
		else if(this.type.equals("MUSHROOM HOUSE"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
				"        .\r\n"
				+ "        ('\r\n"
				+ "        '|\r\n"
				+ "        |'\r\n"
				+ "       [::]\r\n"
				+ "       [::]   _......_\r\n"
				+ "       [::].-'      _.-`.\r\n"
				+ "       [:.'    .-. '-._.-`.\r\n"
				+ "       [/ /\\   |  \\        `-..\r\n"
				+ "       / / |   `-.'      .-.   `-.\r\n"
				+ "      /  `-'            (   `.    `.\r\n"
				+ "     |           /\\      `-._/      \\\r\n"
				+ "     '    .'\\   /  `.           _.-'|\r\n"
				+ "    /    /  /   \\_.-'        _.':;:/\r\n"
				+ "  .'     \\_/             _.-':;_.-'\r\n"
				+ " /   .-.             _.-' \\;.-'\r\n"
				+ "/   (   \\       _..-'     |\r\n"
				+ "\\    `._/  _..-'    .--.  |\r\n"
				+ " `-.....-'/  _ _  .'    '.|\r\n"
				+ "          | |_|_| |      | \\  (o)\r\n"
				+ "     (o)  | |_|_| |      | | (\\'/)\r\n"
				+ "    (\\'/)/  ''''' |     o|  \\;:;\r\n"
				+ "     :;  |        |      |  |/)\r\n"
				+ "      ;: `-.._    /__..--'\\.' ;:\r\n"
				+ "          :;  `--' :;   :;"	
				+ "\n ### SMASH IT UP!! THE OWNER OWES ME MONEY! ###";
		}
		else if(this.type.equals("MUSHROOM"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
				"                  .-'~~~-.\r\n"
				+ "                     .'o  oOOOo`.\r\n"
				+ "                    :~~~-.oOo   o`.\r\n"
				+ "                     `. \\ ~-.  oOOo.\r\n"
				+ "                       `.; / ~.  OO:\r\n"
				+ "                       .'  ;-- `.o.'\r\n"
				+ "                      ,'  ; ~~--'~\r\n"
				+ "                      ;  ;\r\n"
				+ "_______\\|/__________\\\\;_\\\\//___\\|/________"	
				+ "\n ### I TOLD YOU NOT TO EAT THAT! WHAT DO YOU MEAN MY FACE IS TURNING PURPLE? YO! STOP HITTING ME!!### ";
		}
		else if(this.type.equals("COWBOY"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
					"               ___,\r\n"
					+ "              __)____)__\r\n"
					+ "                -)- )))\r\n"
					+ "        ,       \\=_/ \\__\r\n"
					+ "     __/).          )_/=\\\r\n"
					+ "    /6)   \\      __((_\\_/\\\r\n"
					+ "   /   __/ \\    /_/-\\o____)\r\n"
					+ "  / ,_/|    \\   \\/  ))\\\\\\\\\\\r\n"
					+ "  \\_)o_'     _.-'  ,/:_/_\\\\    ___\r\n"
					+ "       '---`' \\>__/   /\\\\---.,/_  \\\r\n"
					+ "       (      /  /  /\\\\        \\)  \\\r\n"
					+ "       |        ('  \\\\\\        (   /\r\n"
					+ "  _____/         )__\\\\ /       /\\ (\r\n"
					+ " / _______/,_____| |_,(       /  ) )\r\n"
					+ "/ (_     \\  |   _/ o)  \\     /_  |/\r\n"
					+ "\\_ /     ( '| (___/     `.__  /  '\r\n"
					+ "          \\ |        / _/ / _/\r\n"
					+ "           \\(       / /  / /\r\n"
					+ "            )\\     / (  ( <\r\n"
					+ "   	 ,./_(,, ,/_|    \\_/,,._"
					+ "\n ### THIS DUDE CAN EAT A HOTDAWG FASTER THAN HE CAN SHOOT AND HE'S NEVER LOST A DUEL ###";
		}
		else if(this.type.equals("OSTRICH KNIGHT"))
		{
			return "HP: " + this.currentHP + "/" + this.maxHP + "\n" + this.type + "\n" +
					"                                                     _\r\n"
					+ "                                                     //\r\n"
					+ "                           _                        //\r\n"
					+ "                        ,-'_`----,_                //\r\n"
					+ "                       (  _~d~~_/ '~-----,        //\r\n"
					+ "                       (_<_~~~~_,----==='        //\r\n"
					+ "                  __    /  ~~~~=--~~~~          //\r\n"
					+ "                 /  \\   |   /~~                //\r\n"
					+ "                 \\_ |   \\   \\                 //\r\n"
					+ "                 (_ |    \\   \\_              //\r\n"
					+ "                   L|     \\_   \\_           //\r\n"
					+ "                   ||       \\_   \\_        //\r\n"
					+ "               _____U         \\_   \\_     //\r\n"
					+ "              |  __ \\           \\_   \\_  //\r\n"
					+ "              |  \\_\\_|            \\_   \\//\r\n"
					+ "              |______|              \\_ //_\r\n"
					+ "              |_______\\               //  \\\r\n"
					+ "               |  |    \\             //\\   \\\r\n"
					+ "               |  |     \\-_         //  |   \\\r\n"
					+ "               |  '-,_ / / ,-______//   |__  \\\r\n"
					+ "               \\----  '-/_/ /||||_  ~),-   ~--\\\r\n"
					+ "                ~\\_      /-/_'~~~/\\_)/_/       ~\\\r\n"
					+ "           _       \\_   /  / /~~/ /-__ `-/_  ,   |\r\n"
					+ "         _/ ),--,    \\_/  /  | / //   -,__ `/_ | |\r\n"
					+ "        /   ',-, |,_   \\_/  / / //    /   \\  \\// |\r\n"
					+ "       /      _)    )-~~(   |/ /_Z--_/_   /    `/\r\n"
					+ "      |  /    _~) /~    -`--/ /~ \\   \\ ~-/      |\r\n"
					+ "      | /    ' ~,,--,  (   / /`\\__\\_--~~~      |\r\n"
					+ "      \\|        /      )  / /~~              _/\r\n"
					+ "        \\_            / _/ /          \\    _/\r\n"
					+ "          \\          | // /            | _/\r\n"
					+ "           `-__/     |// /            /_-\r\n"
					+ "              `--,__/ / /          __--\r\n"
					+ "                 _-' / /       __--\r\n"
					+ "              _-'   / /    __--\r\n"
					+ "           _-'     / / __-- --___\r\n"
					+ "        _-'   ___-/ /--  ~~~---__`--,___\r\n"
					+ "      _/   __/,--/ /,--,--_____ _~`-----'-----,\r\n"
					+ "   ,-~ __,- _//_/ //__/__/_/_/_//~~~~--r-,.\\  )\r\n"
					+ "  |   /  _/~,/ / /             ~~~~~~~~`-`) | (\r\n"
					+ "  \\_,| ./ ,'  / /                       (~  o  )\r\n"
					+ "  |_,|~|_/   / /                         ) _  /\r\n"
					+ "  (_,|~||   / /                          |/ )/\r\n"
					+ "  (_// /|  / /                           / /\r\n"
					+ "  | | ||  / /                            |/\r\n"
					+ "  / | || / /\r\n"
					+ " /  | ||/ /      \r\n"
					+ "(_ | ,'/ / \r\n"
					+ "( `/ ||\\/              \r\n"
					+ " \\/ | \\_\r\n"
					+ " |  \\_  `_\r\n"
					+ "  \\ ,-,\\,-,`,\r\n"
					+ "   \\_\\_\\\\\\ \\ \\\r\n"
					+ "    ~~~~~~~~~~~"
					+ "\n ### I KNOW YOU ARE JEALOUS OF HIS RIDE, IT'S OKAY, I AM TOO ###";
		}
		else
		{
			return "MONSTER RAN FROM FIGHT,COWARD!";
		}
	}
	
	public void damageMonster(int damage)
	{
		currentHP = currentHP - damage;
		if(currentHP <= 0)
		{
			monsterDefeated = true;
		}
	}
	
	public boolean monsterDefeated()
	{
		return monsterDefeated;
	}
	
}
