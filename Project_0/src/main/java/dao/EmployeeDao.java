package dao;

import java.util.List;

import pojo.CustomerPojo;
import pojo.EmployeePojo;

public interface EmployeeDao {

	// create Customer account
	CustomerPojo customerRegistration(CustomerPojo customerPojo);


	List<CustomerPojo> displayAllCustomers();

	List<CustomerPojo> customersPending();
	
	EmployeePojo employeeLogin(EmployeePojo employeePojo);

}
