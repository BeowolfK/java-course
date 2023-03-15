package fr.beowolfk.project1;

public class Player {
	 private String name;
	 private double health;
	 
	 //Surcharge des contructeurs Player car redondance
	 public Player(String name, double health) {
		 this.name = name;
		 this.health = health;
	 }

	public Player(String name) {
		this.name = name;
		this.health = 500;
	}

	public String getName() {
		return name;
	}

	public double getHealth() {
		return health;
	}
	
	//Surcharge des contructeurs sendMessage car redondance
	public void sendMessage() {
		sendMessage("Vous avez "+health+" points de vie !");
	}
	public void sendMessage(String message) {
		System.out.println(name + " : " + message);
	}
	 
}
