package textBookQuiz;

public class Account {
	private String owner;// 계좌주
	private int balance;// 잔액
	
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}






