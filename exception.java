package fr.beowolfk.project1;

public class exception {
	public static void except() throws NoMoneyException {
		int[] numbers= {4,7,9,1};
		@SuppressWarnings("unused")
		int calcul = 5+1;
		try {
			System.out.println(numbers[(int)(Math.random()*((4+1)))]);
			calcul /=0;
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException  e) {
			e.printStackTrace();
			System.out.println("Error is here");
		} finally {
			System.out.println("	Code toujours executé, erreur ou pas");
			System.out.println();
		}
		
		double balance = 5000;
		double price = 5200;
		
		try {
			buy(balance, price);
		} catch (NoMoneyException e) {		
			e.printStackTrace();
		}
	}
		
		
//		try {
//			buy(balance, price);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}

	// public static void buy(double balance, double price) throws Exception {
		//	if(b>0) {
		//	throw new Exception();
		//}
	//}
	
	public static void buy(double balance, double price) throws NoMoneyException {
		double b = balance - price;
		if(b < 0) {								//Exception personnalisé :
			throw new NoMoneyException();		//create class 'NoMoneyException'
		}
		System.out.println(b);
	}
}
