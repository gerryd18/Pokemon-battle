package main;

import java.util.Scanner;

public class Main {
Scanner sc = new Scanner(System.in);

	public int validateNumber() {
		int temp = 0;
		
		try {
			temp =sc.nextInt();sc.nextLine();
		} catch (Exception e) {
			System.out.println("Input must be integer!");
			sc.nextLine();
		}
		return temp;
	}


	public Main() {
		String name,gender;
		int age;
		
		//no1 ============================================================================================
		do {
			System.out.println("Input your name [>5 character] : ");
			name = sc.nextLine();
		} while (name.length()<5);
		
		do {
			System.out.println("Input gender [Male|Female]: ");
			gender = sc.nextLine();
		} while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")));
		
		do {
			System.out.println("Input age [min 13 years old]: ");
			age = validateNumber();
		} while (age<13);
		
		
		//no2 ============================================================================================
		
		int choose;
		do {			
			System.out.println("Welcome to Pokemon Battle!");
			System.out.println("==========================");
			System.out.println("1.Profile");
			System.out.println("2.Battle");
			System.out.println("3.Exit");
			System.out.print("Choose> ");
			choose = validateNumber();
			
			switch (choose) {
			case 1:
				profile(name,gender,age);
				break;
			case 2:
				battle();
				break;
			case 3:
				//no6 ============================================================================================
				System.out.println("thankyou for playing pokemon battle!!");
				System.exit(0);
				break;
			}
		} while (choose!=3);
	}
	
	
	public void profile(String name, String gender, int age) {
		//no3 ============================================================================================
		System.out.println("Your Profile");
		System.out.println("==============================");
		System.out.println("Name    : " + name);
		System.out.println("Gender  : " + gender);
		System.out.println("Age     : " + age);
		System.out.println("==============================");
		System.out.println("press enter to continue...");
		sc.nextLine();
	}
	
	public void battle() {
		
		//no4a ============================================================================================
		int choose;
		Pokemon pokemonUser = null;
		Pokemon pokemonEnemy = null;
		
		do {			
			System.out.println("Choose Your Pokemon : ");
			System.out.println("1.Charmander");
			System.out.println("2.Squirtle");
			System.out.println("3.Bulbasaur");
			System.out.println("4.Pikachu");
			System.out.println("Choose > ");
			choose = validateNumber();
		} while (choose<1 || choose>4);
		
		
		//pokemonUser
		String pokemonName;
		String element, weakness;
		String[]skillAttack = new String[3];
		
		if (choose == 1) {
			pokemonName = "Charmander";
			skillAttack[0] = "Takle";
			skillAttack[1] = "Burst";
			skillAttack[2] = "Flamethrower";
			element = "Fire";
			weakness = "Water";
			 pokemonUser = new Charmander(pokemonName,skillAttack,element,weakness);			
		}else if (choose == 2) {
			pokemonName = "Squirtle";
			skillAttack[0] = "Takle";
			skillAttack[1] = "Waterball";
			skillAttack[2] = "Watercanon";
			element = "Water";
			weakness = "Lightning";
			  pokemonUser = new Squirtle(pokemonName, skillAttack,element,weakness);
			
		}else if (choose == 3) {
			pokemonName = "Bulbasaur";
			skillAttack[0] = "Takle";
			skillAttack[1] = "Vinewhip";
			skillAttack[2] = "Razorleaf";
			element = "Grass";
			weakness = "Fire";
			 pokemonUser = new Bulbasaur(pokemonName,skillAttack,element,weakness);
			
		}else if (choose == 4) {
			pokemonName = "Pikachu";
			skillAttack[0] = "Takle";
			skillAttack[1] = "Vinewhip";
			skillAttack[2] = "Razorleaf";
			element = "Lightning";
			weakness = "Grass";
			 pokemonUser = new Pikachu(pokemonName,skillAttack,element,weakness);
		}
	
		
		//pokemonEnemy
		int random = (int) (Math.round(Math.random()*(4-1))+1);//random  1-4
		String enemySkillAttack[] = new String[3];
		String enemyElement, enemyWeakness;
		
		if (random == 1) {
			pokemonName = "Charmander";
			enemySkillAttack[0] = "Takle";
			enemySkillAttack[1] = "Burst";
			enemySkillAttack[2] = "Flamethrower";
			enemyElement = "Fire";
			enemyWeakness = "Water";
			pokemonEnemy = new Charmander(pokemonName,enemySkillAttack,enemyElement, enemyWeakness);
		
		}else if (random == 2) {
			pokemonName = "Squirtle";
			enemySkillAttack[0] = "Takle";
			enemySkillAttack[1] = "Waterball";
			enemySkillAttack[2] = "Watercanon";
			enemyElement = "Water";
			enemyWeakness = "Lightning";
			 pokemonEnemy = new Squirtle(pokemonName,enemySkillAttack,enemyElement, enemyWeakness);
		
		}else if (random == 3) {
			pokemonName = "Bulbasaur";
			enemySkillAttack[0] = "Takle";
			enemySkillAttack[1] = "Vinewhip";
			enemySkillAttack[2] = "Razorleaf";
			enemyElement = "Grass";
			enemyWeakness = "Fire";
			 pokemonEnemy = new Bulbasaur(pokemonName,enemySkillAttack,enemyElement, enemyWeakness);
		
		}else if (random == 4) {
			pokemonName = "Pikachu";
			enemySkillAttack[0] = "Takle";
			enemySkillAttack[1] = "Vinewhip";
			enemySkillAttack[2] = "Razorleaf";
			enemyElement = "lightning";
			enemyWeakness = "Grass";
			 pokemonEnemy = new Pikachu(pokemonName,enemySkillAttack,enemyElement, enemyWeakness);
		}
		
		
		//no4b ============================================================================================
		System.out.println("Information");
		System.out.println("=======================");
		System.out.println("Your pokemon name : " + pokemonUser.getName());
		
		if (pokemonUser instanceof Charmander) {	
			System.out.println("Your pokemon skills and skills point : [Tackle = 20SP|Burst = 30SP|Flamethrower = 40SP]");
		}else
			if (pokemonUser instanceof Bulbasaur) {
			System.out.println("Your pokemon skills and skills point : [Tackle = 20SP|Vinewhip = 30SP|Razorleaf = 40SP]");
		}else
			if (pokemonUser instanceof Squirtle) {
			System.out.println("Your pokemon skills and skills point : [Tackle = 20SP|Waterball = 30SP|Watercanon = 40SP]");
		}else
			if (pokemonUser instanceof Pikachu) {
			System.out.println("Your pokemon skills and skills point : [Tackle = 20SP|Vinewhip = 30SP|Razorleaf = 40SP]");
		}
		
		System.out.println("Your pokemon health : " + pokemonUser.getHealth());
		System.out.println();
		System.out.println("Enemy pokemon : " + pokemonEnemy.getName());
		System.out.println("Enemy pokemon health : " + pokemonEnemy.getHealth());
		
		System.out.println("Press enter if you are ready for the battle!!");
		sc.nextLine();
		
		
		//no5 ============================================================================================
		int chooseSkill;
		do {
			System.out.println("Choose skill to attack enemy : ");
			System.out.println("1." + pokemonUser.getSkillAttack()[0]);
			System.out.println("2." + pokemonUser.getSkillAttack()[1]);
			System.out.println("3." + pokemonUser.getSkillAttack()[2]);
			chooseSkill = validateNumber();
			
			//pokemon user attacks enemy
			pokemonUser.attack(pokemonEnemy,pokemonUser.getSkillAttack()[chooseSkill-1]);// (enemy, skillAttack)
			
			//enemy attacks user
			int randomSkill = (int) (Math.round(Math.random()*(3-1))+1);//random between 1-3
			
			pokemonEnemy.attack(pokemonUser, pokemonEnemy.getSkillAttack()[randomSkill-1]);//attack with random skill
			
			
			//win condition
			if (pokemonEnemy.getHealth()>0) {
	
				if (pokemonUser.getHealth()>0) {
					chooseSkill = -1;
				}else if(pokemonUser.getHealth()<0){
					System.out.println(pokemonEnemy.getName() + " Win!!");
					System.out.println();
					return;
				}
			}else if(pokemonEnemy.getHealth()<0){
				System.out.println(pokemonUser.getName() + " Win!!");
				System.out.println();
				return;
			}
			
			
		} while ((chooseSkill<1 || chooseSkill>3));
		
	}
	

	public static void main(String[] args) {
		
		new Main();
	
	}

}
