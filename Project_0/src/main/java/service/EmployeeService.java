package service;

import java.util.List;

import pojo.CustomerPojo;
import pojo.EmployeePojo;

public interface EmployeeService {

	// create Customer account
	CustomerPojo customerRegistration(CustomerPojo customerPojo);

	EmployeePojo employeeInformation(EmployeePojo employeePojo);

	List<CustomerPojo> displayAllCustomers();

	List<CustomerPojo> customersPending();
	
	EmployeePojo employeeLogin(EmployeePojo employeePojo);
	
	
	
}
