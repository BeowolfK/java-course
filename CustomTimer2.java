package fr.beowolfk.project1;

import java.util.Timer;
import java.util.TimerTask;

public class CustomTimer2 {
	private Timer timer;
	private int timeInSec;
	public CustomTimer2() {
		this.timer = new Timer();
		this.timeInSec = 10;
	}
	public void start(TimerListener listener) {
		listener.onStart();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				listener.onRun();
				System.out.println(timeInSec + "s restantes");
				if(timeInSec ==0) {System.out.println("Timer arrivé a 0"); cancel();listener.onStop();}
				timeInSec--;
			}	
		}, 1000, 1000);
	}
}
