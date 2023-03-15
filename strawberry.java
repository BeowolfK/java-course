package fr.beowolfk.project1;

public class strawberry extends fruit {

	public strawberry() {
		super("fraise");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		System.out.println("sucré");

	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

}
