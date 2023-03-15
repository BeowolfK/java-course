package fr.beowolfk.project1;

public class heritage {
	public static void lesFruits() {
		System.out.println();
		
		Apple a = new Apple();
		a.taste();
		a.getSize();
		a.miam();
		
		pineapple pen = new pineapple();
		pen.taste();
		pen.miam();
		
		strawberry s = new strawberry();
		s.taste();
		s.miam();
		
		if(!(s instanceof peelFruit)) {
			System.out.println("Ce fruit n'implemente pas la méthode peelFruit");
		}
		if(pen instanceof peelFruit) {
			peelFruit fruit = pen;
			System.out.println("Le type de peau est " + fruit.getSkinType());
		}
	}
}
