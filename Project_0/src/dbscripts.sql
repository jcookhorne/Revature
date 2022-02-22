String query = "INSERT INTO customer_pending(first_name, last_name, address, email, phone_number, social_security) VALUES('"
					+ customerPojo.getCustomerFirstName() + "','" + customerPojo.getCustomerLastName() + "','"
					+ customerPojo.getCustomerAddress() + "','" + customerPojo.getCustomerEmail() + "','"
					+ customerPojo.getCustomerPhoneNumber() + "','" + customerPojo.getCustomerSocial() + "')";