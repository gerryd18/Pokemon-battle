package main;

public class Pikachu extends Pokemon{
	private String weakness,element;
	private int attack;
	
	public Pikachu(String name, String[] skillAttack, String element, String weakness) {
		super(name, skillAttack, element, weakness);
		this.weakness = "Grass";
		this.element = "Lightning";
	}
	

	public String getWeakness() {
		return weakness;
	}

	public int getAttack(String skillAttack) {
		int attack = 0;
		if (skillAttack.equals("Takle")) {
			attack = 20;
		}else if (skillAttack.equals("Vinewhip")) {
			attack = 30;	
		}else if (skillAttack.equals("Razorleaf")) {
			attack = 40;
		}
		return attack;
	}


	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}


	@Override
	public void attack(Pokemon enemy, String skillAttack) {
		System.out.println(this.getName() + " is attacking " + enemy.getName() + " with " + skillAttack);
		if (enemy.getWeakness().equals(this.element)) {
			
			enemy.damageTaken(this.getAttack(skillAttack)*2);
		}else {
			
			enemy.damageTaken(this.getAttack(skillAttack));
		}
		System.out.println(enemy.getName() + " health now =" +enemy.getHealth());
		System.out.println();
	}

}
