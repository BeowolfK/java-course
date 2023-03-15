package fr.beowolfk.project1;

import java.util.Random;
import java.util.TimerTask;

public class CustomTimer extends TimerTask {

	int time = 5;
	int middle = (time/2);
	@Override
	public void run() {
	
		if(time == middle ) {
			System.out.println("Attention, moitié du temps écoulé");
		}
		System.out.println("Time : "+time);
		if(time == 0 ) {
			Random r = new Random();
			int alea =r.nextInt(6-1)+1;
			System.out.println("Valeur du dé : " + alea);
			cancel();
		}
		time --;
		
	}

}
