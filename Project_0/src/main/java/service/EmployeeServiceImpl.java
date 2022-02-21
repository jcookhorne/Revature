package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojo.CustomerPojo;
import pojo.EmployeePojo;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public EmployeePojo employeeLogin(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		return employeeDao.employeeLogin(employeePojo);
	}
	
	@Override
	public CustomerPojo customerRegistration(CustomerPojo customerPojo) {
		// TODO Auto-generated method stub
		return employeeDao.customerRegistration(customerPojo);
	}


	@Override
	public List<CustomerPojo> displayAllCustomers() {
		// TODO Auto-generated method stub
		return employeeDao.displayAllCustomers();
	}

	@Override
	public List<CustomerPojo> customersPending() {
		// TODO Auto-generated method stub
		return employeeDao.customersPending();
	}



	

}
