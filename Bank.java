package fr.beowolfk.project1;

public class Bank {
	private String name;
	public Bank(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public <T, S> S transfer(Account<T> sourceAccount, Account<S> targetAccount, int amount) {
		if(sourceAccount.getAmount()>= amount) {
			sourceAccount.removeMoney(amount);
			targetAccount.addMoney(amount);
			System.out.println(sourceAccount.getOwner() + " a envoyé " + amount + " "+sourceAccount.getCurrency() + " a " + targetAccount.getOwner());			
		}
		else {
			System.err.println("transaction impossible ! " + sourceAccount.getOwner() +" n'as pas les fonds necessaire");
		}
		return targetAccount.getCurrency();
	}
}
