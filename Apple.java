package fr.beowolfk.project1;

public class Apple extends fruit implements peelFruit{			//add uniplemented method
//public class A extends B					// déclarée dans le fichier B.java

	public Apple() {
		super("pomme");
	}
	
	@Override
	public void taste() {
		System.out.println("gout sucré");
		
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
		return false;
	}

	@Override
	public String getSkinType() {
		return "lisse";
	}

}
