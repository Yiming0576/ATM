package atm;

public class Account {
	
	
	private String name;
	private String password;
	private double balance;
	private double dailyLimit;
	private String CardId;

	public String getName() {
		return name;
	}

	public String getCardId() {
		return CardId;
	}

	public void setCardId(String cardId) {
		this.CardId = cardId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getdailyLimit() {
		return dailyLimit;
	}

	public void setdailyLimit(double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

}
