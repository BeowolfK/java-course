package fr.beowolfk.project1;

import java.util.Timer;

public class chronometre {
	public static void chrono() {
		Timer chrono = new Timer();
		chrono.schedule(new CustomTimer(), 1000, 1000);
	}


}	
