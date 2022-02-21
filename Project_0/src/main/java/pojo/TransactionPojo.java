package pojo;

public class TransactionPojo {
	private int transactionId;
	private int fromAccountId;
	private int toAccountId;
	private int transferAmount;
	private String date;
	

	

	public TransactionPojo(int transactionId, int fromAccountId, int toAccountId, 
			int transferAmount, String date) {
		super();
		this.transactionId = transactionId;
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
		this.transferAmount = transferAmount;
		this.date = date;
	}

	public TransactionPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTransaction_id() {
		return transactionId;
	}

	public void setTransaction_id(int transaction_id) {
		this.transactionId = transaction_id;
	}

	public int getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(int fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public int getToAccountId() {
		return toAccountId;
	}

	public void setToAccountId(int toAccountId) {
		this.toAccountId = toAccountId;
	}

	public int getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(int transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
