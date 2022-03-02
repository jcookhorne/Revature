package service;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import exceptions.SystemException;
import pojo.CustomerPojo;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao customerDao;

	public CustomerServiceImpl() {
		customerDao = new CustomerDaoImpl();
	}
	

	public CustomerPojo creatingAccount(CustomerPojo customerPojo)throws SystemException {
		
		return customerDao.creatingAccount(customerPojo);
	}


	@Override
	public void exitApplication() throws SystemException {
		// TODO Auto-generated method stub
		customerDao.exitApplication();
	}



	

}
