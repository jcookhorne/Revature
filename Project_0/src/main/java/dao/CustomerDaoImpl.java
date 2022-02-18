package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.CustomerPojo;

public class CustomerDaoImpl implements CustomerDao {

	public CustomerPojo creatingAccount(CustomerPojo customerPojo) {
		Connection conn = DBUtil.getConnected();
		
		try {
			Statement st = conn.createStatement();
			System.out.println(customerPojo.getCustomerFirstName());
			String query = "INSERT INTO customer_pending(first_name, last_name, address, email, phone_number, social_security) VALUES('"+customerPojo.getCustomerFirstName()+
					"','" +customerPojo.getCustomerLastName()+"','" +customerPojo.getCustomerAddress()+
					"','" +customerPojo.getCustomerEmail()+"','" +customerPojo.getCustomerPhoneNumber()+
					"','"+customerPojo.getCustomerSocial()+"')";
			int rows = st.executeUpdate(query);
			System.out.println(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerPojo;
	}

	public CustomerPojo allAccountInformation(CustomerPojo custoemrPojo) {
		// TODO Auto-generated method stub
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public CustomerPojo accountDetail(int customerId) {
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public CustomerPojo transfer(int customerId) {
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public CustomerPojo transactionHistory(int customerId) {
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	// step 3 - create a statement and execute it

	// step4 - handle the exception
}
