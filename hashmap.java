package fr.beowolfk.project1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {
	public static void age() {
		Map<String, Integer> ages = new HashMap<>();
		  //ages.put("Key", VALUE);
			ages.put("Nom1", 18);
			ages.put("Nom2", 55);
			ages.put("Nom3", 27);
			ages.put("Nom4", 156);
			
			System.out.println(ages.toString());
			System.out.println(ages.get("Nom3"));
			
			System.out.println("Suppresion de Nom4 : ");
			ages.remove("Nom4");
			System.out.println(ages.toString());
			
			if(ages.containsValue(18)) {System.out.println("Une personne a 18 ans");} else {System.out.println("Personne n'as 18 ans cette année");}
			
			if(ages.containsKey("Nom4")) {System.out.println("Nom1 a une value de "+ages.get("Nom1")+" ans");} else {System.out.println("Personne ne s'apelle Nom4");}
			
			for(String string : ages.keySet()) {System.out.println(string);}
			
			for(Entry<String, Integer> string : ages.entrySet()) {System.out.println("La clé est : "+string.getKey()+" et la value est : "+string.getValue());}
			
			int moyenne = 0;
			for(Entry<String, Integer> element : ages.entrySet()) {moyenne+=element.getValue();}
			System.out.println("La moyenne d'age est de "+moyenne/ages.size()+" ans.");
			
			System.out.println("Purge de la HashMap : ");
			ages.clear();
			System.out.println(ages.toString());
	}
}
