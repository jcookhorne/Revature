package dao;

import java.util.List;

import pojo.CustomerPojo;
import pojo.EmployeePojo;

public interface EmployeeDao {

	// create Customer account
	CustomerPojo customerRegistration(CustomerPojo customerPojo);

	EmployeePojo employeeInformation(EmployeePojo employeePojo);

	List<CustomerPojo> displayAllCustomers();

	List<CustomerPojo> customersPending();

}
