package oop.exam;

public class Account {
	int balance;
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("잔액 부족");
			return 0;
		}
		balance -= amount;
		return balance;
	}
	
	public void showBalance() {
		System.out.printf("잔고: %d", balance);
	}
}
