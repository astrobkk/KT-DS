package workshop04;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		
	}
	
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return (double)this.balance * (double)this.interestRate / 100.0;
	}
	
	public String getAccount() {
		return this.account;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		if(money > this.balance) {
			System.out.println("출금 할 수 없습니다.");
		}else {
			this.balance -= money;
		}
	}
	
	
	
	
}
