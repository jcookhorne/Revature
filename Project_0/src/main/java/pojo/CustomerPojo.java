package pojo;

public class CustomerPojo {
	private int customerId; // link to account customer id
	//information about customer
	private String customerFirstName;
	private String customerLastName;
	private String customerAddress;
	private String customerEmail;
	private String customerPhoneNumber;
	private String customerSocial;

	// check system for well anything/everything
	private boolean check;
	

	public CustomerPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor for entering information for customer pending
	public CustomerPojo(int customerId, String customerFirstName, String customerLastName, String customerAddress,
			String customerEmail, String customerPhoneNumber,
			String customerSocial) {
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerSocial = customerSocial;
		
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumbers) {
		this.customerPhoneNumber = customerPhoneNumbers;
	}

	public String getCustomerSocial() {
		return customerSocial;
	}

	public void setCustomerSocial(String customerSocial) {
		this.customerSocial = customerSocial;
	}


	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}


	@Override
	public String toString() {
		return "CustomerPojo [customerId=" + customerId + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", customerAddress=" + customerAddress
				+ ", customerEmail=" + customerEmail + ", customerPhoneNumber=" + customerPhoneNumber
				+ ", customerSocial=" + customerSocial +"]";
	}



	
	
	
	
	
}
