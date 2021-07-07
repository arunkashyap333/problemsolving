package banking;

public class BankDemo {

	private Bank getBank(String identifier) {
		Bank bank = null;
		switch (identifier.toUpperCase()) {
		case "ICICI":
			bank = new Icici();
			return bank;
		case "SBI":
			bank = new Sbi();
			return bank;
		case "HDFC":
			bank = new Hdfc();
			return bank;
		default:
			System.out.println("Please enter correct bank name");
			break;
		}
		
		return bank;
	}
	public static void main(String[] args) {
		BankDemo bd = new BankDemo();
		String bankName = "sbI";
		Bank bank = bd.getBank(bankName);
		if(bank!=null) {
			System.out.println(bank.rateOfInterest());
		}
	}
}
