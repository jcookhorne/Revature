package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojo.CustomerPojo;
import pojo.EmployeePojo;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeedao;
	
	public EmployeeServiceImpl() {
		employeedao = new EmployeeDaoImpl();
	}
	
	@Override
	public EmployeePojo employeeLogin(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		return employeedao.employeeLogin(employeePojo);
	}
	
	@Override
	public CustomerPojo customerRegistration(CustomerPojo customerPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePojo employeeInformation(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerPojo> displayAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerPojo> customersPending() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
