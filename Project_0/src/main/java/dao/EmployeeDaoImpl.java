package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import pojo.CustomerPojo;
import pojo.EmployeePojo;

public class EmployeeDaoImpl implements EmployeeDao {

	public CustomerPojo customerRegistration(CustomerPojo customerPojo) {
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
			String query = "INSERT INTO customer_details FROM customer_pending SELECT * WHERE customer_id=";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public EmployeePojo employeeInformation(EmployeePojo employeePojo) {
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<CustomerPojo> displayAllCustomers() {
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<CustomerPojo> customersPending() {
		// TODO Auto-generated method stub
		return null;
	}

}
