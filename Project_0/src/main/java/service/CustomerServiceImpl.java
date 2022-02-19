package service;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import pojo.CustomerPojo;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao customerDao;
	
	@Override
	public CustomerPojo customerLogin(CustomerPojo customerPojo) {
		// TODO Auto-generated method stub
		return customerDao.customerLogin(customerPojo);
	}

	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}

	public CustomerPojo allAccountInformation(CustomerPojo custoemrPojo) {
		// TODO Auto-generated method stub
		return customerDao.allAccountInformation(custoemrPojo);
	}

	public CustomerPojo accountDetail(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.accountDetail( customerId);
	}

	public CustomerPojo transfer(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.transfer(customerId);
	}

	public CustomerPojo transactionHistory(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.transactionHistory(customerId);
	}

	public CustomerPojo creatingAccount(CustomerPojo customerPojo) {
		
		return customerDao.creatingAccount(customerPojo);
	}

	

}
