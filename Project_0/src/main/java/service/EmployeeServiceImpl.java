package service;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import exceptions.NothingPending;
import exceptions.SystemException;
import pojo.CustomerPojo;
import pojo.EmployeePojo;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public EmployeePojo employeeLogin(EmployeePojo employeePojo)throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.employeeLogin(employeePojo);
	}
	
	@Override
	public CustomerPojo customerRegistration(CustomerPojo customerPojo)throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.customerRegistration(customerPojo);
	}


	@Override
	public List<CustomerPojo> displayAllCustomers()throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.displayAllCustomers();
	}

	@Override
	public List<CustomerPojo> customersPending()throws SystemException, NothingPending {
		// TODO Auto-generated method stub
		return employeeDao.customersPending();
	}

	@Override
	public void exitApplication() throws SystemException {
		// TODO Auto-generated method stub
		employeeDao.exitApplication();
	}



	

}
