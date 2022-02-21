package service;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import pojo.CustomerPojo;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao customerDao;

	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}
	

	public CustomerPojo creatingAccount(CustomerPojo customerPojo) {
		
		return customerDao.creatingAccount(customerPojo);
	}



	

}
