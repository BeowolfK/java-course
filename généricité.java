package fr.beowolfk.project1;

public class généricité {
	public static void banque()  {
		//généricité du type pour le symbole de currency (soit char soit string)
		Account<Character> myAccount = new Account<>("Nom1", 100, '€');
		myAccount.showBalance();
		
		Account<String> otherAccount = new Account<>("Nom2", 50, "euros");
		otherAccount.showBalance();
		
		Bank bank = new Bank("Banque de France");
		bank.transfer(otherAccount,myAccount, 25);
		
		myAccount.showBalance();
		otherAccount.showBalance();
	}
}
