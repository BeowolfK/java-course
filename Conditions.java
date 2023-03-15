package fr.beowolfk.project1;

public class Conditions {
	public static void If() {
		int money =400;
		if(money >= 5000 && money != 5100) {
			System.out.println("money >=5000 et =!5100");
		} else if(money == 0) {
			System.out.println("money == 0");
		} else {
			System.out.println("money =<5000");
		}
	}
	public static void Switch() {
	int age = 158;														//switch/case pour les conditions multiples
	switch(age) {
		case 15:
			System.out.println("age =15");
		break;
		
		case 16:
			System.out.println("age =16");
		break;
		
		case 17:
			System.out.println("age =17");
		break;
		
		case 18:
			System.out.println("age =18");
		break;

		default: System.out.println("phrase bydef");
			}
	}
}
