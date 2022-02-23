package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exceptions.NothingPending;
import exceptions.SystemException;
import pojo.AccountPojo;
import pojo.CustomerPojo;
import pojo.EmployeePojo;
import pojo.TransactionPojo;
import service.AccountService;
import service.AccountServiceImpl;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import service.TransactionService;
import service.TransactionServiceImpl;

public class BankMain {

	public static final Logger LOG = LogManager.getLogger(BankMain.class);

	public static void main(String[] args) {
		// Scanner class

		CustomerService customerService = new CustomerServiceImpl();
		EmployeeService employeeService = new EmployeeServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		TransactionService transactionService = new TransactionServiceImpl();
		AccountPojo login = new AccountPojo();
		AccountPojo account = new AccountPojo();
		CustomerPojo register = new CustomerPojo();
		EmployeePojo eLogin = new EmployeePojo();
		TransactionPojo transaction = new TransactionPojo();

		Scanner sc = new Scanner(System.in);
		// calling preLogin
		int answer;
		boolean flag = true;
		while (flag) {
			// Beginning login window

			System.out.println("Login as employee or a customer");
			System.out.println("1: for employee");
			System.out.println("2: for customer");
			answer = sc.nextInt();

			System.out.println("***********************************************************");
			sc.nextLine();// being skipped by sc.nextInt???
			if (answer == 1) {
				// Employee login window

				System.out.println("Welcome Employee please login");
				System.out.println("***********************************************************");
				System.out.println("Username : ");
				eLogin.setEmployeeUserName(sc.nextLine());
				System.out.println("Password : ");
				eLogin.setEmployeePassword(sc.nextLine());
				try {

					employeeService.employeeLogin(eLogin);
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					LOG.error(e);
					System.out.println(e.getMessage());
				}

				while (eLogin.isCheck() == true) {
					System.out.println("You have logged in thank you");
					System.out.println("What would you like to do? ");
					// when registering it needs to list all pending and there id number
					System.out.println("1. Register pending customers");
					System.out.println("2. View all customers");
					System.out.println("3. Exit System");
					System.out.println("***********************************************************");
					int choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
					case 1:

						System.out.println("Current pending customers");
						System.out.println("***********************************************************");
						List<CustomerPojo> pending;
						try {
							pending = employeeService.customersPending();

							Iterator<CustomerPojo> itr = pending.iterator();

							// print all pending customers
							while (itr.hasNext()) {
								CustomerPojo cp = itr.next();
								System.out.println("ID: " + cp.getCustomerId() + "\tFirst Name : "
										+ cp.getCustomerFirstName() + "\tLast Name : " + cp.getCustomerLastName()
										+ "\tAddress : " + cp.getCustomerAddress() + "\tEmail : "
										+ cp.getCustomerEmail() + "\tPhone Number : " + cp.getCustomerPhoneNumber()
										+ "\tSocial Security : " + cp.getCustomerSocial());

							}

						} catch (SystemException e) {
							// TODO Auto-generated catch block
							LOG.error(e);
							System.out.println(e.getMessage());
						} catch (NothingPending e) {
							// TODO Auto-generated catch block
							LOG.error(e);
							System.out.println(e.getMessage());
						}

						System.out.println("\nWould you like to approve or deny an account");
						System.out.println("a: for approve.");
						System.out.println("d: for deny");
						char app = sc.next().charAt(0);
						if (app == 'a') {
							System.out.println("Please enter the Id of the customer your approving");
							register.setCheck(true);
							register.setCustomerId(sc.nextInt());
							sc.nextLine();
							System.out.println("Please enter the starting balance of the account");
							account.setAccountBalance(sc.nextInt());
							sc.nextLine();

						} else if (app == 'd') {
							System.out.println("Please enter the Id of the customer your denying");
							register.setCheck(false);
							register.setCustomerId(sc.nextInt());
							sc.nextLine();
							try {
								employeeService.customerRegistration(register);
							} catch (SystemException e) {
								// TODO Auto-generated catch block
								LOG.error(e);
								System.out.println(e.getMessage());
							}
							break;
						} else {
							System.out.println("You have not entered an applicable choice");

							break;
						}

						System.out.println("***********************************************************");
						// it to the regular customer table and giving the customer a user and password
						System.out.println("Please give the user a Username for their account ");
						account.setAccountUsername(sc.nextLine());

						System.out.println("Please give the user a Password for their account");
						account.setAccountPassword(sc.nextLine());
						System.out.println("***********************************************************\n");

						System.out.println("What is the name of the checkings account: ");
						account.setAccountName(sc.nextLine());

						System.out.println("What is the name of the savings account: ");
						account.setAccountName2(sc.nextLine());

						try {
							employeeService.customerRegistration(register);
						} catch (SystemException e) {
							// TODO Auto-generated catch block
							LOG.error(e);
							System.out.println(e.getMessage());
						}
						try {
							accountService.accountCreate(account);
						} catch (SystemException e) {
							// TODO Auto-generated catch block
							LOG.error(e);
							System.out.println(e.getMessage());
						}
						break;
					case 2:
						// View all Customers information
						System.out.println("All current customers");
						List<CustomerPojo> allCust;
						try {
							allCust = employeeService.displayAllCustomers();
							Iterator<CustomerPojo> itr2 = allCust.iterator();

							while (itr2.hasNext()) {
								CustomerPojo ac = itr2.next();
								System.out.println("ID: " + ac.getCustomerId() + "  First Name: "
										+ ac.getCustomerFirstName() + "  Last Name: " + ac.getCustomerLastName()
										+ "  Address: " + ac.getCustomerAddress() + "  email: " + ac.getCustomerEmail()
										+ "  Phone Number: " + ac.getCustomerPhoneNumber() + "  Social: "
										+ ac.getCustomerSocial());
							}
							System.out.println("Those are all of the current Customers");
						} catch (SystemException e) {
							// TODO Auto-generated catch block
							LOG.error(e);
							System.out.println(e.getMessage());
						}

						break;
					case 3:
						System.out.println("************************************");
						System.out.println("Exiting System");
						System.out.println("Thank you");
						System.out.println("************************************");
						try {
							employeeService.exitApplication();
						} catch (SystemException e) {
							// TODO Auto-generated catch block
							LOG.error(e);
							System.out.println(e.getMessage());
						}

						System.exit(0);

					}

					System.out.println("Do you want to continue working(y/n) : ");
					char l = sc.next().charAt(0);
					if (l != 'y') {
						eLogin.setCheck(false);
						break;
					}

				}

			} else if (answer == 2) {

				// customer PreLogin window

				System.out.println();
				System.out.println("Welcome do you need to login or register for an account.");
				System.out.println("1 : to create account.");
				System.out.println("2 : to login to account");
				answer = sc.nextInt();
				sc.nextLine(); // being skipped by nextInt

				if (answer == 1) {

					// customer Account Creation

					System.out.println("************************************************************");
					CustomerPojo customerPending = new CustomerPojo();
					System.out.println(
							"\nTo register for your account please enter the following information for review :");
					System.out.println("First Name : ");
					customerPending.setCustomerFirstName(sc.nextLine());
					System.out.println("Last Name : ");
					customerPending.setCustomerLastName(sc.nextLine());
					System.out.println("Address : ");
					customerPending.setCustomerAddress(sc.nextLine());
					System.out.println("Email : ");
					customerPending.setCustomerEmail(sc.nextLine());
					System.out.println("Phone number : ");
					customerPending.setCustomerPhoneNumber(sc.nextLine());
					System.out.println("Social Security Number : ");
					customerPending.setCustomerSocial(sc.nextLine());
					try {
						customerService.creatingAccount(customerPending);
					} catch (SystemException e) {
						// TODO Auto-generated catch block
						LOG.error(e);
						System.out.println(e.getMessage());
					}

					System.out.println("\nThank you, please wait for your acount to be under review!");

					System.out.println("************************************************************");

				} else if (answer == 2) {
					// Customer Login window

					System.out.println("Welcome please login");
					System.out.println("Username : ");
					login.setAccountUsername(sc.nextLine());
					System.out.println("Password : ");
					login.setAccountPassword(sc.nextLine());

					try {
						accountService.accountLogin(login);
					} catch (SystemException e) {
						// TODO Auto-generated catch block
						LOG.error(e);
						System.out.println(e.getMessage());
					}
					while (login.isCheck() == true) {
						if (login.isCheck() == true) {

							System.out.println("You have logged in thank you");
							System.out.println("What would you like to do? ");
							// when registering it needs to list all pending and there id number
							System.out.println("1. Account details");
							System.out.println("2. Transfer money");
							System.out.println("3. View Transaction History");
							System.out.println("4. Exit system");
							System.out.println("******************************************************");
							int choice = sc.nextInt();
							sc.nextLine();
							switch (choice) {
							case 1:
								// display information such as balance
								// accountService.accountInfo(account.getAccountId());

								account.setAccountUsername(login.getAccountUsername());
								account.setAccountPassword(login.getAccountPassword());

								try {
									accountService.accountInfo(account);
								} catch (SystemException e) {
									// TODO Auto-generated catch block
									LOG.error(e);
									System.out.println(e.getMessage());
								}

								System.out.println(account.getAccountName() + " information");
								System.out.println("Balance: " + account.getAccountBalance());
								System.out.println(account.getAccountName2() + " information");
								System.out.println("Balance: " + account.getAccountBalance2());
								break;
							case 2:
								// Transfer money from either checking or savings to the other

								transaction.setTranUsername(login.getAccountUsername());
								transaction.setTranPassword(login.getAccountPassword());
								System.out.println("Which account do you wanna transfer money from");
								System.out.println("1: Checkings");
								System.out.println("2: Savings");
								int tran = sc.nextInt();
								sc.nextLine();
								if (tran == 1) {
									transaction.setCheck(false);
									System.out.println(
											"How much money do you want to transfer from you Checkings to Savings");
									transaction.setTransferAmount(sc.nextInt());
									System.out.println("Tranfer Complete.");

									try {
										transactionService.transfer(transaction);
									} catch (SystemException e) {
										// TODO Auto-generated catch block
										LOG.error(e);
										System.out.println(e.getMessage());
									}

								} else if (tran == 2) {
									transaction.setCheck(true);
									System.out.println(
											"How much money do you want to transfer from you Checkings to Savings");
									transaction.setTransferAmount(sc.nextInt());

									System.out.println("Tranfer Complete.");

									try {
										transactionService.transfer(transaction);
									} catch (SystemException e) {
										// TODO Auto-generated catch block
										LOG.error(e);
										System.out.println(e.getMessage());
									}

								}
								break;
							case 3:
								// view the transaction history of the account with the date
								TransactionPojo hist = new TransactionPojo();
								hist.setTranUsername(login.getAccountUsername());
								hist.setTranPassword(login.getAccountPassword());
								// transferService
								List<TransactionPojo> history;

								try {
									history = transactionService.transactionHistory(hist);
									Iterator<TransactionPojo> itr = history.iterator();
									while (itr.hasNext()) {
										TransactionPojo tp = itr.next();
										System.out.println("transaction id: " + tp.getTransaction_id()
												+ " From Account Id: " + tp.getFromAccountId() + " To Account ID: "
												+ tp.getToAccountId() + " Tranfer Amount: " + tp.getTransferAmount()
												+ " Date: " + tp.getDate());
									}
									System.out.println("Thats all of your transactions. ");
								} catch (SystemException e1) {
									LOG.error(e1);
									System.out.println(e1.getMessage());
								}
								break;
							case 4:

								System.out.println("************************************");
								System.out.println("Exiting System....");
								System.out.println("Thank you!");
								System.out.println("************************************");
								try {
									customerService.exitApplication();
								} catch (SystemException e) {
									// TODO Auto-generated catch block
									LOG.error(e);
									System.out.println(e.getMessage());
								}
								System.exit(0);

							}
							System.out.println("Do you want to continue working(y/n) : ");
							char l = sc.next().charAt(0);
							if (l != 'y') {
								login.setCheck(false);
								break;
							}

						} else {
							System.out.println("incorrect login, please try again.");
						}

					}
				}
				// switch()

			} else {
				System.out.println("You have not entered a choice try again!\n");

			}
			System.out.println("Do you want to login (y/n) : ");
			char cont = sc.next().charAt(0);
			if (cont != 'y') {
				flag = false;
			}

		}

		sc.close();
		System.out.println("*****************************************");
		System.out.println("Exiting System....");
		System.out.println("Thankyou for using Banking System");
		System.out.println("*****************************************");

	}
}
