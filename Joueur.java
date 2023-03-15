package fr.beowolfk.project1;

public class Joueur {

	private String name;
	private double health;
	private double attack;
	
	public Joueur(String string, int i, int j) {
		this.name =  string;
		this.attack = i;
		this.health = j;
	}

	
	public void damage(double damage) {
		this.health -= damage;
	}
	
	public String getName() {					//Pour les getter and setter, on se met sur le nom de la varibale, la fenetre de dialogue s'ouvre, create getter and setter
		return name;
	}

	public void setName(String name) {		
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}
		
}
