package access;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(10000);
		account.withdraw(5000);
		System.out.printf("balance : %d\n", account.getBalance());
		account.deposit(-1000);
		account.withdraw(10000);
	}
}
