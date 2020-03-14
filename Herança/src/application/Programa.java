package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programa {

	public static void main(String[] args) {
	
		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
        
	
		// UPCASTING - pegar um objeto do tipo BusinessAccount e atribui-lo a uma variavel do tipo Account
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING - converter um objeto da superclasse para a subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2; // Casting manual - mostrar entre parenteses o tipo da conta
		acc4.loan(100.00); 
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		// METODO SOBREPOSTO
		
		Account acc6 = new Account(1006, "Lucas", 100.00);
		acc6.withdraw(10.00);
		
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1007, "suamae", 100.00, 0.01);
		acc7.withdraw(5.0);
		
		System.out.println(acc7.getBalance());
		
		// REUTILIZANDO METODO USANDO O SUPER
		
		Account acc8 = new BusinessAccount(1008, "suatia", 500.00, 200.00);
		
		acc8.withdraw(100.00);
		System.out.println(acc8.getBalance());
	}
	
	

}
