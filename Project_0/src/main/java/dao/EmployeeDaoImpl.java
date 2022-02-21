package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojo.AccountPojo;
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
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next()) {
				CustomerPojo pending = new CustomerPojo(rs.getInt(1),
						rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7));
				allPending.add(pending);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allPending;
	}

	public CustomerPojo customerRegistration(CustomerPojo customerPojo) {
		Connection conn = DBUtil.getConnected();
		// checking if its approve or deny
		if (customerPojo.isCheck() == true) {
			try {
				
				Statement st = conn.createStatement();
				// Transferring from pending to customer details ------ one table to the next
				String query = "INSERT INTO customer_details (first_name, last_name, address, email, phone_number, social_security)"
						+ "SELECT first_name, last_name, address, email, phone_number, social_security FROM customer_pending "
						+ "WHERE customer_id= " + customerPojo.getCustomerId();
				int rows = st.executeUpdate(query);
				
				String query2 = "DELETE FROM customer_pending WHERE customer_id= " + customerPojo.getCustomerId();
				int delete = st.executeUpdate(query2);
				// creating new customerId that belongs to customer_details table
				ResultSet rs = st.executeQuery("SELECT MAX(customer_id) AS last_Id FROM customer_details");
				if (rs.next()) {
					int rows2 = rs.getInt("last_Id");
				
				customerPojo.setCustomerId(rows2);
				}
				// using new customerId as the key to update table and add in employee
				// set up username and password for current customer
				String query3 = "UPDATE customer_details SET username='" + customerPojo.getCustomerUsername()
						+ "' WHERE customer_id="+ customerPojo.getCustomerId();
				int rows3 = st.executeUpdate(query3);
				String queryPass = "UPDATE customer_details SET password='" + customerPojo.getCustomerPassword()
				+ "' WHERE customer_id="+ customerPojo.getCustomerId();
				int rowP = st.executeUpdate(queryPass);
				
				//System.out.println(customerPojo.getCustomerFirstName());
				// removing data from customerPending because they are not pending anymore
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (customerPojo.isCheck() == false) {
			// String query =
			try {
				Statement st = conn.createStatement();
				String query = "DELETE FROM customer_pending WHERE customer_id= " + customerPojo.getCustomerId();
				int rows = st.executeUpdate(query);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}


	public List<CustomerPojo> displayAllCustomers() {
		Connection conn = DBUtil.getConnected();
		List<CustomerPojo> listCust = new ArrayList<CustomerPojo>();
		
		try {
			Statement st = conn.createStatement();
			String query  = "SELECT * FROM customer_details";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				CustomerPojo allcust = new CustomerPojo(rs.getInt(1),
						rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), 
						rs.getString(6), rs.getString(7), 
						rs.getString(8), rs.getString(9));
				
				listCust.add(allcust);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listCust;
	}

}
