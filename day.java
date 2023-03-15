package fr.beowolfk.project1;

public class day {
	public static void enumeration() {
		enumerator moment = enumerator.MIDI;
		System.out.println("Nous somme le "+moment.name().toLowerCase()+", il est "+moment.getHour()+'h'+" il est l'heure du "+moment.getMessage());
		moment = enumerator.SOIR;
		System.out.println("Nous somme le "+moment.name().toLowerCase()+", il est "+moment.getHour()+'h'+" il est l'heure du "+moment.getMessage());
		
		System.out.println();
		
		for(enumerator moment1 : enumerator.values()) {
			if(!(moment1.equals(enumerator.MIDI) || moment1.equals(enumerator.SOIR))){
				System.out.println("Nous somme le "+moment1.name().toLowerCase()+", il est "+moment1.getHour()+'h'+", il est l'heure du "+moment1.getMessage());
			}
		}
	}
}
