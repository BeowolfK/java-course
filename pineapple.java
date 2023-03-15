package fr.beowolfk.project1;

public class pineapple extends fruit implements peelFruit{
	


	public pineapple() {
		super("ananas");

	}

	@Override
	public void taste() {
		System.out.println("gout acide");
		
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return false;
	}

	@Override
	public String getSkinType() {
		// TODO Auto-generated method stub
		return "piquante";
	}
}
