package fr.beowolfk.project1;

public class Toy {
	private String name;
	private double price; 
	private String description;
	private int promo;
	
	public Toy(String name, double price, String description, int promo) {
		this.name=name;
		this.price=price;
		this.description=description;
		this.promo=promo;
				
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public int getPromo() {
		return promo;
	}

}
