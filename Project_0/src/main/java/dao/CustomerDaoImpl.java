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
			
			String query = "INSERT INTO customer_pending(first_name, last_name, address, email, phone_number, social_security) VALUES('"+customerPojo.getCustomerFirstName()+
					"','" +customerPojo.getCustomerLastName()+"','" +customerPojo.getCustomerAddress()+
					"','" +customerPojo.getCustomerEmail()+"','" +customerPojo.getCustomerPhoneNumber()+
					"','"+customerPojo.getCustomerSocial()+"')";
			int rows = st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerPojo;
	}
	
	

	

	// step 3 - create a statement and execute it

	// step4 - handle the exception
}
