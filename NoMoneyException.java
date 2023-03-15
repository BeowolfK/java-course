package fr.beowolfk.project1;

public class NoMoneyException extends Exception {		//add default serial version ID
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NoMoneyException() {
		super("Attention, la balance ne peut pas etre négative");
	}

}
