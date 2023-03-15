package fr.beowolfk.project1;

public class Bases {
	public static void Print() {
		System.out.println("Hello Word!");								//Afficher un message dans la console
		// Raccourci : sysout + Ctrl+Space
																											//Déclaration de variables
		 /*-----------------------------
		*|	Type 	|	Value			|
		*|----------|-------------------|
		*|	boolean	|	true/false		|
		*|	byte	|	int 0 to 255	|
		*|	short	|	int -/+32768	|
		*|	int		|	int-/+2147483648|
		*|	long	|	int -/+2^63		|
		*|	float	|	32bit floating .|
		*|	double	|	64bit floating .|
		*|	String	|	string of char	|
		*|	char	|	Unicode char	|
		*------------------------------*/
	}
	public static void Variable() {
		String pseudo = "BeowolfK";
		int age = 18;
		System.out.println(pseudo +" " + age);								//Concaténation
		age = age+1;														// Modification de variables
		System.out.println(pseudo +" " + age);
																			//Différente manieres :
		age++;
		System.out.println(pseudo +" " + age);
		age+=10;
		System.out.println(pseudo +" " + age);
	}
}
