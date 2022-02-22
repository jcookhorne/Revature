package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exceptions.SystemException;
import pojo.AccountPojo;
import pojo.TransactionPojo;

public class TransactionDaoImpl implements TransactionDao {

	public static final Logger LOG = LogManager.getLogger(TransactionDaoImpl.class);

	@Override
	public TransactionPojo transfer(TransactionPojo transactionPojo) throws SystemException {
		// TODO Auto-generated method stub
		LOG.info("Entered transfer() in Transaction DAO");

		Connection conn = DBUtil.getConnected();
		try {
			Statement st = conn.createStatement();

			// CHeckings check
			if (transactionPojo.isCheck() == false) {
				// Minimum will always be the first account or aka AccountName
				ResultSet res = st
						.executeQuery("SELECT MIN(account_id) AS checkings FROM account_details WHERE username='"
								+ transactionPojo.getTranUsername() + "'AND password='"
								+ transactionPojo.getTranPassword() + "'");
				if (res.next()) {
					int checkAccountId = res.getInt("checkings");
					transactionPojo.setFromAccountId(checkAccountId);
				}
				ResultSet res1 = st
						.executeQuery("SELECT MAX(account_id) AS toSavings FROM account_details WHERE username='"
								+ transactionPojo.getTranUsername() + "'AND password='"
								+ transactionPojo.getTranPassword() + "'");
				if (res1.next()) {
					int toSavingsId = res1.getInt("toSavings");
					transactionPojo.setToAccountId(toSavingsId);
				}
				ResultSet res2 = st.executeQuery("SELECT account_balance FROM account_details WHERE account_id="
						+ transactionPojo.getFromAccountId());
				if (res2.next()) {
					int oldBalance = res2.getInt(1);
					int newBalance = oldBalance - transactionPojo.getTransferAmount();
					String query = "UPDATE account_details SET account_balance =" + newBalance
							+ "WHERE account_id=" + transactionPojo.getFromAccountId();
					int res3 = st.executeUpdate(query);

				}
				conn.setAutoCommit(false);
				ResultSet res4 = st.executeQuery(
						"INSERT INTO transaction_details (from_account_id, to_account_id, transfer_amount)" + "VALUES ("
								+ transactionPojo.getFromAccountId() + "," + transactionPojo.getToAccountId() + ","
								+ transactionPojo.getTransferAmount() + ")");
				conn.commit();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
					
					try {
						conn.rollback();
						System.out.print("Transaction is being rolled back ");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						//throw new SystemException();
					}
					}
					

		try {
			// Savings check
			if (transactionPojo.isCheck() == true) {
				// Maximum accountID will always be the second account made or aka AccountName2
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT MAX(account_id) AS savings FROM account_details WHERE username='"
						+ transactionPojo.getTranUsername() + "'AND password='" + transactionPojo.getTranPassword()
						+ "'");
				if (rs.next()) {
					int saveAccountId = rs.getInt("savings");
					transactionPojo.setFromAccountId(saveAccountId);
				}
				ResultSet rs1 = st
						.executeQuery("SELECT MIN(account_id) AS toCheckings FROM account_details WHERE username='"
								+ transactionPojo.getTranUsername() + "'AND password='"
								+ transactionPojo.getTranPassword() + "'");
				if (rs1.next()) {
					int toCheckingsId = rs1.getInt("toCheckings");
					transactionPojo.setToAccountId(toCheckingsId);
					// String query = "SELECT account_id FROM account_details WHERE customer_id=" ;

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if (conn != null) {
				try {
					System.out.print("Transaction is being rolled back");
					conn.rollback();
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					throw new SystemException();
				}
				LOG.info("Exited transfer() in Transaction DAO");

			}
		}
		return null;
	}

	@Override
	public List<TransactionPojo> transactionHistory() throws SystemException {
		LOG.info("Entered transactionHistory in Transaction DAO");
		// TODO Auto-generated method stubConnection conn = DBUtil.getConnected();
		Connection conn = DBUtil.getConnected();
		List<TransactionPojo> history = new ArrayList<TransactionPojo>();
		try {
			Statement st = conn.createStatement();
			String query = "";

			String query2 = "SELECT * FROM transaction_details";
			ResultSet rs = st.executeQuery(query2);
			while (rs.next()) {
				TransactionPojo allInfo = new TransactionPojo(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),
						rs.getString(5));
				history.add(allInfo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SystemException();
		}
		LOG.info("Exited transactionHistory in Transaction DAO");
		return null;
	}
}