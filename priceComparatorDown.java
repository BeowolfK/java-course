package fr.beowolfk.project1;

import java.util.Comparator;
	public class priceComparatorDown implements Comparator<Toy>{
		@Override
		public int compare(Toy toy1, Toy toy2) {
			//if(toy1.getPrice() < toy2.getPrice()) {return -1;} else {return 1;}
			if(toy1.getPrice() == toy2.getPrice()) {
				//return toy1.getName().compareTo(toy2.getName()); 		//Trie par ordre alphabetique
				return toy2.getPromo() - toy1.getPromo();
			}
			return (int) (toy2.getPrice() - toy1.getPrice());
		}
}
