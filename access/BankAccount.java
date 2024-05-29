package access;

public class BankAccount { // 캡슐화
	private int balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	// 사용자가 써야 할 기능은 public
	public void deposit(int amount) {
		if (isAmountValid(amount)) {
			balance += amount;
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}
	
	public void withdraw(int amount) {
		if(isAmountValid(amount) && balance - amount >= 0) {
			balance -= amount;
		} else {
			System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	// 사용자가 접근하지 못하게 막거나 감춰야 할 기능은 private
	private boolean isAmountValid(int amount) {
		return amount > 0;
	}
}
