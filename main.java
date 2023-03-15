package fr.beowolfk.project1;
import java.util.InputMismatchException;
import java.util.Scanner;  // Import the Scanner class

class main {
	public static void main(String[] args)  {
		// comparator.comparator();
		   boolean x = true;
			do {
				try {
					Scanner myObj = new Scanner(System.in);
					System.out.print("Nombre : ");
					int nombre = myObj.nextInt(); 
					System.out.println("le nombre est de: " + nombre);
					x=false;
				} catch(InputMismatchException  e) {
					System.out.println("Vous ne pouvze pas entrer autre chose que des chiffres");
				}
			} while (x);
	}
}
