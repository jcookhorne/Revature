package pojo;

public class AccountPojo {
	private int accountId;
	private String accountName;
	private String accountName2;
	private int accountBalance;
	private int accountCustomerId; // link to customer id
	private String accountUsername;
	private String accountPassword;
	
	
	
	
	
	
	public AccountPojo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AccountPojo(int accountId, String accountName, String accountName2, int accountBalance,
			int accountCustomerId, String accountUsername, String accountPassword) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountName2 = accountName2;
		this.accountBalance = accountBalance;
		this.accountCustomerId = accountCustomerId;
		this.accountUsername = accountUsername;
		this.accountPassword = accountPassword;
	}



	public int getAccountId() {
		return accountId;
	}

	public void setAccoutId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountName2() {
		return accountName2;
	}

	public void setAccountName2(String accountName2) {
		this.accountName2 = accountName2;
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



	public String getAccountUsername() {
		return accountUsername;
	}

	public void setAccountUsername(String accountUsername) {
		this.accountUsername = accountUsername;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}



	@Override
	public String toString() {
		return "AccountPojo [accountName=" + accountName + ", accountName2=" + accountName2 + ", accountBalance="
				+ accountBalance + "]";
	}
	
	

}
