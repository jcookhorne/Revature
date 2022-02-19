package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pojo.CustomerPojo;
import pojo.EmployeePojo;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public EmployeePojo employeeLogin(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
			String query = "SELECT * FROM employee_details WHERE username= '" + employeePojo.getEmployeeUserName()
					+ "'AND password='" + employeePojo.getEmployeePassword() + "'";
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				System.out.println("You have logged in thank you");
				employeePojo.setCheck(true);
			} else {
				employeePojo.setCheck(false);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	public List<CustomerPojo> customersPending() {
		// TODO Auto-generated method stub
		List<CustomerPojo> allPending = new ArrayList<CustomerPojo>();
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
			String query = "SELECT * FROM customer_pending";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


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

}
