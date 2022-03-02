package dao;

import java.util.List;

import exceptions.NothingPending;
import exceptions.SystemException;
import pojo.CustomerPojo;
import pojo.EmployeePojo;

public interface EmployeeDao {

	// create Customer account
	CustomerPojo customerRegistration(CustomerPojo customerPojo)throws SystemException;


	List<CustomerPojo> displayAllCustomers()throws SystemException;

	List<CustomerPojo> customersPending()throws SystemException, NothingPending;
	
	EmployeePojo employeeLogin(EmployeePojo employeePojo)throws SystemException;
	
	default void exitApplication() throws SystemException{
		DBUtil.closeConnection();
	}
}
