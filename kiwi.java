package fr.beowolfk.project1;

public class kiwi extends fruit implements peelFruit {

	public kiwi(String name) {
		super("kiwi");
	}

	@Override
	public void taste() {
		System.out.println("acide");

	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return true;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
