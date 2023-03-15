package fr.beowolfk.project1;

public enum enumerator {
	MATIN(8, "reveil"),
	MIDI(12,"repas" ),
	APRESMIDI(15, "devoir"),
	SOIR(22, "film"),
	NUIT(2, "dodo");

	private int hour;
	private String message; 
	
	enumerator(int hour, String message) {
		this.hour=hour;
		this.message = message;
	}
	public int getHour() {
		return hour;
	}
	public String getMessage() {
		return message;
	}
}
