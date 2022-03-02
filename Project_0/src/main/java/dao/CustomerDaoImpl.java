package dao;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exceptions.SystemException;

import pojo.CustomerPojo;

public class CustomerDaoImpl implements CustomerDao {
	public static final Logger LOG = LogManager.getLogger(CustomerDaoImpl.class);

	public CustomerPojo creatingAccount(CustomerPojo customerPojo) throws SystemException {
		LOG.info("Entered creatingAccount() in CustomerDao");
		Connection conn = DBUtil.getConnected();

		try {
			Statement st = conn.createStatement();

			String query = "INSERT INTO customer_pending(first_name, last_name, address, email, phone_number, social_security) VALUES('"
					+ customerPojo.getCustomerFirstName() + "','" + customerPojo.getCustomerLastName() + "','"
					+ customerPojo.getCustomerAddress() + "','" + customerPojo.getCustomerEmail() + "','"
					+ customerPojo.getCustomerPhoneNumber() + "','" + customerPojo.getCustomerSocial() + "')";
			int rows = st.executeUpdate(query);
		} catch (SQLException e) {
			throw new SystemException();
		}
		LOG.info("Exited creatingAccount() in CustomerDao");
		return customerPojo;
	}

	// step 3 - create a statement and execute it

	// step4 - handle the exception
}
