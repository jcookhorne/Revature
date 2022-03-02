package service;

import exceptions.SystemException;
import pojo.CustomerPojo;

public interface CustomerService {
	

	CustomerPojo creatingAccount(CustomerPojo customerPojo)throws SystemException;

	void exitApplication()throws SystemException;
}
