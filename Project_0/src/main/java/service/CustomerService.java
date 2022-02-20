package service;

import pojo.CustomerPojo;

public interface CustomerService {
	CustomerPojo allAccountInformation(CustomerPojo customerPojo);

	CustomerPojo accountDetail(int customerId);

	CustomerPojo creatingAccount(CustomerPojo customerPojo);

	CustomerPojo customerLogin(CustomerPojo customerPojo);
}
