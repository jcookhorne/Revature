package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.AccountPojo;
import pojo.CustomerPojo;

public class CustomerDaoImpl implements CustomerDao {

	public CustomerPojo creatingAccount(CustomerPojo customerPojo) {
		Connection conn = DBUtil.getConnected();
		
		try {
			Statement st = conn.createStatement();
			
			AccountPojo account = new AccountPojo();
			String queryBal ="Select start_balance FROM customer_pending WHERE customer_id=" + customerPojo.getCustomerId();
			ResultSet rb = st.executeQuery(queryBal);
			if(rb.next()) {
				int newBal = rb.getInt(1);
				account.setAccountBalance(newBal);
			}
			
			String query = "INSERT INTO customer_pending(first_name, last_name, address, email, phone_number, social_security) VALUES('"+customerPojo.getCustomerFirstName()+
					"','" +customerPojo.getCustomerLastName()+"','" +customerPojo.getCustomerAddress()+
					"','" +customerPojo.getCustomerEmail()+"','" +customerPojo.getCustomerPhoneNumber()+
					"','"+customerPojo.getCustomerSocial()+")";
			int rows = st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerPojo;
	}
	
	
	
	@Override
	public CustomerPojo customerLogin(CustomerPojo customerPojo) {
		// TODO Auto-generated method stub
	Connection conn = DBUtil.getConnected();
		

		try {
			Statement st = conn.createStatement();
			String query = "SELECT * FROM customer_details WHERE username= '" + customerPojo.getCustomerUsername() 
			+ "'AND password='" + customerPojo.getCustomerPassword()+ "'";
			ResultSet rs =st.executeQuery(query);
			if(rs.next()) {
				
				customerPojo.setCheck(true);
			}else {
				customerPojo.setCheck(false);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
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

	

	// step 3 - create a statement and execute it

	// step4 - handle the exception
}
