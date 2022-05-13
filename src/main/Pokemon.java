package main;

public abstract class Pokemon {
	private String name;
	private int health;
	private String[] skillAttack;
	private String element;
	private String weakness;

	public Pokemon(String name, String[] skillAttack, String element, String weakness) {
		this.name = name;
		this.health = 100;
		this.skillAttack = skillAttack;
		this.element = element;
		this.weakness = weakness;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public void damageTaken(int damage) {
		System.out.println(this.getName() + " receive damage " + damage);
		this.health -= damage;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}
	
	public String[] getSkillAttack() {
		return skillAttack;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setSkillAttack(String[] skillAttack) {
		this.skillAttack = skillAttack;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public abstract void attack(Pokemon enemy, String skillAttack);
}
