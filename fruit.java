package fr.beowolfk.project1;

public abstract class fruit {
	
	
	private String name;
	
	public fruit(String name) {
		this.name = name;
	}

	public abstract void taste();
	
	public abstract int getSize();
	
	public abstract boolean hasSeed();
	
	public void miam() {
		System.out.println("Manger "+getSize()+" fruits et légume par jour / Nom du fruit : " + getName());
	}
	
	public String getName() {
		return name;
	}
}
