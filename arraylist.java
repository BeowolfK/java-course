package fr.beowolfk.project1;

import java.util.ArrayList;

public class arraylist {
	public static void list() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add((int)(Math.random()*(100+1)));
		list.add((int)(Math.random()*(100+1)));
		list.add((int)(Math.random()*(100+1)));
		list.add((int)(Math.random()*(100+1)));
		list.add((int)(Math.random()*(100+1)));
		list.add(100);
		System.out.println("Index 0 de l'élément en 1ere position :");
		System.out.println(list.get(0));
		int x= (int)(Math.random()*((4+1)));
		System.out.println("Index numéro "+x+" :");
		System.out.println(list.get(x));
		System.out.println("Liste entiere :");
		System.out.println(list);
		System.out.println("Retrait de la valeur en 1ere position :");
		System.out.println(list);
		if(list.contains(0)||list.contains(100)) {
			System.out.println("Retrait des bornes : ");
			list.removeIf(s -> s.equals(0));
			list.removeIf(s -> s.equals(100));
			System.out.println(list);
		}
		System.out.println("Nombre d'élément dans la liste : "+ list.size());
		if(list.size() !=0 ) {
			System.out.println("Purge de la liste : ");
			list.clear();
			System.out.println(list);
		}
	}
}
