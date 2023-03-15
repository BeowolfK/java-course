package fr.beowolfk.project1;

public class Boucle {

	public static void For() {
																				//Boucles For:
		//for(;;) {														//Boucle For infini
		for(int i=0; i<=100; i++){
			System.out.println("Tour de boucle num�ro "+i);
		};
	}
	public static void ForEach() {
		int[] notes = {4,8,9,12,2};														//Boucles For each
		int calcul=0;
		for(int note : notes){
			calcul = calcul + note;											// ou calcul += note
			System.out.println(note);
		};
		System.out.println("La moyenne est de " + (calcul / notes.length));
		}
	public static void While() {
																						//Boucle While
		int i = 0;
		//while(true){														//Boucle While infini
		while(i != 10) {
			System.out.println("It�ration de rang : "+i);
		i++;
		}
		}
	public static void DoWhile() {
																						//Boucle Do While (toujours une it�ration pui test de la condition du while, donc meme qd faux, une it�ration est produite)
		int j = 0;
		do {
			System.out.println("Text toujours print");
		} while(j>=10);
	}
}