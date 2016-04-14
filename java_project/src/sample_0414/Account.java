package sample_0414;

public class Account {
	private int regNumber;
	private String name;
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance <1000000) this.balance=0;
		this.balance = balance;
	}

}
