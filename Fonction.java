package fr.beowolfk.project1;

public class Fonction {
	public static void fonctionMain() {
	Tableaux.Tableau();			//ouvrir une fonction d'une autre class:
	sendMessages();				//ouvrir une fonction locale
	sendMessage("test", 420);	//ouvrir une fonction avec des arguments
	sendMessage("test 2", 69);
	
	int money = 850;
	int pricephone = 800;
	boolean hasPhone = false;
	
	sendMessage("La différence est de :", getResultat(money, pricephone, hasPhone));
}

private static void sendMessages() {
	System.out.println("Message dans la console");
}

private static void sendMessage(String message, int number) {							//void -> ne return rien
	System.out.println("Message dans la console : "+ message + " " + number);
}

private static int getResultat(int money, int pricephone, boolean hasPhone) {			//int -> return un int
	if(money >= pricephone && !hasPhone) {
		System.out.println("oui");
	}else {
		System.out.println("non");
	}
return money - pricephone;
}
}
