package fr.beowolfk.project1;

public class roleplay {
 public static void jouer(){
		Joueur player1 = new Joueur("Kénan", 20, 300);								
		System.out.println("nom : " + player1.getName());
		System.out.println("vie : " + player1.getHealth());
		System.out.println("attaque : " + player1.getAttack());
		System.out.println();
		Joueur player2 = new Joueur("Kénan", 15, 300);								//On peut passer des parametre au constructeur
		player2.setName("Changement avec le setter");
		System.out.println("nom : " + player2.getName());							
		System.out.println("vie : " + player2.getHealth());
		System.out.println("attaque : " + player2.getAttack());
		System.out.println();
		System.out.println("Prise de dégat :");
		player1.damage(player2.getAttack());
		player2.damage(player1.getAttack());
		System.out.println("nom : " + player1.getName());							
		System.out.println("vie : " + player1.getHealth());
		System.out.println("nom : " + player2.getName());							
		System.out.println("vie : " + player2.getHealth());
 }
}
