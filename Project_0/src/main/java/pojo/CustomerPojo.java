package pojo;

public class CustomerPojo {
	private String customerFirstName;
	private String customerLastName;
	private String customerAddress;
	private String customerUserName; // made not by the customer but by the worker
	private String customerPassword; // made not by the customer but by the worker
	private String customerEmail;
	private String customerPhoneNumber;
	private String customerSocial;
	private int customerId; // link to account customer id

	AccountPojo account = new AccountPojo();

	public CustomerPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerPojo(int customerId, String customerFirstName, String customerLastName, String customerAddress,
			String customerUserName, String customerPassword, String customerEmail, String customerPhoneNumber,
			String customerSocial) {
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerAddress = customerAddress;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
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

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
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

}
