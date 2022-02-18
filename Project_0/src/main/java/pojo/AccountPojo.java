package pojo;

public class AccountPojo {
	private int accoutId;
	private String accountName;
	private int accountBalance;
	private int accountCustomerId; // link to customer id

	public AccountPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountPojo(int accoutId, String accountName, int accountBalance, int accountCustomerId) {
		super();
		this.accoutId = accoutId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.accountCustomerId = accountCustomerId;

	}

	public int getAccoutId() {
		return accoutId;
	}

	public void setAccoutId(int accoutId) {
		this.accoutId = accoutId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountCustomerId() {
		return accountCustomerId;
	}

	public void setAccountCustomerId(int accountCustomerId) {
		this.accountCustomerId = accountCustomerId;
	}

}
