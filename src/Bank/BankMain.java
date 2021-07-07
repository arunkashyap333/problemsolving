package Bank;

public class BankMain  {
	
	public static void main(String[] args) {
		
		Bank a = new BankA();
		Bank b = new BankB();
		Bank c = new BankC();
		
		a.setDeposit(1000);
		b.setDeposit(1500);
		c.setDeposit(2000);
		
		Bank d = new Bank();
		
		System.out.println("Deposit in BankA : "+ a.getBalance());
		System.out.println("Deposit in BankB : "+ b.getBalance());
		System.out.println("Deposit in BankC : "+ c.getBalance());
	}
}
