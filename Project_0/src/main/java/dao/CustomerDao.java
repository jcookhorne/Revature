package dao;

import pojo.CustomerPojo;

public interface CustomerDao {
	// read account info ( balance of accounts)
	CustomerPojo allAccountInformation(CustomerPojo customerPojo);

	CustomerPojo accountDetail(int customerId);

	CustomerPojo transfer(int customerId);

	CustomerPojo transactionHistory(int customerId);
	
	CustomerPojo creatingAccount(CustomerPojo customerPojo);

	CustomerPojo customerLogin(CustomerPojo customerPojo);
}
