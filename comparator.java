package fr.beowolfk.project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class comparator {
	public static void comparator() {
		//cr�ation de la liste
		List<Toy> jouets = new ArrayList<>();
		
		
		jouets.add(new Toy("Loup Garou", 15, "jeu de cartes", 5));
		jouets.add(new Toy("Ozobot Evo", 115, "robot", 15));
		jouets.add(new Toy("Peluche", 10, "doudou", 6));
		jouets.add(new Toy("Lego Collection", 400, "jeu de construction", 8));
		jouets.add(new Toy("Beyblade", 10, "toupie", 5));
		jouets.add(new Toy("Balancoire", 200, "jeu de jardin", 20));
		//Trie la liste par rapport au prix croissant
		Collections.sort(jouets, new priceComparatorUp());
		//afficher les caract�ristique de chacun des jouets
		System.out.println("Prix croissant :");
		System.out.println();
		for(Toy jouet : jouets) {
			System.out.println(jouet.getName() + " - " + jouet.getPrice() +"� - " + jouet.getDescription()+" (promo :"+jouet.getPromo()+"%)");
		}
		System.out.println();
		//Trie la liste par rapport au prix croissant
		Collections.sort(jouets, new priceComparatorDown());
		//afficher les caract�ristique de chacun des jouets
		System.out.println("Prix d�croissant :");
		System.out.println();
		for(Toy jouet : jouets) {
			System.out.println(jouet.getName() + " - " + jouet.getPrice() +"� - " + jouet.getDescription()+" (promo :"+jouet.getPromo()+"%)");
		}
	}
}
