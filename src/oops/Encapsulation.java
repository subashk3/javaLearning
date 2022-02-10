package oops;

public class Encapsulation {// banking process

	private int deposit;
	private int minbalance = 1000;
	int balance = 0;

	// check only user
	public int getMinbalance() {
		return minbalance;
	}

	// only set bank officers
	private void setMinbalance(int minbalance) {
		this.minbalance = minbalance;
	}

	// User can add deposit Monye
	public void setDeposit(int deposit) {

		this.deposit = deposit;
		balance += deposit;
	}

	// Get balance from bank
	public int getBalance() {
		return balance;
	}
}
