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
				conn.setAutoCommit(false);
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
				// Changing actual money
				// subtraction/withdraw
				ResultSet res2 = st.executeQuery("SELECT account_balance FROM account_details WHERE account_id="
						+ transactionPojo.getFromAccountId());
				if (res2.next()) {
					int oldBalance = res2.getInt(1);
					int newBalance = oldBalance - transactionPojo.getTransferAmount();
					String query = "UPDATE account_details SET account_balance =" + newBalance + "WHERE account_id="
							+ transactionPojo.getFromAccountId();
					int res3 = st.executeUpdate(query);
					conn.commit();
					if (newBalance < 0) {
						conn.rollback();
					}

				}
				// adding money
				ResultSet res4 = st.executeQuery("SELECT account_balance FROM account_details WHERE account_id="
						+ transactionPojo.getToAccountId());
				if (res4.next()) {
					int oldBalance = res4.getInt(1);
					int newBalance = oldBalance + transactionPojo.getTransferAmount();
					String query = "UPDATE account_details SET account_balance =" + newBalance + "WHERE account_id="
							+ transactionPojo.getToAccountId();
					int res5 = st.executeUpdate(query);
					conn.commit();
				}
				String query2 ="INSERT INTO transaction_detail(from_account_id, to_account_id, transfer_amount) VALUES ("
								+ transactionPojo.getFromAccountId() + "," + transactionPojo.getToAccountId() + ","
								+ transactionPojo.getTransferAmount() + ")";
				int res6 = st.executeUpdate(query2);
				
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new SystemException();

		}

		
		try {
			// Savings check
			if (transactionPojo.isCheck() == true) {
				conn.setAutoCommit(false);
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
				ResultSet rs2 = st.executeQuery("SELECT account_balance FROM account_details WHERE account_id="
						+ transactionPojo.getFromAccountId());
				if (rs2.next()) {
					int oldBalance = rs2.getInt(1);
					int newBalance = oldBalance - transactionPojo.getTransferAmount();
					String query = "UPDATE account_details SET account_balance =" + newBalance + "WHERE account_id="
							+ transactionPojo.getFromAccountId();
					int rs3 = st.executeUpdate(query);

				}

				ResultSet rs4 = st.executeQuery("SELECT account_balance FROM account_details WHERE account_id="
						+ transactionPojo.getToAccountId());
				if (rs4.next()) {
					int oldBalance = rs4.getInt(1);
					int newBalance = oldBalance + transactionPojo.getTransferAmount();
					String query = "UPDATE account_details SET account_balance =" + newBalance + "WHERE account_id="
							+ transactionPojo.getToAccountId();
					int rs5 = st.executeUpdate(query);
				}
				
				String query2 ="INSERT INTO transaction_detail(from_account_id, to_account_id, transfer_amount) VALUES ("
						+ transactionPojo.getFromAccountId() + "," + transactionPojo.getToAccountId() + ","
						+ transactionPojo.getTransferAmount() + ")";
				int rs6 = st.executeUpdate(query2);
				conn.commit();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			try {
				{
					conn.rollback();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// throw new SystemException();
			}
		}
		return null;

	}

	@Override
	public List<TransactionPojo> transactionHistory(TransactionPojo transactionPojo) throws SystemException {
		LOG.info("Entered transactionHistory in Transaction DAO");
		// TODO Auto-generated method stubConnection conn = DBUtil.getConnected();
		Connection conn = DBUtil.getConnected();
		List<TransactionPojo> history = new ArrayList<TransactionPojo>();
		try {
			Statement st = conn.createStatement();
			ResultSet res = st.executeQuery("SELECT MIN(account_id) AS checkings FROM account_details WHERE username='"
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
			String query = "SELECT * FROM transaction_detail WHERE from_account_id="+ transactionPojo.getFromAccountId()+" OR from_account_id="
					+ transactionPojo.getToAccountId();
			ResultSet resu = st.executeQuery(query);
			while (resu.next()) {
				TransactionPojo allInfo = new TransactionPojo(resu.getInt(1), resu.getInt(2), resu.getInt(3), resu.getInt(4),
						resu.getString(5));
				history.add(allInfo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			throw new SystemException();
		}
		LOG.info("Exited transactionHistory in Transaction DAO");
		return history;
	}
}