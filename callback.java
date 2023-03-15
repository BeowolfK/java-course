package fr.beowolfk.project1;

public class callback {
	public static void callback(){
		substract(10,7, new CalculListener() {

			@Override
			public void onPositiveResult() {
				System.out.println("positif");
				
			}

			@Override
			public void onNegativeResult() {
				System.out.println("négatif");
				
			}
			
		});
		
	}

	private static void substract(int a, int b, CalculListener listener) {
		int result = a - b; 
		System.out.println(a +"-"+b+"="+result);
		
		if(result>0) {System.out.print("Le résultat est ");listener.onPositiveResult();}else{System.out.print("Le resultat est ");listener.onNegativeResult();}
	}
	
	public static void timer(){
		CustomTimer2 timer = new CustomTimer2();
		timer.start(new TimerListener() {

			@Override
			public void onStart() {
				System.out.println("Lancement du chronometre");
			}

			@Override
			public void onRun() {
				System.out.println("Loading...");
			}

			@Override
			public void onStop() {
				System.out.println("Chonometre terminé");
			}
			
		});
	}
}
	
