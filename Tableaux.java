package fr.beowolfk.project1;

public class Tableaux {
	public static void Liste() { 
		int[] number = {17, 123, 42};
		int calcul = ( number[0] + number[1]  +number[2] ) / number.length;	//length pour le nombre d'élément dans le tableau
		System.out.println(calcul); 										//Les tableaux commence a l'index 0
		};
	
	public static void Tableau() {
		//Tableaux dans des tableaux:
		int[][] numbers = {													//int[][], 2tableaux, plus on met de [], plus on met de tableaux a l'interieur de tableau
				{
					5, 7, 8
				},
				{
					3,2,1
				},
				{
					9,4,2
				}
			};
		System.out.println(numbers[2][1]);									//on recupere les valeur en 2,1 (sans oublier que l'index est a 1 donc 3eme ligne 2 eme colonne) 
	}
	public static void Phrase() {
		String nom = "Nom1, Nom2, Nom3, Nom4";
		String[] nom_tableau = nom.split(", ");								// Transformer une phrase en liste grace a des séparateur
		System.out.println(nom_tableau[0]);
	}
}
